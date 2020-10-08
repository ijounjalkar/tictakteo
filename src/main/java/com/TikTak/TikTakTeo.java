package com.TikTak;

import java.util.Scanner;

public class TikTakTeo { 
	public static void main(String[] args) {
		char[] board = createBoard();
		input();
		
	}
	private static char[] createBoard() {
		char[] board = new char[10];
		for(int i=0; i<board.length; i++) {
		board[i] = ' ';
	}
	return board;
}
	public static void input() {
		char player,computer;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the input");
		player = input.next().charAt(0);
		if (player == 'X') {
			computer = 'O';
		}
		else {
			computer = 'X';
		}
	}

}
