package Java.Strings;

import java.util.Scanner;

/**
 * <p>
 * We define following terms:
 * <ul>
 * <li>Lexicographical Order. also known as <em>alphabetic</em> or <em>dictionary order</em>, orders
 * characters as follows:
 * <pre>    A &lt; B &lt; ... &lt; Y &lt; Z &lt; a &lt; b &lt; ... &lt; y &lt; z</pre> For example:
 * ball &lt; cat , dog &lt; dorm , Happy &lt; happy , Zoo &lt; ball.
 * <li>A substring of a string is a contiguous block of characters in the string. For example, the
 * substrings of abc are 'a', 'b', 'c', 'ab', 'bc', and 'abc'.
 * </ul>
 * Given a string, <em>s</em>, and an integer, <em>K</em>, complete the function so that it finds
 * the lexicographically <em>smallest</em> and <em>largest</em> substrings of length <em>k</em>.
 *
 * <h3>Input Format</h3>
 * The first line contains a string denoting <em>s</em>.
 * <br>The second line conrains an integer denoting <em>k</em>.
 *
 * <h3>Constraintas</h3>
 * <ul>
 * <li> 1 &le; |s| &le; 1000
 * <li> <em>s</em> consists of English alphabetic letters only (i.e., [a - zA - Z]).
 * </ul>
 *
 * <h3>Output Format</h3>
 * Return the respective lexicographically smallest and largest substrings as single
 * newline-separated string.
 *
 * <h3>Sample Input 0</h3>
 * <pre><code>
 *  welcometojava
 *  3
 * </code></pre>
 *
 * <h3>Sample Output 0</h3>
 * <pre><code>
 *  ava
 *  wel
 * </code></pre>
 *
 * <h3>Explanation 0</h3>
 * String <em>s</em> = <strong>"welcometojava"</strong> has the following lexicographically-ordered
 * substrings of length <em>k</em> = 3;
 * <pre>    ["ava" , "com" , "elc" , "eto" , "jav" , "lco" , "met" , "oja" , "toj" , "wel"]</pre> We
 * then return first (lexicographically smallest) substring as two newlinw-separated values (i.e.,
 * ava\nwel).
 * <br>The stub code in the editor prints ava as our first line of output and wel as our second line
 * of output.
 *
 * @author code36u4r60
 */
public class JavaSubstringComparisons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        smallest = s.substring(0, k);
        largest = s.substring(0, k);
        for (int i = 1; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);
            smallest = (smallest.compareTo(sub) < 0 ? smallest : sub);
            largest = (largest.compareTo(sub) > 0 ? largest : sub);
        }
        return smallest + "\n" + largest;
    }
}
