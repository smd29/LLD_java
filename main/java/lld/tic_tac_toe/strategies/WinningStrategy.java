package lld.tic_tac_toe.strategies;

import java.util.List;

import lld.tic_tac_toe.models.Board;
import lld.tic_tac_toe.models.Player;

public interface WinningStrategy {
    public Player checkWinner(Board board, List<Player> players);
}
