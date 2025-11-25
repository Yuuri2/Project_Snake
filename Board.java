

public class Board {
    private GameObject[][] boardGrid;
    private int size;
    private float border;
    
    public Board(int size){
        this.size = size;
        border = size/2;
        initiateBoard(this);
    }
    private void clearBoard(Board board){
        for(int i=0; i <board.size;i++){
            for(int j=0; j <board.size;j++){
                board.boardGrid[i][j] = FreeSpace.getFreeSpace();
            }
        }
    }

    public void initiateBoard(Board board){
        clearBoard(board);
    }

    public Coords getAvailableSpace(Board board){
        for(int col=0; col <board.size;col++){
            for(int row=0; row <board.size;row++){
                if(board.boardGrid[col][row] instanceof FreeSpace){
                    return new Coords(col, row);
                }
            }
        }
        throw new IllegalStateException("No available spot on Board");
    }

    

    public record Coords(int col, int row){}
}
