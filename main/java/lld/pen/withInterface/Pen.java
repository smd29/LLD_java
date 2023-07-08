package lld.pen.withInterface;

import lld.pen.strategies.WritingStrategy;
import lld.pen_v2.godpen.models.PenType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@AllArgsConstructor
@SuperBuilder
public abstract class Pen {
    private String brand;
    private String name;
    private PenType type;
    private Double price;
    private WritingStrategy writingStrategy;

    public void write() {
        writingStrategy.write();
    }
}
