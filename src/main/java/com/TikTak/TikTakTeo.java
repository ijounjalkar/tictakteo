package com.TikTak;

import java.util.Scanner;

public class TikTakTeo { 
	public static void main(String[] args) {
		char[] board = createBoard();
		inputXorO();
		
	}
	private static char[] createBoard() {
		char[] board = new char[10];
		for (int i=0; i<board.length; i++) {
		board[i] = ' ';
	}
	return board;
}
	public static void inputXorO() {
		char player , computer;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the input");
		player = input.next().charAt(0);
		if(player == 'X' || player == 'O') {
		  if (player == 'X') {
			computer = 'O';
		}
		else {
			computer = 'X';
		}
	
	}
	else {
		System.out.println("Invalid Choice. Please enter either (X/O)");
		inputXorO();
	}
	}
	public static void showBoard () {
		String[] board = null;
		for(int i=1; i<board.length; i++) {
		System.out.println(board[i] + " | ");
		if(i % 3 == 0)
			System.out.println();
		}
	}


}
