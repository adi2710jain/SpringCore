package springProject.FirstProject.ticTacToe;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class PlayingGame {
    private List<Players> playersList;
    private PlayingBoard board;
    private Map<Integer,Players> playersMap;
    Deque<Players> playersQueue;

    public PlayingGame(){
        this.playersMap=new HashMap<>();
        this.playersQueue=new ArrayDeque<>();
        this.board=new PlayingBoard();
        this.playersList=new ArrayList<>();
    }

    public void initilaizeGame(){
        Scanner sc=new Scanner(System.in);
        System.out.println("The Game has been Started");
        System.out.println("Please enter the board size: ");
        int size=sc.nextInt();
        board.setBoard(size);
        System.out.println("Please enter the no of players: ");
        int players=sc.nextInt();
        while (players>0){
            System.out.println("Please enter the players info: ");
            System.out.println("  please enter the playerId:");
            int id=sc.nextInt();
            System.out.print(" please enter the player Goti:");
            String playingPieceInfo=sc.next();
            PlayingPieceVal playingPieceVal=PlayingPieceVal.valueOf(playingPieceInfo);
            PlayingPiece playingPiece=new PlayingPiece(playingPieceVal);
            Players player=new Players(id,playingPiece);
            playersList.add(player);
            playersMap.put(id,player);
            players--;
        }
        System.out.println("Please enter who will play when");
        players=playersList.size();
        while(players>0){
            System.out.println("Please enter your id:");
            int id=sc.nextInt();
            Players playersInfo=playersMap.get(id);
            if(playersInfo==null){
                System.out.println("Player has already choose his turn");
            }
            playersMap.put(id,null);
            playersQueue.add(playersInfo);
            players--;
        }
    }

    public void startGame(){
        boolean hasWon=false;
        boolean hasspace=true;
        int s=board.getSize() * board.getSize();
        while(!hasWon && s>0){
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter the row and col where you want to play: ");
            int row=sc.nextInt();
            int col=sc.nextInt();
            boolean boundaryCheck=checkForValidPlaces(row,col);
            boolean isEmptyPlace=false;
            if(boundaryCheck)
                isEmptyPlace=checkforEmpty(row,col);
            Players player = playersQueue.remove();
            if(!isEmptyPlace || !boundaryCheck){
                while(!isEmptyPlace){
                    System.out.println("Please enter the row and col again where you want to play: ");
                    row=sc.nextInt();
                    col=sc.nextInt();
                    boundaryCheck=checkForValidPlaces(row,col);
                    if(boundaryCheck)
                        isEmptyPlace=checkforEmpty(row,col);
                }
            }

            board.getPlayingPieceboard()[row][col]=player.getPlayingPiece().getPlayingPieceVal();
            showBoard();
            hasWon=checkForWin(row,col);
            s--;
            if(hasWon)
            {
                System.out.println("We found the winner: "+player.getId());
                return;
            }
            playersQueue.addLast(player);
        }
        System.out.println("The game has been tied, Play again");
    }

    private boolean checkForValidPlaces(int row, int col) {
        int s=board.getSize()-1;
        if(row<0 || row>s || col<0 || col>s)
            return false;
        return true;
    }

    private boolean checkForWin(int r,int c) {
        int size= board.getSize();
        String val=board.getPlayingPieceboard()[r][c].toString();
        //check for row
        int cnt=0;
        for(int i=0;i<size;i++){
            if(board.getPlayingPieceboard()[r][i]!=null && val.equals(board.getPlayingPieceboard()[r][i].toString())){
                cnt++;
            }
        }
        if(cnt==size){
            return true;
        }
        cnt=0;
        //check for col
        for(int i=0;i<size;i++){
            if(board.getPlayingPieceboard()[i][c]!=null && val.equals(board.getPlayingPieceboard()[i][c].toString())){
                cnt++;
            }
        }
        if(cnt==size){
            return true;
        }
        cnt=0;
        //check for left diagonal
        for(int i=0;i<size;i++){
            if(board.getPlayingPieceboard()[i][i]!=null && val.equals(board.getPlayingPieceboard()[i][i].toString())){
                cnt++;
            }
        }
        if(cnt==size){
            return true;
        }
        cnt=0;
        //check for right diagonal
        int l=0;
        for(int i=size-1;i>=0;i--){
            if(board.getPlayingPieceboard()[i][l]!=null && val.equals(board.getPlayingPieceboard()[i][l].toString())){
                cnt++;
            }
            l++;
        }
        if(cnt==size){
            return true;
        }
        return false;
    }

    private void showBoard() {
        for(int i=0;i< board.getSize();i++){
            System.out.println();
            for(int j=0;j< board.getSize();j++){
                System.out.print(board.getPlayingPieceboard()[i][j]+" ");
            }
        }
    }

    private boolean checkforEmpty(int row, int col) {
        return board.getPlayingPieceboard()[row][col]==null;
    }

}
