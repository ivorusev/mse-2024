package com.mse.intoduction.drawer.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;


/**
* Represents a square shape.
*/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Square extends Shape {

   /**
    * The length of the side of the square.
    */
   private int side;

   /**
    * Constructs a square with the specified point as its center and the specified side length.
    *
    * @param point The center point of the square.
    * @param side The length of the side of the square.
    */
   public Square(Point point, int side) {
       super(point);
       this.side = side;
   }
}
