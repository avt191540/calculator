package pro.sky.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static pro.sky.calculator.constants.CalculatorServiceImplTestConstants.*;
import static pro.sky.calculator.constants.CalculatorServiceImplTestConstants.RESULT_MULTIPLY_TYPE2;

public class CalculatorServiceImplParameterizedTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    public static Stream<Arguments> provideParamsForPlusTests() {
        return Stream.of(Arguments.of(NUM1_TYPE1, NUM2_TYPE1, RESULT_PLUS_TYPE1),
                Arguments.of(NUM1_TYPE2, NUM2_TYPE2, RESULT_PLUS_TYPE2));
    }
    @ParameterizedTest
    @MethodSource("provideParamsForPlusTests")
    public void getPlusShouldGenerateCorrectResult(int num1, int num2, int expectedResult) {
        int result = out.getPlus(num1, num2);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> provideParamsForMinusTests() {
        return Stream.of(Arguments.of(NUM1_TYPE1, NUM2_TYPE1, RESULT_MINUS_TYPE1),
                Arguments.of(NUM1_TYPE2, NUM2_TYPE2, RESULT_MINUS_TYPE2));
    }
    @ParameterizedTest
    @MethodSource("provideParamsForMinusTests")
    public void getMinusShouldGenerateCorrectResult(int num1, int num2, int expectedResult) {
        int result = out.getMinus(num1, num2);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> provideParamsForMultiplyTests() {
        return Stream.of(Arguments.of(NUM1_TYPE1, NUM2_TYPE1, RESULT_MULTIPLY_TYPE1),
                Arguments.of(NUM1_TYPE2, NUM2_TYPE2, RESULT_MULTIPLY_TYPE2));
    }
    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTests")
    public void getMultiplyShouldGenerateCorrectResult(int num1, int num2, int expectedResult) {
        int result = out.getMultiply(num1, num2);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> provideParamsForDivideTests() {
        return Stream.of(Arguments.of(NUM1_TYPE1, NUM2_TYPE1, RESULT_DIVIDE_TYPE1),
                Arguments.of(NUM1_TYPE2, NUM2_TYPE2, RESULT_DIVIDE_TYPE2));
    }
    @ParameterizedTest
    @MethodSource("provideParamsForDivideTests")
    public void getDivideShouldGenerateCorrectResult(int num1, int num2, double expectedResult) {
        double result = out.getDivide(num1, num2);
        Assertions.assertEquals(expectedResult, result);
    }
}
