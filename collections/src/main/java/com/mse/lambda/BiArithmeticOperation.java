package com.mse.lambda;


/**
* A functional interface that represents a binary arithmetic operation on two operands of the same type,
* producing a result of the same type.
*
* @param <T> the type of the operands and the result
*/
@FunctionalInterface
public interface BiArithmeticOperation<T> {

   /**
    * Applies the operation to the given operands.
    *
    * @param first  the first operand
    * @param second the second operand
    * @return the result of the operation
    */
   T execute(T first, T second);

}
