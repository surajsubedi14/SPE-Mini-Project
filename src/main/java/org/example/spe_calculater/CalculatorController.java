package org.example.spe_calculater;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="http://localhost:3000")
//@RequestMapping("/cal")
public class CalculatorController {
    // Square root function - √x
    @GetMapping("/sqrt")
    public double squareRoot(@RequestParam double x) {
        return Math.sqrt(x);
    }
    // Factorial function - x!
    @GetMapping("/factorial")
    public long factorial(@RequestParam int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }
    // Natural logarithm (base е) - ln(x)
    @GetMapping("/log")
    public double naturalLogarithm(@RequestParam double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Natural logarithm is not defined for non-positive numbers.");
        }
        return Math.log(x);
    }

    // Power function - xb
    @GetMapping("/power")
    public double power(@RequestParam double x, @RequestParam double b) {
        return Math.pow(x, b);
    }
}


