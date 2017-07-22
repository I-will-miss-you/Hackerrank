package _30DaysOfCodeChallenges;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <strong>Objective</strong>
 * <br>Today we're discussing scope. Check out the
 * <a href="https://www.hackerrank.com/challenges/30-scope/tutorial"> Tutorial</a> tab for learning
 * materials and an instructional video!
 * <p>
 * The <i>absolute difference</i> between two integers, <em>a</em> and <em>b</em>, is written as |a
 * - b|. The masimum absolute difference between two integers in a set of positive integers,
 * <em>elements</em> is the largest absolute difference between any two integers in
 * <em>elements</em>.
 *
 * <p>
 * The <em>Difference</em> class is started for you in the editor. It has a private integer array
 * (<em>elements</em>) for storing <em>N</em> nonnegative integers, and a public integer
 * (<em>maximumDifference</em>) for storing the maximum absolute difference.
 *
 * <h3>Task</h3>
 * Complete the <em>Difference</em> class by writing the following:
 * <ul>
 * <li>A class construtor that takes an array of integer as a parameter and saves it to the
 * <em>elements</em> isntance variable.
 * <li>A <em>computerDifference</em> method that finds the maximum abasolute between any 2 numbers
 * in <em>N</em> and stores it in the <em>maximumDifference</em> instance variable.
 * </ul>
 *
 * <h3>Input Format</h3>
 * You are not responsible for readin any inout from stdin. The locked <em>Solution</em> class in
 * your editor reads in <em>2</em> lines of input; yhe first line contains <em>N</em>, and the
 * seconds line describes the <em>elements</em> array.
 *
 * <h3>Constraints</h3>
 * <ul>
 * <li> 1 &le; N &le; 10
 * <li> 1 &le; <em>elements[i]</em> &le; 100, where <em>0 &le; i &le; N -1</em>
 * </ul>
 *
 * <h3>Outup Format</h3>
 * You are not responsible for printing any output; the <em>Solution</em> class will print yhe value
 * of the <em>maximumDifference</em> instance variable.
 *
 * <h3>Sample Input</h3>
 * <pre><code>
 *  3
 *  1   2   5
 * </code></pre>
 *
 * <h3>Sample Output</h3>
 * <pre><code>
 *  4
 * </code></pre>
 *
 * <h3>Explanation</h3>
 * The scope of the <em>elements</em> array and <em>maximumDifference</em> integer is the entire
 * class instance. The class constructor saves the argument passed to the constructor as the
 * <em>elements</em> instance (where the <em>computeDifference method can acess it</em>).
 *
 * <p>
 * To find the maximum difference, <em>computeDifference</em> checks each element in the array and
 * finds the maximum difference between any <em>2</em> elements: |1 - 2| = 1
 * <br>|1 - 5| = 4
 * <br>|2 - 5| = 3
 *
 * <p>
 * The maximum of these differences is <em>4</em>, so it saves the value <em>4</em> as the
 * <em>maximumDifference</em> instance variable.
 * <br>The locked stub code in the editor then prints the value stored as
 * <em>maximumDifference</em>, which is <em>4</em>.
 *
 * @author code36u4r60
 */
public class Day14_Scope {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a;
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
        }

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

}

class Difference {

    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int[] num = Arrays.copyOf(elements, elements.length);
        Arrays.sort(num);
        maximumDifference = num[num.length - 1] - num[0];
    }

}
