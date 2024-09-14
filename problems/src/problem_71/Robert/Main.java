package problem_71.Robert;

import java.util.Scanner;

public class Main {
    /**
     * <h2>Way too long words.</h2>
     * <h3>Index: A</h3>
     * @param word {String}
     * @return <code>abbreviation</code> - {String}
     */
    public static String wayTooLongWords(String word){
        if(word.length() <= 10){
            return word;
        }

        return word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
    }

    /**
     * <h2>Main function.</h2>
     * @param args {String[]}
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wordsCount = scanner.nextInt();
        scanner.nextLine();

        while (wordsCount > 0){
            String word = scanner.nextLine();
            System.out.println(Main.wayTooLongWords(word));

            wordsCount--;
        }
    }
}