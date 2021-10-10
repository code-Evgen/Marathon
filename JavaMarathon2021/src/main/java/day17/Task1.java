package day17;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<ChessPiece> chessMass = new ArrayList<>();
        chessMass.add(ChessPiece.PAWN_WHITE);
        chessMass.add(ChessPiece.PAWN_WHITE);
        chessMass.add(ChessPiece.PAWN_WHITE);
        chessMass.add(ChessPiece.PAWN_WHITE);
        chessMass.add(ChessPiece.ROOK_BLACK);
        chessMass.add(ChessPiece.ROOK_BLACK);
        chessMass.add(ChessPiece.ROOK_BLACK);
        chessMass.add(ChessPiece.ROOK_BLACK);

        for (ChessPiece chess: chessMass)
            System.out.print(chess + " ");
    }
}