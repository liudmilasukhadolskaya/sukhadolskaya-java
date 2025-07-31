package by.itacademy.sukhadolskaya;

import org.junit.jupiter.api.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void createCalculatorInstance() {
        calculator = new Calculator();
    }

    @Test
    @Order(1)
    @DisplayName("Тест сложения: -9 + 10 = 1")
    public void testSum1() {
        int actual = calculator.sum(-9, 10);
        Assertions.assertEquals(1, actual);
    }

    @Test
    @Order(2)
    @DisplayName("Тест сложения с переполнением: Integer.Max_Value + 1 = 0")
    public void testSum2() {
        int actual = calculator.sum(Integer.MAX_VALUE, 1);
        Assertions.assertEquals(0, actual);
    }

    @Test
    @Order(3)
    @DisplayName("Тест сложения: 10 + 3 = 13")
    public void testSum3() {
        int actual = calculator.sum(10, 3);
        Assertions.assertEquals(13, actual);
    }

    @Test
    @Order(4)
    @DisplayName("Тест сложения: -5 + (-6) = -11")
    public void testSum4() {
        int actual = calculator.sum(-5, -6);
        Assertions.assertEquals(-11, actual);
    }

    @Test
    @Order(5)
    @DisplayName("Тест умножения: 6 * (-3) = -18")
    public void testMultiply1() {
        int actual = calculator.multiply(6, -3);
        Assertions.assertEquals(-18, actual);
    }

    @Test
    @Order(6)
    @DisplayName("Тест умножения с переполнением: 5 * Integer.Max_Value = 0")
    public void testMultiply2() {
        int actual = calculator.multiply(5, Integer.MAX_VALUE);
        Assertions.assertEquals(0, actual);
    }

    @Test
    @Order(7)
    @DisplayName("Тест умножения: 5 * 3 = 15")
    public void testMultiply3() {
        int actual = calculator.multiply(5, 3);
        Assertions.assertEquals(15, actual);
    }

    @Test
    @Order(8)
    @DisplayName("Тест умножения: -2 * (-3) = 6")
    public void testMultiply4() {
        int actual = calculator.multiply(-2, -3);
        Assertions.assertEquals(6, actual);
    }

    @Test
    @Order(9)
    @DisplayName("Тест деления: 6 /(- 5) = -1.2")
    public void testDivide1() {
        double actual = calculator.divide(6, -5);
        Assertions.assertEquals(-1.2, actual, 0.0001);
    }

    @Test
    @Order(10)
    @DisplayName("Тест деления на 0: 6 / 0 = 0.0")
    public void testDivide2() {
        double actual = calculator.divide(6, 0);
        Assertions.assertEquals(0.0, actual);
    }

    @Test
    @Order(11)
    @DisplayName("Тест деления 0 на 0: 0 / 0 = 0.0")
    public void testDivide3() {
        double actual = calculator.divide(0, 0);
        Assertions.assertEquals(0.0, actual);
    }

    @Test
    @Order(12)
    @DisplayName("Тест деления : 6 / 3 = 2.0")
    public void testDivide4() {
        double actual = calculator.divide(6, 3);
        Assertions.assertEquals(2.0, actual, 0.0001);
    }

    @Test
    @Order(13)
    @DisplayName("Тест вычитания: 10 - 13 = -3")
    public void testSubtract1() {
        int actual = calculator.subtract(10, 13);
        Assertions.assertEquals(-3, actual);
    }

    @Test
    @Order(14)
    @DisplayName("Тест вычитания с переполнением: Integer.Min_Value - 1 = 0")
    public void testSubtract2() {
        int actual = calculator.subtract(Integer.MIN_VALUE, 1);
        Assertions.assertEquals(0, actual);
    }

    @Test
    @Order(15)
    @DisplayName("Тест вычитания: 14 - 2 = 12")
    public void testSubtract3() {
        int actual = calculator.subtract(14, 2);
        Assertions.assertEquals(12, actual);
    }

    @Test
    @Order(16)
    @DisplayName("Тест вычитания: -10 - (-2) = -8")
    public void testSubtract4() {
        int actual = calculator.subtract(-10, -2);
        Assertions.assertEquals(-8, actual);
    }
}
