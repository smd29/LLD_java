package lld.pen_v2.godpen.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Refill {
    private RefillType type;
    private Ink ink;
    private Nib nib;
}
