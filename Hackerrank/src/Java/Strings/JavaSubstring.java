package Java.Strings;

import java.util.Scanner;

/**
 * <p>
 * Given a string, <em>s</em>, and two indices, <em>start</em> and <em>end</em>, print a substring
 * consisting of all characters in the inclusive range from <em>strat</em> to
 * <em>end</em> - 1. You'll find the String class helpful in completing this challenge.
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>The first line contains a single string denoting <em>s</em>.
 * <br>Rhe second line contains two space-seprated integers denoting the respective values of
 * <em>start</em> and <em>end</em>.
 *
 * <p>
 * <strong>Constrait</strong>
 * <ul>
 * <li> 1 &le; |s| &le; 100
 * <li> 0 &le; start &lt; end &le; n
 * <li> String <em>s</em> consists of English alphabetic letters (i.e., [a - zA -Z]) only.
 * </ul>
 *
 * <p>
 * <strong>Output Format</strong>
 * <br>Print the substring in the inclusive range from <em>start</em> to <em>end</em> - 1.
 *
 *
 * <p>
 * <strong>Sample Input</strong>
 * <pre><code>
 *  Hellworld
 *  3 7
 * </code></pre>
 *
 * <p>
 * <strong>Sample Output</strong>
 * <pre><code>
 *  lowo
 * </code></pre>
 *
 * <p>
 * <strong>Explanation</strong>
 * <br>In the diagram below, the substring is highlighted in bold:
 * <pre><code>
 *      0   1   2   3   4   5   6   7   8   9
 *      H   e   l   <b>l   o   w   o</b>   r   l   d
 *                  *   *   *   *
 * </code></pre>
 *
 *
 *
 * @author code36u4r60
 */
public class JavaSubstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S.substring(start, end));
    }

}
