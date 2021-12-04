package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    private int result;

    @Override
    public int getPlus(int num1, int num2) {
        result = num1 + num2;
        return result;
    }
}
