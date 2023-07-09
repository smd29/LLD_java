package lld.tic_tac_toe.strategies;

import lld.tic_tac_toe.models.Board;
import lld.tic_tac_toe.models.BoardCell;

public interface PlayingStrategy {
    BoardCell play(Board board);
}
