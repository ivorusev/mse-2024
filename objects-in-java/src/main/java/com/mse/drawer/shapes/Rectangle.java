package com.mse.drawer.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
* Rectangle class extends the Square class and represents a rectangle shape.
* It has an additional private field called "secondSide" to store the length of the second side of the rectangle.
*/
@Getter
@Setter
@AllArgsConstructor
public class Rectangle extends Square {

   /**
    * The length of the second side of the rectangle.
    */
   private int secondSide;

}
