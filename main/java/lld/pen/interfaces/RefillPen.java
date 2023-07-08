package lld.pen.interfaces;

import lld.pen_v2.godpen.models.Refill;

public interface RefillPen {
    
    public void changeRefill(Refill reffill);
    public boolean canRefill();
    public Refill getRefill();
}
