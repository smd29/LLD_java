package lld.tic_tac_toe.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardCell {
    private Integer rows;
    private Integer cols;
    private GameSymbol symbol;
}
