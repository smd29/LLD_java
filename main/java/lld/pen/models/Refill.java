package lld.pen.models;

import lld.pen_v2.godpen.models.Ink;
import lld.pen_v2.godpen.models.Nib;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class Refill {
    public Refill(boolean refillable2, lld.pen.models.Ink ink2, lld.pen.models.Nib nib2) {
    }
    private boolean refillable;
    private Ink ink;
    private Nib nib;
}
