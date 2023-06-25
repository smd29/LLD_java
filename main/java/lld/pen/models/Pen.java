package lld.pen.models;

import lld.pen.stretegies.WritingStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public abstract class Pen {
    
    private String name;
    private String brand;
    private Double price;
    private PenType type;

    // Strategy design pattern
    private WritingStrategy writingStrategy;

    public void write(){
        writingStrategy.write();
    }
}
