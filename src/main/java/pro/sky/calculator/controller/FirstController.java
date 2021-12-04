package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class FirstController {
    private final CalculatorService calculatorService;

    public FirstController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

@GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping("/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return (num1 + " + " + num2 + " = " + calculatorService.getPlus(num1, num2));
    }

}
