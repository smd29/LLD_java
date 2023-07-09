package lld.tic_tac_toe.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
public abstract class Player {
    private GameSymbol symbol;
    public abstract BoardCell play(Board board);
}
