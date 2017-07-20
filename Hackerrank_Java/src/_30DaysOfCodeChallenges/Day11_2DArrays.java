package _30DaysOfCodeChallenges;

import java.util.Scanner;

/**
 * <p>
 * <strong>Objective</strong>
 * <br>Today, we're building on our knowledge of Arrays by adding another dimension. Check out the
 * <a href="https://www.hackerrank.com/challenges/30-2d-arrays/tutorial">Tutorial</a> tab for
 * learning materials and an instructional video!</p>
 *
 * <p>
 * <strong>Context</strong>
 * <br>Given a 6 x 6 2D Array, A:
 * <pre><code>
 *  1 1 1 0 0 0
 *  0 1 0 0 0 0
 *  1 1 1 0 0 0
 *  0 0 0 0 0 0
 *  0 0 0 0 0 0
 *  0 0 0 0 0 0
 * </code></pre>
 *
 * We define an hourglass in <em>A</em> to be a subset of values with indices falling in this
 * pattern in <em>A</em>'s graphical representation:
 *
 * <pre><code>
 *  a b c
 *    d
 *  e f g
 * </code></pre>
 *
 * There are <em>16</em> hourglasses in <em>A</em>, and an <i>hourglass sum</i> is the sum of
 * anhourglass' values.
 *
 * <p>
 * <strong>Task</strong>
 * <br>Calculate the hourglass sum for every hourglass in <em>A</em>, then print the maximum
 * hourglass sum.</p>
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>There are <em>6</em> lines of input, where each line contains <em>6</em> space-separated
 * integers describing 2D Array <em>A</em>; every value in <em>A</em> will be in the inclusive range
 * of <em>-9</em> to <em>9</em>.</p>
 *
 * <p>
 * <strong>Constraints</strong>
 * <ul>
 * <li> -9 &le; A[i][j] &le; 9</li>
 * <li> 0 &le; i, j &le; 5</li>
 * </ul>
 *
 * <p>
 * <strong>Output Format</strong>
 * <br>Print the largest (maximum) hourglass sum found in <em>A</em>.</p>
 *
 * <p>
 * <strong>Sample Output</strong>
 * <pre><code>  19</code></pre>
 *
 * <strong>Explanation</strong>
 * <br><em>A</em> contains the follwing hourglasses:
 * <pre><code>
 * 1 1 1   1 1 0   1 0 0   0 0 0
 *   1       0       0       0
 * 1 1 1   1 1 0   1 0 0   0 0 0
 *
 * 0 1 0   1 0 0   0 0 0   0 0 0
 *   1       1       0       0
 * 0 0 2   0 2 4   2 4 4   4 4 0
 *
 * 1 1 1   1 1 0   1 0 0   0 0 0
 *   0       2       4       4
 * 0 0 0   0 0 2   0 2 0   2 0 0
 *
 * 0 0 2   0 2 4   2 4 4   4 4 0
 *   0       0       2       0
 * 0 0 1   0 1 2   1 2 4   2 4 0
 * </code></pre>
 *
 * The hourglass with the maximum sum (<em>19</em>) is:
 *
 * <pre><code>
 *  2 4 4
 *    2
 *  1 2 4
 * </code></pre>
 *
 * @author code36u4r60
 */
public class Day11_2DArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int soma
                        = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                System.out.println("" + arr[i][j] + " " + arr[i][j + 1] + " " + arr[i][j + 2]);
                System.out.println("  " + arr[i + 1][j + 1]);
                System.out.println("" + arr[1 + 2][j] + " " + arr[i + 2][j + 1] + " " + arr[i + 2][j + 2]);
                System.out.println("Total =" + soma + "\n");

                max = Math.max(max, soma);
            }
        }

        System.out.println(max);
    }

}
