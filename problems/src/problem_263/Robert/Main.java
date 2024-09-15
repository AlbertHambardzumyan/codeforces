package problem_263.Robert;

import java.util.Scanner;

public class Main {
    /**
     * <h2>Beautiful matrix.</h2>
     * <h3>Index: A</h3>
     * @param matrix {int[][]}
     * @return <code>movesCount</code> - {int}
     */
    public static int beautifulMatrix(int[][] matrix){
        int[] bitCoordinate = new int[2];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] == 1){
                    bitCoordinate[0] = i + 1;
                    bitCoordinate[1] = j + 1;
                    break;
                }
            }
        }

        return Math.abs(3 - bitCoordinate[0]) + Math.abs(3 - bitCoordinate[1]);
    }

    /**
     * <h2>Main function.</h2>
     * @param args {String[]}
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matrix[i][j] = scanner.nextInt();
            }
            scanner.nextLine();
        }

        System.out.println(Main.beautifulMatrix(matrix));
    }
}