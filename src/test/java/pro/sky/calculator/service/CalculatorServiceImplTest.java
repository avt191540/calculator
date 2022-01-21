package pro.sky.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.calculator.constants.CalculatorServiceImplTestConstants.*;

class CalculatorServiceImplTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    void getPlusType1() {
        int result = out.getPlus(NUM1_TYPE1, NUM2_TYPE1);
        Assertions.assertEquals(RESULT_PLUS_TYPE1, result);
    }

    @Test
    void getPlusType2() {
        int result = out.getPlus(NUM1_TYPE2, NUM2_TYPE2);
        Assertions.assertEquals(RESULT_PLUS_TYPE2, result);
    }

    @Test
    void getMinusType1() {
        int result = out.getMinus(NUM1_TYPE1, NUM2_TYPE1);
        Assertions.assertEquals(RESULT_MINUS_TYPE1, result);
    }
    @Test
    void getMinusType2() {
        int result = out.getMinus(NUM1_TYPE2, NUM2_TYPE2);
        Assertions.assertEquals(RESULT_MINUS_TYPE2, result);
    }

    @Test
    void getMultiplyType1() {
        int result = out.getMultiply(NUM1_TYPE1, NUM2_TYPE1);
        Assertions.assertEquals(RESULT_MULTIPLY_TYPE1, result);
    }

    @Test
    void getMultiplyType2() {
        int result = out.getMultiply(NUM1_TYPE2, NUM2_TYPE2);
        Assertions.assertEquals(RESULT_MULTIPLY_TYPE2, result);
    }

    @Test
    void getDivideType1() {
        double result = out.getDivide(NUM1_TYPE1, NUM2_TYPE1);
        Assertions.assertEquals(RESULT_DIVIDE_TYPE1, result);
    }

    @Test
    void getDivideType2() {
        double result = out.getDivide(NUM1_TYPE2, NUM2_TYPE2);
        Assertions.assertEquals(RESULT_DIVIDE_TYPE2, result);
    }

    @Test
    void getDivideIfDivisorIsZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> out.getDivide(NUM1_TYPE1, NUM2_ZERO));
    }

}