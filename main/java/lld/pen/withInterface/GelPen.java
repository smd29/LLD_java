package lld.pen.withInterface;

import lld.pen.interfaces.RefillPen;
import lld.pen.strategies.SmoothWritingStrategy;
import lld.pen_v2.godpen.models.PenType;
import lld.pen_v2.godpen.models.Refill;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class GelPen extends Pen implements RefillPen{

    private Refill refill;

    public GelPen(String brand, String name, Double price, Refill refill) {
        super(brand, name, PenType.GEL, price, new SmoothWritingStrategy());
        this.refill = refill;
    }

    @Override
    public void changeRefill(Refill reffill) {
        if(this.canRefill()){
            this.refill = reffill;
        }
    }

    @Override
    public boolean canRefill() {
        return true;
    }

    @Override
    public Refill getRefill() {
        return refill;
    }

    public GelPen(String brand, String name, double price, lld.pen.models.Refill refill2) {
    }
    
}
