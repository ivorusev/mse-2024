package com.mse.drawer.shapes;

import lombok.*;

import java.awt.*;

/**
* Base class for all shapes.
*/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Shape {

   /**
    * The point at which the shape is located.
    */
   protected Point point;
}
