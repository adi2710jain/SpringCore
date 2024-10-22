package springProject.FirstProject.ticTacToe;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PlayingBoard {
    private int size;
    private PlayingPieceVal [][] playingPieceboard;
    PlayingBoard(int size){
        this.size=size;
        playingPieceboard=new PlayingPieceVal[size][size];
    }
    public void setBoard(int size){
        this.size=size;
        playingPieceboard=new PlayingPieceVal[size][size];
    }
    
}
