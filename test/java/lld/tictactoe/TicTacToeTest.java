package lld.tictactoe;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import lld.tic_tac_toe.models.BoardCell;
import lld.tic_tac_toe.models.BotPlayer;
import lld.tic_tac_toe.models.Game;
import lld.tic_tac_toe.models.GameSymbol;
import lld.tic_tac_toe.models.HumanPlayer;
import lld.tic_tac_toe.models.User;
import lld.tic_tac_toe.strategies.DefaultPlayingStrategy;

public class TicTacToeTest {
    private Game game;

    @Before
    public void setUp(){
        this.game = createGame();
    }

    private Game createGame(){
        HumanPlayer humanPlayer = HumanPlayer.builder().symbol(GameSymbol.X).user(new User()).build();
        
        BotPlayer botPlayer = BotPlayer.builder().symbol(GameSymbol.O).playingStrategy(new DefaultPlayingStrategy()).build();

        Game game = Game.getBuilder().withDimension(3, 3).withPlayer(botPlayer).withPlayer(humanPlayer).build();

        return game;
    }

    @Test
    public void testDimensions(){
        List<List<BoardCell>> cells = game.getBoard().getCells();
        assertEquals("If board is created, number of rows should be equal to input", 3, cells.size());

        List<BoardCell> firstRow = cells.get(0);
        assertEquals("If board is created, number of columns should be equal to input", 3, firstRow.size());
    }
}
