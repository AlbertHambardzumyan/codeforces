package problem_4.Robert;

import java.util.Scanner;

public class Main {
    /**
     * <h2>Watermelon.</h2>
     * <h3>Index: A</h3>
     * @param weight {int}
     * @return {String}
     */
    public static String watermelon(int weight){
        return (weight > 2 && weight % 2 == 0) ? "YES" : "NO";
    }

    /**
     * <h2>Main function.</h2>
     * @param args {String[]}
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int weight = scanner.nextInt();

        System.out.print(Main.watermelon(weight));
    }
}

