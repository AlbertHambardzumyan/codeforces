package problem_112.Robert;

import java.util.Scanner;

public class Main {
    /**
     * <h2>Petya and strings.</h2>
     * <h3>Index: A</h3>
     * @param firstString {String}
     * @param secondString {String}
     * @return <code>status</code> - {int}
     */
    public static int petyaAndStrings(String firstString, String secondString){
        int status = 0;
        String _firestString = firstString.toLowerCase();
        String _secondString = secondString.toLowerCase();

        for(int i = 0; i < _firestString.length(); i++){
            if(i < _secondString.length() && _firestString.charAt(i) > _secondString.charAt(i)){
                status  = 1;
                break;
            }

            if(i < _secondString.length() && _firestString.charAt(i) < _secondString.charAt(i)){
                status  = -1;
                break;
            }
        }

        return status;
    }

    /**
     * <h2>Main function.</h2>
     * @param args {String[]}
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        System.out.println(Main.petyaAndStrings(firstString, secondString));

    }
}