package lld.pen_v2.godpen_v2;

import lld.pen_v2.godpen.models.PenType;
import lld.pen_v2.godpen.models.Refill;
import lombok.Getter;

@Getter
public class GelPen extends Pen{

    public GelPen(String brand, String name, Double price, Refill refill) {
        super(brand, name, PenType.GEL, price, true);
        this.refill = refill;
    }

    private Refill refill;
    @Override
    public void changeRefill(Refill refill) {
        if(!getIsRefillable()){
            throw new UnsupportedOperationException();
        }
        this.refill = refill;
    }

    @Override
    public void write() {
        System.out.println("Gel pen write");
    }
        
}
