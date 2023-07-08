package lld.pen_v2.godpen_v2;

import lld.pen_v2.godpen.models.Ink;
import lld.pen_v2.godpen.models.Nib;
import lld.pen_v2.godpen.models.PenType;
import lld.pen_v2.godpen.models.Refill;
import lombok.Getter;

@Getter
public class FountainPen extends Pen{
    private Ink ink;
    private Nib nib;
    public FountainPen(String brand, String name, Double price, Ink ink, Nib nib) {
        super(brand, name, PenType.FOUNTAIN, price, true);
        this.ink = ink;
        this.nib = nib;
    }

    @Override
    public void changeRefill(Refill refill) {
        throw new UnsupportedOperationException("Fountain Pen Doesn't allow changing refill");
        // Violating Liskov
    }

    @Override
    public void write() {
        System.out.println("Fountain Pen writing");
    }
    
}
