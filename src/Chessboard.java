import java.util.ArrayList;

public class Chessboard {

    public static void main (String[] args){
        ArrayList<String> chessboardSquares = new ArrayList<String>();
            for(int i = 0; i < 8; i++){
                chessboardSquares.add(order[i].toString());
                chessboardSquares.add("[ ]");
                chessboardSquares.add("[ ]");
                chessboardSquares.add("[ ]");
                chessboardSquares.add("[ ]");
                chessboardSquares.add("[ ]");
                chessboardSquares.add("[ ]");
                chessboardSquares.add("[ ]");
                chessboardSquares.add("[ ]");
                chessboardSquares.add(number[i].toString());
                chessboardSquares.add("\n");
            }
           String chessboardSquaresString = chessboardSquares.toString();
        System.out.println(chessboardSquaresString.replaceAll(","," "));

    }
    static String[] order = {" A","B","C","D","E","F","G","H"};
    static String[] number = {"1","2","3","4","5","6","7","8"};
    static int[][] chessboardModel = {{1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8}};


}
