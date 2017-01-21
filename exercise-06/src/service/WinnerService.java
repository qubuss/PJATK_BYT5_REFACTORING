package src.service;


public class WinnerService {
    private char[][] board;
    private char ZNAK;

    public WinnerService(char[][] board, char ZNAK) {
        this.board = board;
        this.ZNAK = ZNAK;
    }

    public Character getDiagonalWinner() {
        if ( board[0][0] != ZNAK &&
                board[0][0] == board[1][1] &&
                board[1][1] == board[2][2])
            return board[0][0];

        if ( board[2][0] != ZNAK &&
                board[2][0] == board[1][1] &&
                board[1][1] == board[0][2])
            return board[2][0];
        return '-';
    }

    public Character getHorizontaVerticallWinner() {
        for (int i = 0; i < 3 ; i ++){
            if (board[i][0] != ZNAK &&
                    board[i][0] == board[i][1] &&
                    board[i][1] == board[i][2]) return
                    board[i][0];

            if (board[0][i] != ZNAK &&
                    board[0][i] == board[1][i] &&
                    board[1][i] == board[2][i]) return
                    board[0][i];
        }
        return '-';
    }

}
