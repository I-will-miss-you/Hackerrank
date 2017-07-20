package Java.IntroductionChallenges;

import java.util.Scanner;

/**
 * <p>
 * <strong>Objective</strong>
 * <br>In this challenge, we're going to use loops to help us do some simple math.</p>
 *
 * <p>
 * <strong>Task</strong>
 * <br>Given an integer, <i>N</i> , print its first <i>10</i> multiples. Each multiple <i>N</i> x
 * <i>i</i> (where 1 &le; <i>i</i> &le; 10) should be printed on a new line in the form: N x i =
 * result.</p>
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>A single integer,<i>N</i>.</p>
 *
 * <p>
 * <strong>Constraints</strong>
 * <ul><li>2 &le; <i>N</i> &le; 20</li></ul>
 *
 *
 * <p>
 * <strong>Output Format</strong>
 * <br>Print <i>10</i> lines of output; each line <i>i</i> (where 1 &le; <i>i</i> &le; 10) contains
 * the <i>result</i> of <i>N</i> x <i>i</i> in the form:
 * <br>N x i = result.</p>
 *
 * <p>
 * <strong>Sample Input</strong>
 * <br><code>2</code></p>
 *
 * <p>
 * <strong>Sample Output</strong>
 * <pre><code>
 *  2 x 1 = 2
 *  2 x 2 = 4
 *  2 x 3 = 6
 *  2 x 4 = 8
 *  2 x 5 = 10
 *  2 x 6 = 12
 *  2 x 7 = 14
 *  2 x 8 = 16
 *  2 x 9 = 18
 *  2 x 10 = 20
 *</code></pre>
 *
 *
 * @author code36u4r60
 */
public class JavaLoops_I {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (i * n));
        }
    }

}
