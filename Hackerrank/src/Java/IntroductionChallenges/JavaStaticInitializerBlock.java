package Java.IntroductionChallenges;

import java.util.Scanner;

/**
 * <p>
 * Static initialization blocks are executed when the class is loaded, and you can initialize static
 * variables in those blocks.</p>
 *
 * <p>
 * It's time to test your knowledge of Static initialization blocks. You can read about it
 * <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html"> here</a>.</p>
 *
 * <p>
 * You are given a class Solution with a main method. Complete the given code so that it outputs the
 * area of a parallelogram with breadth <em>B</em> and height <em>H</em>. You should read the
 * variables from the standard input.</p>
 *
 * <p>
 * if <em>B &le; 0 or H &le; 0</em>, the output should de
 * <code>"java.lang.Exception: Breadth and height must be positive"</code> without quotes.</p>
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>There are two lines of input. The first line contains <em>B</em>: the breadth of the
 * parallelogram. The next line contains <em>H</em>: the height of the parallelogram.</p>
 *
 * <p>
 * <strong>Constraints</strong>
 * <ul>
 * <li> -100 &le; <em>B</em> &le; 100
 * <li> -100 &le; <em>H</em> &le; 100
 * </ul>
 *
 * <p>
 * <strong>Output Format</strong>
 * <br>If both values are greater than zero, then the main method must output the area of the
 * parallelogram. Otherwise, print <em>"java.lang.Exception: Breadth and height must be
 * positive"</em> without quotes.</p>
 *
 * <p>
 * <strong>Sample input 1</strong>
 * <pre><code>
 *      1
 *      3
 * </code></pre>
 *
 * <p>
 * <strong>Sample output 1</strong>
 * <pre><code>
 *      3
 * </code></pre>
 *
 * <p>
 * <strong>Sample input 2</strong>
 * <pre><code>
 *      -1
 *      2
 * </code></pre>
 *
 * <p>
 * <strong>Sample output 1</strong>
 * <pre><code>
 *      java.lang.Exception: Breadth and height must be positive
 * </code></pre>
 *
 * @author code36u4r60
 */
public class JavaStaticInitializerBlock {

    static final Scanner input = new Scanner(System.in);

    //Opção 1
    static int B = input.nextInt();
    static int H = input.nextInt();
    static boolean flag = !(B <= 0 || H <= 0);

    static {
        if (!flag) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }

}
