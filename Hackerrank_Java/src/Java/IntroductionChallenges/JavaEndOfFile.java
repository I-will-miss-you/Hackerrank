package Java.IntroductionChallenges;

import java.util.Scanner;

/**
 * <p>
 * The challenge here is to read <em>n</em> lines of input until you reach EOF, then number and
 * print all <em>n</em> lines of content.</p>
 *
 * <p>
 * <strong>Hint:</strong> Java's <code>Scanner.hasNext()</code> method is helpful for this
 * problem.</p>
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>Read some unknown <em>n</em> lines of input from stdin(System.in) until you reach EOF; each
 * line of input contains a non-empty String.</p>
 *
 * <p>
 * <strong>Output Format</strong>
 * <br> For each line, print the line number, followed by a single space, and then the line content
 * received as input.</p>
 *
 * <p>
 * <strong>Sample Input</strong>
 * <pre><code>
 *  Hello world
 *  I am a file
 *  Read me until end-of-file.
 * </code></pre>
 *
 * <p>
 * <strong>Sample Output</strong>
 * <pre><code>
 *  1 Hello world
 *  2 I am a file
 *  3 Read me until end-of-file.
 * </code></pre>
 *
 * @author code36u4r60
 */
public class JavaEndOfFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0;
        while (input.hasNext()) {
            System.out.println(++i + " " + input.nextLine());
        }
    }

}
