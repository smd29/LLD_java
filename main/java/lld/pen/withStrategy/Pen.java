package lld.pen.withStrategy;

import lld.pen.strategies.WritingStrategy;
import lld.pen_v2.godpen.models.PenType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
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
