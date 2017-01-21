package src;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicTacToeTest {


	@Test
	public void testDefaultMove() {
		char[][] board = {{'X', 'O', 'X'},
				{'O', 'X', '-'},
				{'O', 'X', 'O'}};
		TicTacToe game = new TicTacToe(board);
		assertEquals(5, game.suggestMove('X'));

		char[][] board1 = {{'X', 'O', 'X'},
				{'O', 'X', 'O'},
				{'O', 'X', '-'}};
		game = new TicTacToe(board1);
		assertEquals(8, game.suggestMove('O'));

		char[][] board2 = {{'-', '-', '-'},
				{'-', '-', '-'},
				{'-', '-', '-'}};
		game = new TicTacToe(board2);
		assertEquals(0, game.suggestMove('X'));

		char[][] board3 = {{'X', 'X', 'X'},
				{'X', 'X', 'X'},
				{'X', 'X', 'X'}};
		game = new TicTacToe(board3);
		assertEquals(-1, game.suggestMove('X'));
	}
	@Test
	public void testFindWinningMove() {
		char[][] board4 = {{'X', 'O', '-'},
				{'X', 'X', '-'},
				{'O', 'O', '-'}};
		TicTacToe game = new TicTacToe(board4);
		assertEquals(5, game.suggestMove('X'));
		assertEquals(8, game.suggestMove('O'));
	}
	@Test
	public void testWinConditions() {
		assertWinner("---XXX---", 'X');
		assertWinner("XXX------", 'X');
		assertWinner("------XXX", 'X');
		assertWinner("X--X--X--", 'X');
		assertWinner("-X--X--X-", 'X');
		assertWinner("--X--X--X", 'X');
		assertWinner("X---X---X", 'X');
		assertWinner("--X-X-X--", 'X');

		assertWinner("---OOO---", 'O');
		assertWinner("OOO------", 'O');
		assertWinner("------OOO", 'O');
		assertWinner("O--O--O--", 'O');
		assertWinner("-O--O--O-", 'O');
		assertWinner("--O--O--O", 'O');
		assertWinner("O---O---O", 'O');
		assertWinner("--O-O-O--", 'O');

		assertWinner("---------", '-');
		assertWinner("XXOOOXXOO", '-');
	}
	public void assertWinner(String b, char w) {
		char[][] board = {{b.charAt(0), b.charAt(1), b.charAt(2)},
				{b.charAt(3), b.charAt(4), b.charAt(5)},
				{b.charAt(6), b.charAt(7), b.charAt(8)}};
		TicTacToe game = new TicTacToe(board);
		assertEquals(w, game.winner());
	}
}