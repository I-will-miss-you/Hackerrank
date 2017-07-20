package Java.Strings;

import java.util.Scanner;

/**
 * <p>
 * This exercise is to test your understanding of Java Strings. A sample String declaration:
 * <pre><code>
 *      String myString = "Hello World!"
 * </code></pre>
 *
 * <p>
 * The elements of a String are called characters. The number of characters in a <em>String</em> is
 * called the length, and it can be retrieved with the <em>String.length()</em> method.
 *
 * <p>
 * Given two strings of lowercase English letters, <em>A</em> and <em>B</em>, perform the following
 * operations:
 * <ol>
 * <li>Sum the lengths of <em>A</em> and <em>B</em>.
 * <li>Determine if <em>A</em> is lexicographically larger than <em>B</em> and print them on a
 * single line, separated by a space.
 * <li>Capitalize the first letter in <em>A</em> and <em>B</em> and print them on a single line,
 * separated by a space.
 * </ol>
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>The first line contains a string <em>A</em>. The second line contains another string
 * <em>B</em>. The strings are comprised of only lowercase English letters.
 *
 * <p>
 * <strong>Output Format</strong>
 * <br>There are three lines of output:
 * <br>For the first line, sum the lengths of <em>A</em> and <em>B</em> or No if it is not.
 * <br>For the third line, capitalize the first letter in both <em>A</em> and <em>B</em> and print
 * them on a single line, separated by a space.
 *
 * <p>
 * <strong>Sample Input</strong>
 * <pre><code>
 *      Hello
 *      World!
 * </code></pre>
 *
 * <p>
 * <strong>SampleOutput</strong>
 * <pre><code>
 *      9
 *      No
 *      Hello World!
 * </code></pre>
 *
 * <p>
 * <strong>Explanation</strong>
 * <br>String <em>A</em> is "hello" and <em>B</em> is "java".
 * <br>
 * <br><em>A</em> has a <em>length</em> of 5, and <em>B</em> has a <em>length</em> of <em>4</em>;
 * the sum of their lengths is <em>9</em>.
 * <br>When sorted alphabetically/lexicographically, "hello" comes before "java";
 * therefore,<em>A</em> is not larger than <em>B</em> and the answer is No.
 * <br>
 * <br>When you capitalize the first letter of both <em>A</em> and <em>B</em> and then print them
 * separated by a space, you get "Hello Java".
 *
 * @author code36u4r60
 */
public class JavaStringsIntroduction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next().toLowerCase();
        String B = sc.next().toLowerCase();

        System.out.println(A.length() + B.length());
        System.out.println((A.compareTo(B) < 0) ? "No" : "Yes");
        System.out.println(capitalize(A) + " " + capitalize(B));

    }

    public static String capitalize(String s) {
        if (s.length() == 0) {
            return s;
        }
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
}
