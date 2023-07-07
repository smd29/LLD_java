package lld.pen_v2.godpen;

import lld.pen_v2.godpen.models.Ink;
import lld.pen_v2.godpen.models.Nib;
import lld.pen_v2.godpen.models.PenType;
import lld.pen_v2.godpen.models.Refill;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Pen {
    private String brand;
    private String name;
    private PenType type;
    private Double price;
    private Boolean isRefillable;
    private Refill refill;
    private Ink ink;
    private Nib nib;

    public void write(){
        // switch(type)
    }

    public void changeRefill(Refill refill){
        if (type == PenType.FOUNTAIN){
            throw new UnsupportedOperationException("Fountain Pen is not refillable");
        }
        if (!isRefillable){
            throw new UnsupportedOperationException("Pen is not refillable");
        }
        this.refill = refill;
    }

    public static Pen gelPen(String brand, String name, Double price, Refill refill){
        return new Pen("Parker", "GelPen", PenType.GEL, 100.0, true, refill, null, null);
    }
}
