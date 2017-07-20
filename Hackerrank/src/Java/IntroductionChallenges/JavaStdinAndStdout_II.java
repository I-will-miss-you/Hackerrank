package Java.IntroductionChallenges;

import java.util.Scanner;

/**
 * <p>
 * In this challenge, you must read an <code>integer</code>, a <code>double</code>, and a
 * <code>String</code> from stdin, then print the values according to the instructions in the
 * <em>Output Format</em> section below. To make the problem a little easier, a portion of the code
 * is provided for you in the editor.</p>
 *
 * <p>
 * <strong>Note:</strong> We recommend completing <em>Java Stdin and Stdout I</em> before attempting
 * this challenge.</p>
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>There are three lines of input:
 * <ol>
 * <li>The first line contains an <code>integer</code>.
 * <li>The second line contains a <code>double</code>.
 * <li>The third line contains a <code>String</code>.
 * </ol>
 *
 * <p>
 * <strong>Output Format</strong>
 * <br>There are three lines of output:
 * <ol>
 * <li>On the first line, print <em>String</em>: followed by the unaltered <code>String</code> read
 * from stdin.
 * <li>On the second line, print <em>Double</em>: followed by the unaltered <code>double</code> read
 * from stdin.
 * <li>On the third line, print <em>Int</em>: followed by the unaltered <code>integer</code> read
 * from stdin.
 * </ol>
 *
 * <p>
 * To make the problem easier, a portion of the code is already provided in the editor.</p>
 *
 * <p>
 * <strong>Note:</strong> If you use the <code>nextLine()</code> method immediately following the
 * <code>nextInt()</code> method, recall that <code>nextInt()</code> reads integer tokens; because
 * of this, the last newline character for that line of integer input is still queued in the input
 * buffer and the next <code>nextLine()</code> will be reading the remainder of the integer line
 * (which is empty).</p>
 *
 * <p>
 * <strong>Sample Input</strong>
 * <code>
 * <br>42
 * <br>3.1415
 * <br>Welcome to HackerRank's Java tutorials!
 * </code>
 * </p>
 *
 * <p>
 * <strong>Sample Output</strong>
 * <code>
 * <br>String: Welcome to HackerRank's Java tutorials!
 * <br>Double: 3.1415
 * <br>Int: 42</code></p>
 *
 * @author code36u4r60
 */
public class JavaStdinAndStdout_II {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
