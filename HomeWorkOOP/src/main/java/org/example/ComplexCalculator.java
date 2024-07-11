package org.example;

import java.util.logging.Logger;

public class ComplexCalculator {
    private static final Logger logger = Logger.getLogger(String.valueOf(ComplexCalculator.class));

    public static <Complexnumber> void main(String[] args) {

// Создаем комплексные числа
        ComplexNumber number1 = new ComplexNumber(3, 2);
        ComplexNumber number2 = new ComplexNumber(1, -4);

// Выполняем операции над комплексными числами
        ComplexNumber sum = number1.add(number2);
        logger.info("Sum: " + sum.getReal() + " + " + sum.getImaginary() + "i");

        ComplexNumber product = number1.multiply(number2);
        logger.info("Product: " + product.getReal() + " + " + product.getImaginary() + "i");

        try {
            Complexnumber quotient = (Complexnumber) number1.divide(number2);
            logger.info("Quotient:" +
                    Math.round(((Complexnumber) quotient).getReal() * 10) / 10. +
                    "+" +
                    Math.round(((Complexnumber) quotient).getImaginary() * 10) / 10. +
                    "i");
        } catch (ArithmeticException e) {
            logger.error(e.getMessage());
        }
    }
}
