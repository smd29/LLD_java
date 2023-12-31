package lld.pen.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Ink {
    private String color;
    private Integer quantity;
    private InkType type;
}
