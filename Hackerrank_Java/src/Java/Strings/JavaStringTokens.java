package Java.Strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 *
 *
 * @author code36u4r60
 */
public class JavaStringTokens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        s = s.trim();
        String[] tokens = s.split("[^\\p{Alpha}]+");

        System.out.println((s.isEmpty()) ? 0 : tokens.length);
        Arrays.stream(tokens).forEach((x) -> System.out.println(x));
    }
}
