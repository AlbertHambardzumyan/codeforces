package problem_1.Robert;

import java.util.Scanner;

public class Main {
    /**
     * <h2>Theatre Square.</h2>
     * <h3>Index: A</h3>
     * @param tSquareWidth {int}
     * @param tSquareHeight {int}
     * @param flagstoneDim {int}
     * @return <code>flagstonesNumber</code> - {int}
     */
    public static long theatreSquare(int tSquareWidth, int tSquareHeight, int flagstoneDim){
        int widthInFlagStones = tSquareWidth / flagstoneDim + ( tSquareWidth % flagstoneDim == 0 ? 0 : 1 );
        int heightInFlagStones = tSquareHeight / flagstoneDim + ( tSquareHeight % flagstoneDim == 0 ? 0 : 1 );

        return (long) widthInFlagStones * heightInFlagStones;
    }

    /**
     * <h2>Main function.</h2>
     * @param args {String[]}
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tSquareWidth = scanner.nextInt();
        int tSquareHeight = scanner.nextInt();
        int flagstoneDim = scanner.nextInt();

        System.out.println(Main.theatreSquare(tSquareWidth, tSquareHeight, flagstoneDim));
    }
}