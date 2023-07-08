package lld.pen_v2.godpen.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Ink {

    private String color;
    private String brand;
    private InkType type;
}
