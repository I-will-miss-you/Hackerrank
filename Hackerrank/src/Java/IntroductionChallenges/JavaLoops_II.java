package Java.IntroductionChallenges;

import java.util.Scanner;

/**
 * <p>
 * We use the integers <i>a</i>, <i>b</i>, and <i>n</i> to create the following series:
 *
 * <br><br>
 * (a + 2<sup>2</sup>.b),(a + 2<sup>0</sup>.b + 2<sup>1</sup>.b), ... , (a + 2<sup>0</sup>.b +
 * 2<sup>1</sup>.b + ... + 2<sup>n-2</sup>)
 * <br>
 *
 * <br>You are given <i>q</i> queries in the form of <i>a</i>,<i>b</i>, and <i>n</i>. For each
 * query, print the series corresponding to the given <i>a</i>, <i>b</i> and <i>n</i> values as a
 * single line of <i>n</i> space-separated integer.
 * </p>
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>The first line contains an integer, <i>q</i>, denoting the number of queries.
 * <br>Each line <i>i</i> of the <i>q</i> subsequent lines contains three space-separated intergers
 * describing the respective <i>a<sub>i</sub></i>, <i>b<sub>i</sub></i> and <i>n<sub>i</sub></i>
 * values for that query.
 * </p>
 *
 * <p>
 * <strong>Constraits</strong>
 * <ul>
 * <li> 0 &le; q &le; 500
 * <li> 0 &le; a,b &le; 50
 * <li> 1 &le; n &le; 15
 * </ul>
 *
 * <p>
 * <strong>Output Format</strong>
 * <br>For each query, print the corresponding series on new line. Each series must be printed in
 * order as a single line of <i>n</i> space-separated integers. </p>
 *
 * <p>
 * <strong>Sample Input</strong>
 * <code>
 * <br>2
 * <br>0 2 10
 * <br>5 3 5
 * </code>
 * </p>
 *
 * <p>
 * <strong>Sample Output</strong>
 * <code>
 * <br>2 6 14 30 62 126 254 510 1022 2046
 * <br>8 14 26 50 98
 * </code>
 * </p>
 *
 * <p>
 * <strong>Explanation</strong>
 * <br> We have two queries:
 * <ol>
 * <li> We use <em>a = 0</em>, <em>b = 2</em>, and <em>n = 10</em> to produce some series
 * <em>s<sub>0</sub>, s<sub>1</sub>, ..., s<sub>n-1</sub>:</em>
 * <ul>
 * <li> s<sub>0</sub> = 0 + 1 . 2 = 2
 * <li> s<sub>1</sub> = 0 + 1 . 2 + 2 . 2 = 2
 * <li> s<sub>2</sub> = 0 + 1 . 2 + 2 . 2 + 4 . 2 = 2
 * </ul>
 * ... and so on.
 * <br> Once we hit <em>n = 10</em>, we print the first ten terms as a single line of
 * space-separated integers.
 * <li> we use <em>a = 5</em>, <em>b = 3</em>, and <em>n = 5</em> to produce some series
 * <em>s<sub>0</sub>, s<sub>1</sub>, ..., s<sub>n-1</sub>:</em>
 * <ul>
 * <li> s<sub>0</sub> = 5 + 1 . 3 = 8
 * <li> s<sub>1</sub> = 5 + 1 . 3 + 2 . 3 = 14
 * <li> s<sub>2</sub> = 5 + 1 . 3 + 2 . 3 + 4 . 3 = 26
 * <li> s<sub>3</sub> = 5 + 1 . 3 + 2 . 3 + 4 . 3 + 8 . 3 = 50
 * <li> s<sub>4</sub> = 5 + 1 . 3 + 2 . 3 + 4 . 3 + 8 . 3 + 16 . 3 = 98
 * </ul>
 * We then print each element of our series as a single line os space-separated values.
 * </ol>
 *
 * @author code36u4r60
 */
public class JavaLoops_II {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 0; j < n; j++) {
                a += (int) Math.pow(2, j) * b;
                System.out.print(a + " ");
            }
            System.out.println("");
        }
        in.close();
    }

}
