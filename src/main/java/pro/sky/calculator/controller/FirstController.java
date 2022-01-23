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
    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return (num1 + " - " + num2 + " = " + calculatorService.getMinus(num1, num2));
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return (num1 + " * " + num2 + " = " + calculatorService.getMultiply(num1, num2));
    }
    @GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
//        if (num2 != 0) {
            return (num1 + " / " + num2 + " = " + calculatorService.getDivide(num1, num2));
//        } else return "Ошибка: деление на 0 запрещено. Измените значение num2";
    }
}
