package lld.tic_tac_toe.models;

import lld.tic_tac_toe.strategies.PlayingStrategy;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
public class BotPlayer extends Player{
    
    private PlayingStrategy playingStrategy;

    @Override
    public BoardCell play(Board board) {
        System.out.println("Bot Playing");
    }

}
