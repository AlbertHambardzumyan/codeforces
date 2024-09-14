package problem_282.Robert;

import java.util.Scanner;

public class Main {
    /**
     * <h2>Bit++.</h2>
     * <h3>Index: A</h3>
     * @param statements {String}
     * @return <code>result</code> - {int}
     */
    public static int bitPlusPlus(String[] statements){
        int result = 0;

        for (String statement: statements){
            String operation = statement.charAt(0) == 'X'
                    ? statement.substring(1)
                    : statement.substring(0,2);

            result += operation.equals("++") ? 1 : -1;
        }

        return result;
    }


    /**
     * <h2>Main function.</h2>
     * @param args {String[]}
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int statementCount = scanner.nextInt();
        scanner.nextLine();
        String[] statements = new String[statementCount];

        for(int i = 0; i < statementCount; i++){
            statements[i] = scanner.nextLine();
        }

        System.out.println(Main.bitPlusPlus(statements));
    }
}