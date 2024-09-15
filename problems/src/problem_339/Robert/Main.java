package problem_339.Robert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * <h2>Helpful maths.</h2>
     * <h3>Index: A</h3>
     * @param sum {String}
     * @return <code>sortedSum</code> {String}
     */
    public static String helpfulMaths(String sum){
        ArrayList<String> numbers = new ArrayList<>(List.of(sum.split("\\+")));
        Collections.sort(numbers);

       return String.join("+", numbers);
    }

    /**
     * <h2>Main function.</h2>
     * @param args {String[]}
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sum = scanner.nextLine();
        System.out.println(Main.helpfulMaths(sum));
    }
}