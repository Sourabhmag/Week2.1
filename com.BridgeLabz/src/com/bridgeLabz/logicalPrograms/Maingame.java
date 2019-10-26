package com.bridgeLabz.logicalPrograms;

public class Maingame {
	/**
	 * @author Sourabh Magdum
	 * @Purpose - keep all necessary methods required for Tic-Tac-Toe game
	 *
	 */
		private char[][] board;
		private char currentPlayer;

		public Maingame() {
			board = new char[3][3];
			currentPlayer = 'x';
			initializeBoard();
		}

		
		/**
		 * @return - Returns turn of player
		 */
		public char getCurrentPlayer() {
			return currentPlayer;
		}

		
		/**
		 * Used to initilise board
		 */
		public void initializeBoard() {

			
			for (int i = 0; i < 3; i++) {

				
				for (int j = 0; j < 3; j++) {
					board[i][j] = '-';
				}
			}
		}

		
		/**
		 * Used to print board
		 */
		public void printBoard() {
			System.out.println("-------------");

			for (int i = 0; i < 3; i++) {
				System.out.print("| ");
				for (int j = 0; j < 3; j++) {
					System.out.print(board[i][j] + " | ");
				}
				System.out.println();
				System.out.println("-------------");
			}
		}

		
		/**
		 * @return - returns boolean value of board is full or not
		 */
		public boolean isBoardFull() {
			boolean isFull = true;

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (board[i][j] == '-') {
						isFull = false;
					}
				}
			}

			return isFull;
		}

		
		/**
		 * @return - returns the name od winner
		 */
		public boolean isWinner() {
			return (checkRows() || checkColumns() || checkDiagonals());
		}

		
		/**
		 * Purpose - Used to check row wise win condition
		 * @return - returns row check win condition
		 */
		private boolean checkRows() {
			for (int i = 0; i < 3; i++) {
				if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
					return true;
				}
			}
			return false;
		}

		/**
		 * Purpose - Used to check column wise win condition
		 * @return - returns column check win condition
		 */
		private boolean checkColumns() {
			for (int i = 0; i < 3; i++) {
				if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
					return true;
				}
			}
			return false;
		}

		/**
		 * Purpose - Used to check diagonal wise win condition
		 * @return - returns diagonal check win condition
		 */
		private boolean checkDiagonals() {
			return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true)
					|| (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
		}

		
		private boolean checkRowCol(char c1, char c2, char c3) {
			return ((c1 != '-') && (c1 == c2) && (c2 == c3));
		}

		
		/**
		 * Used to change turn
		 */
		public void changePlayer() {
			if (currentPlayer == 'x') {
				currentPlayer = 'o';
			} else {
				currentPlayer = 'x';
			}
		}

		
		/**
		 * @return Keep markers in board(Used by initilize method)
		 */
		public boolean placeMark(int row, int col) {

			
			if ((row >= 0) && (row < 3)) {
				if ((col >= 0) && (col < 3)) {
					if (board[row][col] == '-') {
						board[row][col] = currentPlayer;
						return true;
					}
				}
			}

			return false;
		}
	}

