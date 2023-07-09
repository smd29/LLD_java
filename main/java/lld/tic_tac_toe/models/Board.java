package lld.tic_tac_toe.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {
    List<List<BoardCell>> cells = new ArrayList<>();

    public Board(int rows, int cols){
        List<BoardCell> columnCells = Collections.nCopies(cols, new BoardCell());
        List<List<BoardCell>> rowCells = Collections.nCopies(rows, columnCells);
        this.cells = rowCells;
    }
}
