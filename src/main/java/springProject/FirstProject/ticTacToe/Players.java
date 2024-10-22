package springProject.FirstProject.ticTacToe;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Players {
    private int id;
    private PlayingPiece playingPiece;
    Players(int id,PlayingPiece playingPiece){
        this.id=id;
        this.playingPiece=playingPiece;
    }
}
