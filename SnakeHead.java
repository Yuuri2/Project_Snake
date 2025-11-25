public class SnakeHead extends GameObject{
    private float speed;
    private int snakeLength;
    private Board.Coords snakePos;
    
    public SnakeHead(){
        int speed = 1;
        int snakeLength = 1;
    }

    public void setSnakeStartPos(Board board){
        snakePos = board.getAvailableSpace(board);
    }
}
