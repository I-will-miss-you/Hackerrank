package WeekOfCode34;

import java.util.Objects;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * <p>
 * You are given two arrays <em>A</em> and <em>B</em> containing <em>n</em> elements each. Choose a
 * pair of elements <em>(x,y)</em> such that:
 * <ul>
 * <li><em>x</em> belongs to array <em>A</em></li>
 * <li><em>y</em> belongs to array <em>B</em></li>
 * <li><em>gcd</em> is the maximum of all pairs <em>(x,y)</em>
 * </ul>
 *
 * <p>
 * If there is more than one such pair <em>(x,y)</em> having maximum gcd, then choose the one with
 * maximum sum. Print the sum of elements of this maximum-sum pair.</p>
 *
 * <p>
 * <em>Note:</em> <em>gcd(x,y)</em> returnas the largest integer that divides both x and y.
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>The first line of the input contains <em>n</em> denoting the total number of elements of
 * arrays <em>A</em> and <em>B</em> Next line contains n space separated positive integers denoting
 * the elements of array <em>A</em>. Next line contains n space separated positive integers denoting
 * the elements of array <em>B</em>.</p>
 *
 * <p>
 * <strong>Constraints</strong>
 * <ul>
 * <li> 1 &le; n &le; x 10<sup>5</sup></li>
 * <li> 1 &le; A<sub>i</sub> &le; x 10<sup>6</sup></li>
 * <li> 1 &le; B<sub>i</sub> &le; x 10<sup>6</sup></li>
 * </ul>
 *
 * <p>
 * <strong>Constraints</strong>
 * <br>From all the pairs having maximum <em>gcd</em>, print the sum of one that has the maximum
 * sum.
 *
 * <p>
 * <strong>Sample Input 0</strong>
 * <pre><code>
 *  5
 *  3 1 4 2 8
 *  5 2 12 8 3
 * </code></pre>
 *
 * <p>
 * <strong>Sample Output 0</strong>
 * <pre><code>
 *  16
 * </code></pre>
 *
 * <p>
 * <strong>Explanation 0</strong>
 * <br>Over all the pairs, if we choose <em>8</em> from array <em>A</em>, and <em>8</em> from array
 * <em>8</em>, we get <em>gcd(8,8) = 8</em>, which is the maximum gcd over all the pairs.
 * <br>Thus, maximum sum of pair (8,8) is equal to 8 + 8 = 16
 *
 * @author code36u4r60
 */
public class MaximumGcdAndSum {

    static int maximumGcdAndSum(TreeSet<Integer> listaA, TreeSet<Integer> listaB) {
        TreeMap<Integer, Integer> gcdMap = new TreeMap<>();

        ciclos(listaA, listaB, gcdMap);

        int maxSum = gcdMap.lastEntry().getValue();
        return maxSum;
    }

    private static void ciclos(TreeSet<Integer> listaA, TreeSet<Integer> listaB, TreeMap<Integer, Integer> gcdMap) {
        listaA.forEach((a) -> {
            listaB.forEach((b) -> {
                if (Objects.equals(a, b)) {
                    gcdMap.put(a, a + b);
                } else {
                    gcdMap.put(gcd(a, b), a + b);
                }
            });
        });
    }

    private static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        TreeSet<Integer> listaA = new TreeSet<>();
        for (int A_i = 0; A_i < n; A_i++) {
            listaA.add(in.nextInt());
        }

        TreeSet<Integer> listaB = new TreeSet<>();
        for (int B_i = 0; B_i < n; B_i++) {
            listaB.add(in.nextInt());
        }
        int res = maximumGcdAndSum(listaA, listaB);
        System.out.println(res);
    }

}
