package day17;

import java.util.Arrays;

public class ChessBoard {
    private ChessPiece[][] board;

//    public ChessBoard(ChessPiece[][] board) {
//    this.board = board;
    public ChessBoard(int lineCount, int columnCount) {
        board = new ChessPiece[lineCount][columnCount];
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                board[i][j] = ChessPiece.EMPTY;
            }
        }
    }

    public void setChessPies ( ChessPiece chessPies, int line, int column){
        board[line][column] = chessPies;
    }

    public void print() {
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j].toString());
            }
            System.out.println();
        }
    }
}
