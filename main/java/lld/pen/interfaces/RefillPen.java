package lld.pen.interfaces;

import lld.pen.models.Refill;

public interface RefillPen {
    
    public void changeRefill();
    public Refill getRefill();
    public Boolean canRefill();
}
