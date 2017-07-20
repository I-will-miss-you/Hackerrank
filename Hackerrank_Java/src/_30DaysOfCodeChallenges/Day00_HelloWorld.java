package _30DaysOfCodeChallenges;

import java.util.Scanner;

/**
 * <p>
 * <strong>Objective</strong>
 * <br>In this challenge, we review some basic concepts that will get you started with this series.
 * You will need to use the same (or similar) syntax to read input and write output in challenges
 * throughout HackerRank. Check out the
 * <a href="https://www.hackerrank.com/challenges/30-hello-world/tutorial">Tutorial</a> tab for
 * learning materials and an
 * <a href="https://www.youtube.com/watch?v=K5WxmFfIWbo">instructional video!</a></p>
 *
 * <p>
 * <strong>Task</strong>
 * <br>To complete this challenge, you must save a line of input from stdin to a variable, print
 * <i>Hello, World.</i> on a single line, and finally print the value of your variable on a second
 * line.
 * <br><i>You've got this!</i>
 * </p>
 *
 * <p>
 * <strong>Note:</strong>
 * <br>The instructions are Java-based, but we support submissions in many popular languages. You
 * can switch languages using the drop-down menu above your editor, and the <em>inputString</em>
 * variable may be written differently depending on the best-practice conventions of your submission
 * language.</p>
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>A single line of text denoting <em>inputString</em>(the variable whose contents must be
 * printed).</p>
 *
 * <p>
 * <strong>Output Format</strong>
 * <br>Print <i>Hello, World</i>. on the first line, and the contents of <em>inputString</em> on the
 * second line.
 * </p>
 *
 * <p>
 * <strong>Sample Input</strong>
 * <br><code>Welcome to 30 Days of Code!</code>
 * </p>
 *
 * <p>
 * <strong>Sample Output</strong>
 * <br><code>Hello, World.</code>
 * <br><code>Welcome to 30 Days of Code!</code>
 * </p>
 *
 * <p>
 * <strong>Explanation</strong>
 * <br>On the first line, we print the string literal <i>Hello, World.</i>. On the second line, we
 * print the contents of the <em>inputString</em>variable which, for this sample case, happens to be
 * Welcome to <i>30 Days of Code!</i>. <em>If you do not print the variable's contents to stdout,
 * you will not pass the hidden test case.</em>
 *
 * @author code36u4r60
 */
public class Day00_HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);

        // Read a full line of input from stdin and save it to our variable, inputString.
        String inputString = scan.nextLine();

        // Close the scanner object, because we've finished reading
        // all of the input from stdin needed for this challenge.
        scan.close();

        // Print a string literal saying "Hello, World." to stdout.
        System.out.println("Hello, World.");

        // TODO: Write a line of code here that prints the contents of inputString to stdout.
        System.out.println(inputString);
    }

}
