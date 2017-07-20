package Java.IntroductionChallenges;

import java.util.Scanner;

/**
 * <p>
 * Java's <code>System.out.printf</code> function can be used to print formatted output. The purpose
 * of this exercise is to test your understanding of formatting output using
 * <code>printf</code>.</p>
 *
 * <p>
 * To get you started, a portion of the solution is provided for you in the editor; you must format
 * and print the input to complete the solution.</p>
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>Every line of input will contain a String followed by an integer.
 * <br>Each String will have a maximum of <i>10</i> alphabetic characters, and each integer will be
 * in the inclusive range from <i>0</i>
 * to <i>999</i>.</p>
 *
 * <p>
 * <strong>Output Format</strong>
 * <br>In each line of output there should be two columns:
 * <br>The first column contains the String and is left justified using exactly <i>15</i>
 * characters.
 * <br>The second column contains the integer, expressed in exactly <i>3</i> digits; if the original
 * input has less than three digits, you must pad your output's leading digits with zeroes.</p>
 *
 * <p>
 * <strong>Sample Input</strong>
 * <code>
 * <br>java 100
 * <br>cpp 65
 * <br>python 50
 * </code>
 * </p>
 * <p>
 * <strong>Sample Output</strong>
 * <pre>
 * <code>
 * ================================
 *  java 100
 *  cpp 065
 *  python 050
 * ================================
 * </code></pre>
 *
 * <p>
 * Explanation Each String is left-justified with trailing whitespace through the first <i>15</i>
 * characters. The leading digit of the integer is the <i>16</i> character, and each
 * <code>integer</code> that was less than <i>3</i> digits now has leading zeroes.</p>
 *
 * @author code36u4r60
 */
public class JavaOutputFormatting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d %n", s1, x);
        }
        System.out.println("================================");
    }

}
