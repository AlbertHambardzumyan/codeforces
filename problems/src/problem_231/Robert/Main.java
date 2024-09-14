package problem_231.Robert;

import java.util.Scanner;

public class Main {
    private static final int PLAYERS_NUMBER = 3;

    /**
     * <h2>Team.</h2>
     * <h3>Index: A</h3>
     * @param teamConfidenceLevel {Array<int>}
     * @return <code>solvedProblemsCount</code> - {int}
     */
    public static int team(int[][] teamConfidenceLevel){
        int solvedProblemsCount = 0;

        for(int[] problem: teamConfidenceLevel){
            int confidentPlayersCount = 0;

            for(int playerConfidence: problem){
                confidentPlayersCount += playerConfidence;
            }

            if(confidentPlayersCount > 1){
                solvedProblemsCount++;
            }
        }

        return solvedProblemsCount;
    }

    /**
     * <h2>Main function.</h2>
     * @param args {String[]}
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int problemsCount = scanner.nextInt();
        int[][] teamConfidenceLevel = new int[problemsCount][PLAYERS_NUMBER];
        scanner.nextLine();

        for(int[] problem: teamConfidenceLevel){
            for(int i = 0; i < PLAYERS_NUMBER; i++){
                problem[i] = scanner.nextInt();
            }
            scanner.nextLine();
        }

        System.out.print(Main.team(teamConfidenceLevel));
    }
}