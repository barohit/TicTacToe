import java.util.Scanner;

public class TicTacToeBoard {

	public TicTacToeBoard() {
		// TODO Auto-generated constructor stub
	}

	boolean winnerYet = false;

	/*
	 * alright, time to start writing some pseudocode for this game. 1. You want to
	 * create, a nine square board. So how about a class of squares that is 3 by 3.
	 * 2. You want each square to take a mark, x or o. Do we need to take a new
	 * class for this, or will a String suffice? I think honestly, a mere character,
	 * X or O will suffice. 3. There should be a play method that takes input from
	 * the user, and then places that on a current square.
	 */
	Square[][] board = new Square[3][3];
	Scanner scan = new Scanner(System.in);

	public void fillBoard(Square[][] board) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = new Square();
			}
		}
	}

	public Square[][] getBoard() {
		return board;
	}

	public boolean getWinner() {
		return winnerYet;
	}

	public Square returnPosition(String userInput) {
		Square position = new Square();
		switch (userInput) {
		case "top left":
			position = board[0][2];
			break;

		case "top center":
			position = board[1][2];
			break;

		case "top right":
			position = board[2][2];
			break;

		case "center left":
			position = board[0][1];
			break;

		case "center":
			position = board[1][1];
			break;

		case "center right":
			position = board[2][1];
			break;

		case "lower left":
			position = board[0][0];
			break;

		case "lower center":
			position = board[1][0];
			break;

		case "lower right":
			position = board[2][0];
			break;

		default:
			System.out.println("Sorry, invalid move");
			break;
		}
		return position;
	}

	public void play(int gameCounter) {
		System.out.println(
				"Enter which square to place your mark on. You can enter top left, top right, center top, center left, lower right etc. Please use lower case for both words with no spaces at the end.");
		String userInput = "";
		userInput = scan.nextLine();
		if (gameCounter % 2 == 1) {
			returnPosition(userInput).setMark('X');
		} else if (gameCounter % 2 == 0) {
			returnPosition(userInput).setMark('O');

		}
		if ((board[0][0].getMark() == board[0][1].getMark()) && (board[0][1].getMark() == board[0][2].getMark())
				&& board[0][0].getMark() != 'a') {
			if (gameCounter % 2 == 1) {
				System.out.println("Player 1 wins!");
			} else if (gameCounter % 2 == 0) {
				System.out.println("Player 2 wins!");
			}
			winnerYet = true;
		}
		if ((board[1][0].getMark() == board[1][1].getMark()) && (board[1][1].getMark() == board[1][2].getMark())
				&& board[1][0].getMark() != 'a') {
			if (gameCounter % 2 == 1) {
				System.out.println("Player 1 wins!");
			} else if (gameCounter % 2 == 0) {
				System.out.println("Player 2 wins!");
			}
			winnerYet = true;
		}
		if ((board[2][0].getMark() == board[2][1].getMark()) && (board[2][1].getMark() == board[2][2].getMark())
				&& board[2][0].getMark() != 'a') {
			if (gameCounter % 2 == 1) {
				System.out.println("Player 1 wins!");
			} else if (gameCounter % 2 == 0) {
				System.out.println("Player 2 wins!");
			}
			winnerYet = true;
		}
		if ((board[0][0].getMark() == board[1][0].getMark()) && (board[1][0].getMark() == board[2][0].getMark())
				&& board[0][0].getMark() != 'a') {
			if (gameCounter % 2 == 1) {
				System.out.println("Player 1 wins!");
			} else if (gameCounter % 2 == 0) {
				System.out.println("Player 2 wins!");
			}
			winnerYet = true;
		}
		if ((board[0][1].getMark() == board[1][1].getMark()) && (board[1][1].getMark() == board[1][2].getMark())
				&& board[0][1].getMark() != 'a') {
			if (gameCounter % 2 == 1) {
				System.out.println("Player 1 wins!");
			} else if (gameCounter % 2 == 0) {
				System.out.println("Player 2 wins!");
			}
			winnerYet = true;
		}
		if ((board[0][2].getMark() == board[1][2].getMark()) && (board[1][2].getMark() == board[2][2].getMark())
				&& board[0][2].getMark() != 'a') {
			if (gameCounter % 2 == 1) {
				System.out.println("Player 1 wins!");
			} else if (gameCounter % 2 == 0) {
				System.out.println("Player 2 wins!");
			}
			winnerYet = true;
		}
		if ((board[0][0].getMark() == board[1][1].getMark()) && (board[1][1].getMark() == board[2][2].getMark())
				&& board[0][0].getMark() != 'a') {
			if (gameCounter % 2 == 1) {
				System.out.println("Player 1 wins!");
			} else if (gameCounter % 2 == 0) {
				System.out.println("Player 2 wins!");
			}
			winnerYet = true;
		}
		if ((board[0][2].getMark() == board[1][1].getMark()) && (board[1][1].getMark() == board[2][0].getMark())
				&& board[0][2].getMark() != 'a') {
			if (gameCounter % 2 == 1) {
				System.out.println("Player 1 wins!");
			} else if (gameCounter % 2 == 0) {
				System.out.println("Player 2 wins!");
			}
			winnerYet = true;
		}

		gameCounter++;

	}
}