package problem_50.Robert;

import java.util.Scanner;

public class Main {
    private static final int DOMINO_SURFACE = 2;

    /**
     * <h2>Domino piling.</h2>
     * <h3>Index: A</h3>
     * @param widthInSquares {int}
     * @param heightInSquares {int}
     * @return <code>dominoCapacity</code> - {int}
     */
   public static int dominoPiling(int widthInSquares, int heightInSquares){
        int surfaceInSquares = widthInSquares * heightInSquares;

        return surfaceInSquares / DOMINO_SURFACE;
   }

    /**
     * <h2>Main function.</h2>
     * @param args {String[]}
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthInSquares = scanner.nextInt();
        int heightInSquares = scanner.nextInt();

        System.out.println(Main.dominoPiling(widthInSquares, heightInSquares));
    }
}