package com.mse.lambda;


/**
* A class containing utility methods for performing arithmetic operations.
*/
public class ArithmeticUtils {

   /**
    * A functional interface representing a binary arithmetic operation.
    *
    * @param <T> the type of the operands and the result of the operation
    */
   @FunctionalInterface
   private interface BiArithmeticOperation<T> {

       /**
        * Executes the arithmetic operation on the given operands.
        *
        * @param a the first operand
        * @param b the second operand
        * @return the result of the operation
        */
       T execute(T a, T b);
   }

   /**
    * The sum operation for integers.
    */
   private static final BiArithmeticOperation<Integer> SUM_OPERATION = Integer::sum;

   /**
    * The multiply operation for integers.
    */
   private static final BiArithmeticOperation<Integer> MULTIPLY_OPERATION = (a, b) -> a * b;

   /**
    * Sums two integers.
    *
    * @param firstNumber  the first number
    * @param secondNumber the second number
    * @return the sum of the two numbers
    */
   public static int sum(int firstNumber, int secondNumber) {
       return SUM_OPERATION.execute(firstNumber, secondNumber);
   }

   /**
    * Multiplies two integers.
    *
    * @param firstNumber  the first number
    * @param secondNumber the second number
    * @return the product of the two numbers
    */
   public static int multiply(int firstNumber, int secondNumber) {
       return MULTIPLY_OPERATION.execute(firstNumber, secondNumber);
   }
}
