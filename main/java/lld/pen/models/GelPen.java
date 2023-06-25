package lld.pen.models;

import lld.pen.interfaces.RefillPen;
import lld.pen.stretegies.SmoothWritingStrategy;
import lld.pen.stretegies.WritingStrategy;

public class GelPen extends Pen implements RefillPen{

    public GelPen(String name, String brand, Double price) {
        super(name, brand, price, PenType.GEL, new SmoothWritingStrategy());
        //TODO Auto-generated constructor stub
    }


    @Override
    public void changeRefill() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changeRefill'");
    }

    @Override
    public Refill getRefill() {
        return new Refill(null, null, null)
    }

    @Override
    public Boolean canRefill() {
        return true;
    }
    

}
