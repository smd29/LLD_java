package lld.tic_tac_toe.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
public class HumanPlayer extends Player{
    
    private User user;

    @Override
    public BoardCell play(Board board) {
        System.out.println("Human Playing");
        return null;
    }
    
}
