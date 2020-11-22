package workshop;

import java.util.Scanner;

public class TikTakTeo {
	Scanner scanner = new Scanner(System.in);
	static String player;
	public static String[] tictactoe = new String[10];
	String computer = "";
	static char currentPlayerMark;
	public void createBoard() {
		for(int i = 1; i < 10; i++ ){
			tictactoe[i] = " ";
		}
	}

	public void chooseSymbol() {
		
		do {	
			System.out.println("Enter the symbol for player");
			player = scanner.nextLine();
			if(player.equals("X")) {
				computer = "O";
				break;
			}
			else if(player.equals("O")){
				computer = "X";
				break;
			}
			else {
				System.out.println("Invalid input");
			}
		}while(player!="O" || player!="X");
	}
	public void showBoard() {
		for(int i = 1; i < 10; i++) {
			System.out.print(tictactoe[i]);
			if((2 * i) % 3 != 0) {
				System.out.print(" | ");
			}
			if(i % 3 == 0 && i!=9) {
				System.out.println("\n----------");
			}
		}
		System.out.println();
	}
	public void makeMove(int position) {	
		if(tictactoe[position] == " ") {
			tictactoe[position] = player;
		}
		else {
			System.out.println("Enter empty position");
		}
	}
	public static void whoStartFirst() {
		if(Math.random() < 0.5) {
			System.out.println("Head is up:its currentPlayerMark");
		}
		else {
			System.out.println("Tails is up:its computer's turn");
		}
		
	}
	public static void input() {
		char computer, currentPlayerMark;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Input:");
		currentPlayerMark = input.next().charAt(0);
		if (currentPlayerMark == 'X' || currentPlayerMark == 'O') {
			if (currentPlayerMark == 'X') {
				computer = 'O';
			} else {
				computer = 'X';
			}
		} else {
			System.out.println("Not a Valid Input.");
		}

	}

	public static void printBoard(char[] board) {
		for (int i = 1; i < board.length; i++) {
			System.out.print(board[i] + " | ");
			if (i % 3 == 0) {
				System.out.println("");
			}
		}
	}

	public static void enterAtValidPosition(Scanner input, char[] board) {
		int entry = 0;
		System.out.println("Enter the index:");
		entry = input.nextInt();
		if (entry < 1 || entry > 9) {
			System.out.println("Invalid entry");
			enterAtValidPosition(input, board);
		}

		if (!(board[entry] == ' ')) {
			System.out.println("Already taken this position");
			enterAtValidPosition(input, board);
		}

		char currentPlayerMark = 0;
		board[entry] = currentPlayerMark;
		printBoard(board);
	}
	
	
		
	
	public static void checkForWin(char[] board) {
		if (board[1]==board[2] || board[1]==board[3] || board[2]==board[3] ){
			if( board[1]=='X'&& board[2]=='X' || board[1]=='X'&& board[3]=='X' || board[2]=='X' && board[3]=='X')	
			{
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the position.");
				int position = scan.nextInt();
				scan.nextLine();
				tictactoe.length;
			}	
        {
        System.out.println("Player has WON!");
        }
		}
    else if (board[4]==board[6] && board[6]==board[5] && board[5]==board[4] && board[5]=='X'&& board[4]=='X'&& board[6]=='X')
        {
        System.out.println("Player has WON!");
        }
    else if (board[9]==board[7] && board[8]==board[9] && board[8]==board[7] && board[9]=='X'&& board[8]=='X'&& board[7]=='X')
        {
        System.out.println("Player has WON!");
        }
    else if (board[1]==board[2] && board[2]==board[7] && board[7]==board[2] && board[1]=='X'&& board[2]=='X'&& board[7]=='X')
        {
        System.out.println("Player has WON!");
        }
    else if (board[3]==board[5] && board[5]==board[7] && board[7]==board[3] && board[5]=='X'&& board[3]=='X'&& board[7]=='X')
        {
        System.out.println("Player has WON!");
        }
    else if (board[3]==board[6] && board[6]==board[9] && board[9]==board[3] && board[6]=='X'&& board[3]=='X'&& board[9]=='X')
        {
        System.out.println("Player has WON!");
        }
    else if (board[1]==board[5] && board[5]==board[9] && board[5]==board[1] && board[5]=='X'&& board[5]=='X'&& board[9]=='X')
        {
        System.out.println("Player has WON!");
        }
    else if (board[3]==board[5] && board[5]==board[7] && board[7]==board[3] && board[5]=='X'&& board[3]=='X'&& board[7]=='X')
        {
        System.out.println("Player has WON!");
        }
    else if (board[3]==board[1] && board[2]==board[3] && board[2]==board[3] && board[1]=='O'&& board[3]=='O'&& board[2]=='O')
        {
        System.out.println("Computer has WON!");
        }
    else if (board[4]==board[5] && board[5]==board[6] && board[6]==board[4] && board[5]=='O'&& board[4]=='O'&& board[6]=='O')
        {
        System.out.println("Computer has WON!");
        }
    else if (board[8]==board[7] && board[9]==board[7] && board[8]==board[7] && board[9]=='O'&& board[8]=='O'&& board[7]=='O')
        {
        System.out.println("Computer has WON!");
        }
    else if (board[3]==board[4] && board[4]==board[7] && board[7]==board[1] && board[1]=='O'&& board[4]=='O'&& board[7]=='O')
        {
        System.out.println("Computer has WON!");
        }
    else if (board[2]==board[5] && board[5]==board[8] && board[8]==board[2] && board[5]=='O'&& board[2]=='O'&& board[8]=='O')
        {
        System.out.println("Computer has WON!");
        }
    else if (board[3]==board[6] && board[3]==board[9] && board[6]==board[3] && board[3]=='O'&& board[9]=='O'&& board[6]=='O')
        {
        System.out.println("Computer has WON!");
        }
    else if (board[4]==board[5] && board[5]==board[9] && board[9]==board[4] && board[5]=='O'&& board[4]=='O'&& board[9]=='O')
        {
        System.out.println("Computer has WON!");
        }
    else if (board[3]==board[5] && board[5]==board[7] && board[7]==board[3] && board[5]=='O'&& board[3]=='O'&& board[7]=='O')
        {
        System.out.println("Computer has WON!");
        }
    else
        {
        System.out.println("THE GAME HAS COME TO A DRAW.");
        }
}
	
	private boolean check(char c, char d, char e) {
		return ((c != '-') && (d == e) && (d == e));
	}
	
	
	public static void main(String[] args) {
		TikTakTeo tictactoe = new TikTakTeo();
		Scanner scan = new Scanner(System.in);
		tictactoe.createBoard();
		String choice;
		
			tictactoe.chooseSymbol();
			System.out.println("Enter the position.");
			int position = scan.nextInt();
			scan.nextLine();
			tictactoe.makeMove(position);
			tictactoe.showBoard();
			tictactoe.whoStartFirst();
			tictactoe.checkForWin(null);
			
			
		}
}