package lld.pen.withInterface;

import lld.pen.strategies.SmoothWritingStrategy;
import lld.pen.strategies.WritingStrategy;
import lld.pen_v2.godpen.models.Ink;
import lld.pen_v2.godpen.models.Nib;
import lld.pen_v2.godpen.models.PenType;
import lombok.Getter;

@Getter
public class FountainPen extends Pen{
    private Ink ink;
    private Nib nib;
    public FountainPen(String brand, String name, PenType type, Double price, Ink ink2, Nib nib2) {
        super(brand, name, PenType.FOUNTAIN, price, new SmoothWritingStrategy());
        this.ink = ink2;
        this.nib = nib2;
    }

    public FountainPen(String brand, String name, PenType fountain, double price, Ink ink2, Nib nib2) {
    }

    public void changeInk(Ink ink){
        this.ink = ink;
    }

}
