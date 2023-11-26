package com.mse.intoduction.drawer.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Square extends Shape {

    private int side;

    public Square(Point point, int side) {
        super(point);
        this.side = side;
    }
}
