package lld.pen_v2.godpen_v2;

import lld.pen_v2.godpen.models.PenType;
import lld.pen_v2.godpen.models.Refill;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Pen {
    private String brand;
    private String name;
    private PenType type;
    private Double price;
    private Boolean isRefillable;

    public abstract void write();
    public abstract void changeRefill(Refill refill);
}
