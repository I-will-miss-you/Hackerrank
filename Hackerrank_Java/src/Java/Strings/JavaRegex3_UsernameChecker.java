package Java.Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions (<em>regexp</em>) help us match or search for patterns in strings. In this
 * problem, you will be given a username. Your task is to check whether that username is valid. A
 * valid username will have the following properties:
 * <ol>
 * <li> The username can contain alphanumeric characters and/or underscores(_).
 * <li> The username must start with an alphabetic character.
 * <li> 8 &le; |Username| &le; 30.
 * </ol>
 * To simplify your task, we have provided a portion of the code in the editor. You just need to
 * write down the <em>regex</em> pattern which will be used to validate the username input.
 *
 * <h3>Input Format</h3>
 * The first line of input contains an integer <em>N</em>, representing the number of testcases.
 * Each of the next <em>N</em> lines contains a string that represents a username.
 *
 * <h3>Constraints</h3>
 * <ul>
 * <li> The username consists of any printable characters.
 * <li> 1 &le; <em>N</em> &le; 100
 * </ul>
 *
 * <h3>Output Format</h3>
 * For each username, output <em>Valid</em> if the username is valid; otherwise, output
 * <em>Invalid</em>.
 *
 * <h3>Sample Input</h3>
 * <pre><code>
 *  <b>4</b>
 *  alpha_naheed
 *  xahidbuffon
 *  nagib@<b>007</b>
 *  <b>123</b>Swakkhar
 * </code></pre>
 *
 * <h3>Sample Input</h3>
 * <pre><code>
 *  Valid
 *  Valid
 *  Invalid
 *  Invalid
 * </code></pre>
 *
 * <h3>Explanation</h3>
 * The first two cases fulfill the constraints of a valid username. The third case is invalid
 * because it contains an invalid character '@'. The fourth case is also invalid because it starts
 * with a numeric character.
 *
 * @author code36u4r60
 */
public class JavaRegex3_UsernameChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String username = in.nextLine();
            String pattern = "^[aA-zZ][\\w_]{7,29}$";//
            //String pattern = "^[A-Za-z]([A-Za-z0-9_]){7,29}$";

            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(username);

            if (m.find()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
