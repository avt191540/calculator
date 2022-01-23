package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    private int result;
    private double result1;

    @Override
    public int getPlus(int num1, int num2) {
        result = num1 + num2;
        return result;
    }
    @Override
    public int getMinus(int num1, int num2) {
        result = num1 - num2;
        return result;
    }
    @Override
    public int getMultiply(int num1, int num2) {
        result = num1 * num2;
        return result;
    }
    @Override
    public double getDivide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Invalid value of the second argument: 0");
        }
        result1 = (double) num1 / num2;
        return result1;
    }
}
