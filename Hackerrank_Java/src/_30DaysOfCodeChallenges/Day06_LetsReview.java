package _30DaysOfCodeChallenges;

import java.util.Scanner;

/**
 * <p>
 * <strong>Objective</strong>
 * <br>Today we're expanding our knowledge of Strings and combining it with what we've already
 * learned about loops. Check out the Tutorial tab for learning materials and an instructional
 * video!</p>
 *
 * <p>
 * <strong>Task</strong>
 * <br>Given a string,<em>S</em>, of length <em>N</em> that is indexed from <em>0</em> to <em>N -
 * 1</em>, print its even-indexed and odd-indexed characters as space-separated strings on a single
 * line (see the Sample below for more detail).</p>
 *
 * <p>
 * <strong>Note:</strong>
 * <em>0</em> is considered to be an even index.</p>
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>The first line contains an integer, <em>T</em> (the number of test cases). Each line
 * <em>i</em> of the <em>T</em>
 * subsequent lines contain a String,<em>T</em>.</p>
 *
 * <p>
 * <strong>Constraints</strong>
 * <ul>
 * <li> 1 &le; T &le; 10
 * <li> 2 &le; length of S &le; 10000
 * </ul>
 *
 * <p>
 * <strong>Output Format</strong>
 * <br>For each String <em>S<sub>j</sub></em> (where 0 &le; j &le; T - 1), print
 * <em>S<sub>j</sub></em>´s even-indexed characters, followed by a space, followed by
 * <em>S<sub>j</sub></em>´s odd-indexed characters.</p>
 *
 * <p>
 * <strong>Sample Input</strong>
 * <pre><code>
 *  2
 *  Hacker
 *  Rank
 * </code></pre>
 *
 * <p>
 * <strong>Sample Output</strong>
 * <pre><code>
 *  Hce akr
 *  Rn ak
 * </code></pre>
 *
 * <p>
 * <strong>Explanation</strong>
 * <br>Test Case 0: <em>S = "Hacker"</em>
 * <br><em>S</em>[0] = "H"
 * <br><em>S</em>[1] = "a"
 * <br><em>S</em>[2] = "c"
 * <br><em>S</em>[3] = "k"
 * <br><em>S</em>[4] = "e"
 * <br><em>S</em>[5] = "r"
 *
 * <p>
 * The even indices are <em>0</em> , <em>2</em>, and <em>4</em>, and the odd indices are
 * <em>1</em>, <em>3</em>, and <em>5</em>. We then print a single line of <em>2</em>
 * space-separated strings; the first string contains the ordered characters from <em>S</em>'s even
 * indices (<em>Hce</em>), and the second string contains the ordered characters from <em>S</em>'s
 * odd indices (<em>akr</em>).</p>
 *
 * <br>Test Case 1: <em>S</em> = "Rank"
 * <br><em>S</em>[0] = "R"
 * <br><em>S</em>[1] = "a"
 * <br><em>S</em>[2] = "n"
 * <br><em>S</em>[3] = "k"
 * <br>The even indices are <em>0</em> and <em>2</em>, and the <em>odd</em> indices are <em>1</em>
 * and <em>3</em>. We then print a <em>single line</em> of <em>2</em> space-separated strings; the
 * first string contains the ordered characters from <em>S</em>'s even indices (<em>Rn</em>), and
 * the second string contains the ordered characters from <em>S</em>'s odd indices (<em>ak</em>).
 *
 * @author code36u4r60
 */
public class Day06_LetsReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        String txt;
        char[] c;

        for (int i = 0; i < n; i++) {
            txt = input.next();
            c = txt.toCharArray();

            for (int j = 0; j < c.length; j += 2) {
                System.out.printf("%s", c[j]);
            }
            System.out.printf(" ");

            for (int j = 1; j < c.length; j += 2) {
                System.out.printf("%s", c[j]);
            }
            System.out.println("");
        }
    }

}
