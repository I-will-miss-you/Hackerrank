package Java.Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author code36u4r60
 */
public class JavaRegex2_DuplicateWords {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String regex = "(\\b\\w+\\b)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replace(m.group(0), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

    }

}
