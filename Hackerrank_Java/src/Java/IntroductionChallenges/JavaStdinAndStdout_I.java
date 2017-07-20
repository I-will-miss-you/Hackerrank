package Java.IntroductionChallenges;

import java.util.Scanner;

/**
 * <p>
 * Most HackerRank challenges require you to read input from <em>stdin</em> (standard input) and
 * write output to <em>stdout</em> (standard output).</p>
 * <p>
 * One popular way to read input from stdin is by using the <em>Scanner</em> class and specifying
 * the <em>Input Stream</em> as <em>System.in</em>.
 * <br>For example:
 *
 * <pre>
 * <code>
 *  Scanner scanner = new Scanner(System.in);
 *  String myString = scanner.next();
 *  int myInt = scanner.nextInt();
 *  scanner.close();
 *
 *  System.out.println("myString is: " + myString);
 *  System.out.println("myInt is: " + myInt);
 * </code>
 * </pre>
 *
 * <p>
 * The code above creates a <em>Scanner</em> object named <em>scanner</em> and uses it to read a
 * <em>String</em> and an <em>int</em>. It then <em>closes</em> the <em>Scanner</em> object because
 * there is no more input to read, and prints to stdout using <em>System.out.println(String)</em>.
 * So, if our input is:
 * <br>
 * <br><code>Hi 5</code>
 * <br>
 * <br>Our code will print:
 * <code>
 * <br>
 * <br>myString is: Hi
 * <br>myInt is: 5
 * </code>
 * <br>
 * <br>Alternatively, you can use the <em>BufferedReader class.</em></p>
 *
 * <p>
 * <strong>Task</strong>
 * <br>In this challenge, you must read 3 integers from stdin and then print them to stdout. Each
 * integer must be printed on a new line. To make the problem a little easier, a portion of the code
 * is provided for you in the editor below.</p>
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>There are 3 lines of input, and each line contains a single integer.</p>
 * <p>
 * <strong>Sample Input</strong>
 * <pre>
 * <code>
 *  42
 *  100
 *  125
 * </code>
 * </pre>
 *
 * <p>
 * <strong>Sample Output</strong>
 * <pre><code>
 *  42
 *  100
 *  125</code></pre>
 *
 * @author code36u4r60
 */
public class JavaStdinAndStdout_I {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
