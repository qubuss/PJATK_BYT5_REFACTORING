package src;

import src.service.WinnerService;

class TicTacToe {
    //Zmieniona struktura planszy + poprawiona metoda sprawdzania wygranego, wyciągnięcie do innej klasy
    //+ wyciągniety znak do zmiennej
    public char[][] board;
    private static final char ZNAK = '-';

    //TODO DONE
    TicTacToe(char[][] b) {
        board = new char[3][3];
        for (int i = 0; i<3; i++)
            for (int j = 0; j<3; j++)
                board[i][j] = b[i][j];
    }
    TicTacToe(char[][] b, int x, int y, char player) {
        board = new char[3][3];
        for (int i = 0; i<3; i++)
            for (int j = 0; j<3; j++)
                board[i][j] = b[i][j];
        board[x][y] = player;
    }
    public int suggestMove(char player) {

        for (int i = 0; i < 3; i++) {
            for (int j=0; j<3; j++){
                if (this.board[i][j] == ZNAK) {
                    TicTacToe game = makeMove(i, j, player);
                    if (game.winner() == player)
                        return i*3+j;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j=0; j<3; j++){
                char c = this.board[i][j];
                if (c == ZNAK) {
                    return i*3+j;
                }
            }
        }
        return -1;
    }
    public TicTacToe makeMove(int x, int y, char player) {
        return new TicTacToe(board, x, y, player);
    }

    public char winner(){
        WinnerService winnerService = new WinnerService(board, ZNAK);

        char win = winnerService.getHorizontaVerticallWinner();
        if (win != ZNAK) return win;
        win = winnerService.getDiagonalWinner();
        return win;
    }

}
