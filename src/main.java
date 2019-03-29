
public class main {

	public static void main(String[] args) {
		int gameCounter = 1;
		TicTacToeBoard board = new TicTacToeBoard();
		board.fillBoard(board.getBoard());
		while (board.getWinner() == false) {
			board.play(gameCounter);
			gameCounter++;
		}

	}

}
