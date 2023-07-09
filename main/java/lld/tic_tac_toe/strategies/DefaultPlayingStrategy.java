package lld.tic_tac_toe.strategies;

import lld.tic_tac_toe.models.Board;
import lld.tic_tac_toe.models.BoardCell;

public class DefaultPlayingStrategy implements PlayingStrategy{

    @Override
    public BoardCell play(Board board) {
        System.out.println("Default Playing Strategy");
        return null;
    }
    
}
