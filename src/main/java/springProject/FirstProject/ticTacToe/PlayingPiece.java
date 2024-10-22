package springProject.FirstProject.ticTacToe;

public class PlayingPiece {
    PlayingPieceVal playingPieceVal;
    public PlayingPiece(PlayingPieceVal val){
        playingPieceVal=val;
    }

    public void setPlayingPieceVal(PlayingPieceVal playingPieceVal) {
        this.playingPieceVal = playingPieceVal;
    }

    public PlayingPieceVal getPlayingPieceVal() {
        return playingPieceVal;
    }
}
