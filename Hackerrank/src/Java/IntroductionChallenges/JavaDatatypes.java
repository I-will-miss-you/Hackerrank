package Java.IntroductionChallenges;

import java.util.Scanner;

/**
 * <p>
 * Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For
 * this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and
 * long):
 * <ul>
 * <li>A byte is an 8-bit signed integer.
 * <li>A short is a 16-bit signed integer.
 * <li>An int is a 32-bit signed integer.
 * <li>A long is a 64-bit signed integer.
 * </ul>
 * <p>
 * Given an input integer, you must determine which primitive data types are capable of properly
 * storing that input.
 * <p>
 * To get you started, a portion of the solution is provided for you in the editor.
 * </p>
 *
 * <p>
 * <strong>Reference:</strong>
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html</p>
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>The first line contains an integer, <em>T</em>, denoting the number of test cases.
 * <br>Each test case, <em>T</em>, is comprised of a single line with an integer, <em>n</em> , which
 * can be arbitrarily large or small.
 * </p>
 *
 * <p>
 * <strong>Output</strong>
 * <br>Format For each input variable <em>n</em> and appropriate primitive <em>dataType</em> , you
 * must determine if the given primitives are capable of storing it. If yes, then print:
 * <pre>
 * <code>
 *     n can be fitted in:
 *     *dataType
 * </code></pre>
 *
 * <p>
 * If there is more than one appropriate data type, print each one on its own line and order them by
 * size (i.e.: <code>byte &lt; short &lt; int &lt; long</code>).</p>
 *
 * <p>
 * If the number cannot be stored in one of the four aforementioned primitives, print the line:
 * <br><code>n can't be fitted anywhere.</code></p>
 *
 * <p>
 * <strong>Sample Input</strong>
 * <pre><code>
 *  5
 *  -150
 *  150000
 *  1500000000
 *  213333333333333333333333333333333333
 *  -100000000000000
 * </code></pre>
 *
 * <p>
 * <strong>Sample Output</strong>
 * <pre><code>
 *  -150 can be fitted in:
 *  * short
 *  * int
 *  * long
 *  150000 can be fitted in:
 *  * int
 *  * long
 *  1500000000 can be fitted in:
 *  * int
 *  * long
 *  213333333333333333333333333333333333 can't be fitted anywhere.
 *  * -100000000000000 can be fitted in:
 *  * long
 * </code></pre>
 *
 * <p>
 * <strong>Explanation</strong>
 * <br> -150 can be stored in a short, an int, or a long.
 * <br>213333333333333333333333333333333333 is very large and is outside of the allowable range of
 * values for the primitive data types discussed in this problem.
 * </p>
 *
 * @author code36u4r60
 */
public class JavaDatatypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                }

                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }

                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }

                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }

}
