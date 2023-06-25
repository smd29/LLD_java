package lld.pen.models;

import lld.pen.stretegies.SmoothWritingStrategy;
import lld.pen.stretegies.WritingStrategy;

public class FountainPen extends Pen{

    public FountainPen(String name, String brand, Double price) {
        super(name, brand, price, PenType.FOUNTAIN, new SmoothWritingStrategy());
    }
    
}
