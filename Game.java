public class Game {
    public Board gameBoard;
    public SnakeHead snakeHead;
    public void start(){
        gameBoard = new Board(10);
        snakeHead = new SnakeHead();
        snakeHead.setSnakeStartPos(gameBoard);
        
    }
}
