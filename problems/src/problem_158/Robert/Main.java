package problem_158.Robert;

import java.util.Scanner;

public class Main {
    /**
     * <h2>Next round.</h2>
     * <h3>Index: A</h3>
     * @param scores {int[]}
     * @param cutOffRankIndex {int}
     * @return <code>passedPlayersNumber</code> - {int}
     */
    public static int nextRound(int[] scores, int cutOffRankIndex){
        int passmark = scores[cutOffRankIndex - 1];
        int passedPlayersNumber = 0;

        for(int score: scores){
            passedPlayersNumber += (score >= passmark && score > 0) ? 1 : 0;
        }

        return passedPlayersNumber;
    }

    /**
     * <h2>Main function.</h2>
     * @param args {String[]}
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int scoresCount = scanner.nextInt();
        int cutOffRankIndex = scanner.nextInt();
        scanner.nextLine();

        int[] scores = new int[scoresCount];
        for( int i = 0; i < scoresCount; i++){
            scores[i] = scanner.nextInt();
        }

        System.out.println(Main.nextRound(scores,  cutOffRankIndex));
    }
}