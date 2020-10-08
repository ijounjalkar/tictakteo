package workshop;

import java.util.Scanner;

public class TikTakTeo {
	Scanner scanner = new Scanner(System.in);
	static String player;
	public static String[] tictactoe = new String[10];
	String computer = "";
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
			
		}
}