/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _30DaysOfCodeChallenges;

import java.util.Scanner;

/**
 * <p>
 * <strong>Objective</strong>
 * <br>Today, we're learning about the Array data structure. Check out the Tutorial tab for learning
 * materials and an instructional video!</p>
 *
 * <p>
 * <strong>Task</strong>
 * <br>Given an array, <em>A</em>, of <em>N</em> integers, print <em>A</em>'s elements in reverse
 * order as a single line of space-separated numbers.</p>
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>The first line contains an integer,<em>N</em> (the size of our array).
 * <br>The second line contains <em>N</em> space-separated integers describing array <em>A</em>'s
 * elements.</p>
 *
 * <p>
 * <strong>Constraints</strong>
 * <ul>
 * <li> 1 &le; <em>N</em> &le; 1000
 * <li> 1 &le; <em>A<sub>i</sub></em> &le; 10000, where <em>A<sub>i</sub></em> is the
 * <em>i<sup>th</sup></em> integer in the array.
 * </ul>
 *
 * <p>
 * <strong>Output Format</strong>
 * <br>Print the elements of array <em>A</em> in reverse order as a single line of space-separated
 * numbers.</p>
 *
 * <p>
 * <strong>Sample Input</strong>
 * <pre><code>
 *      4
 *      1 4 3 2
 * </code></pre>
 *
 * <p>
 * <strong>Sample Output</strong>
 * <pre><code>
 *      2 3 4 1
 * </code></pre>
 *
 * @author code36u4r60
 */
public class Day07_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = arr.length - 1; i > 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr[0]);
        in.close();
    }

}
