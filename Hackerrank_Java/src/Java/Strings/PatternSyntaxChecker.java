package Java.Strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * <p>
 * Using <strong>Regex</strong>, we can easily match or search for patterns in a text. Before
 * searching for a pattern, we have to specify one using some well-defined syntax.
 * <p>
 * In this problem, you are given a pattern. You have to check whether the syntax of the given
 * pattern is valid.
 * <p>
 * <strong>Note:</strong> In this problem, a regex is only valid if you can compile it using the
 * <a href="http://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html#compile%28java.lang.String%29">Pattern.compile</a>
 * method.
 *
 * <h3>Input Format</h3>
 * The first line of input contains an integer <em>N</em>, denoting the number of test cases. The
 * next <em>N</em> lines contain a string of any printable characters representing the pattern of a
 * regex.
 *
 * <h3>Output Format</h3>
 * For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print
 * Invalid. Do not print the quotes.
 *
 * <h3>Sample Input</h3>
 * <pre><code>
 * 3
 * ([A-Z])(.+)
 * [AZ[a-z](a-z)
 * batcatpat(nat
 * </code></pre>
 *
 * <h3>Sample Output</h3>
 * <pre><code>
 * Valid
 * Invalid
 * Invalid
 * </code></pre>
 *
 *
 * @author code36u4r60
 */
public class PatternSyntaxChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            testCases--;
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
    }
}
