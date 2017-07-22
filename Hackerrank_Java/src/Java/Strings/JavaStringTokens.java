package Java.Strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given a string, <em>s</em>, matching the regular expression [A-Za-z !,?._'@]+, split the string
 * into <em>tokens</em>. We define a token to be one or more consecutive English alphabetic letters.
 * Then, print the number of tokens, followed by each token on a new line.
 *
 * <strong>Note: </strong>You may find the
 * <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-">String.split</a>
 * method helpful in completing this challenge.
 *
 * <h3>Input Format</h3>
 * A single string, <em>s</em>.
 *
 * <h3>Constraints</h3>
 * <ul>
 * <li> 1 &le; length of <em>s</em> &le; 4.10<sup>5</sup>
 * <li> <em>s</em> is composed of <em>any</em> of the following: English alphabetic letters, black
 * spaces, exclamationpoints(!), commas(,), question marks(?), periods(.), underscores(_),
 * apostrophes('), and at symbols(@).
 * </ul>
 *
 * <h3>Sample Input</h3>
 * <code>He is a very very good boy, isn't he?</code>
 *
 * <h3>Sample Output</h3>
 * <pre><code>
 * 10
 * He
 * is
 * a
 * very
 * very
 * good
 * boy
 * isn
 * t
 * he
 * </code></pre>
 *
 * <h3>Explanation</h3>
 * We consider a token to be a contiguous segment of alphabetic characters. There are a total of
 * <em>10</em> such tokens in string <em>s</em> and each token is printed in the same order in which
 * it appears in string <em>s</em>.
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
