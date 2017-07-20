package _30DaysOfCodeChallenges;

import java.util.Scanner;

/**
 * <p>
 * <strong>Objective</strong>
 * <br>In this challenge, we're going to learn about the difference between a class and an instance;
 * because this is an <em>Object Oriented</em> concept, it's only enabled in certain languages.
 * Check out the Tutorial tab for learning materials and an instructional video!</p>
 *
 * <p>
 * <strong>Task</strong>
 * <br>Write a Person class with an instance variable, <code>age</code>, and a constructor that
 * takes an integer, <code>initialAge</code>, as a parameter. The constructor must assign
 * <code>initialAge</code> to <code>age</code> after confirming the passed as
 * <code>initialAge</code> is not negative; if a negative argument is passed as
 * <code>initialAge</code>, the constructor should set <code>age</code> to <code>0</code> and print
 * Age is not valid, setting age to 0.. In addition, you must write the following instance methods:
 * <ol>
 * <li>yearPasses() should increase the <code>age</code> instance variable by <code>1</code>.
 * <li>amIOld() should perform the following conditional actions:
 * <ul>
 * <li> if <code>age</code> &lt; 13, print <code>You are young..</code>
 * <li> if <code>age</code> &ge; 13 and <code>age</code> &lt; 18, print
 * <code>You are a teenager..</code>
 * <li> Otherwise, print <code>You are old..</code>
 * </ul>
 * </ol>
 *
 * <p>
 * To help you learn by example and complete this challenge, much of the code is provided for you,
 * but you'll be writing everything in the future. The code that creates each instance of your
 * Person class is in the main method. Don't worry if you don't understand it all quite yet!</p>
 *
 * <p>
 * <strong>Note:</strong> Do not remove or alter the stub code in the editor.</p>
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>Input is handled for you by the stub code in the editor.
 * <br>The first line contains an integer, <em>T</em> (the number of test cases), and the <em>T</em>
 * subsequent lines each contain an integer denoting the <code>age</code> of a Person instance.</p>
 *
 * <p>
 * <strong>Constraints</strong>
 * <br>Output Format Complete the method definitions provided in the editor so they meet the
 * specifications outlined above; the code to test your work is already in the editor. If your
 * methods are implemented correctly, each test case will print <em>2</em> or <em>3</em> lines
 * (depending on whether or not a valid <code>initialAge</code> was passed to the constructor).</p>
 *
 * <p>
 * <strong>Sample Input</strong>
 * <code>
 * <br>4
 * <br>-1
 * <br>10
 * <br>16
 * <br>18
 * </code>
 *
 * <p>
 * <strong>Sample Output</strong>
 * <code>
 * <br>Age is not valid, setting age to 0.
 * <br>You are young.
 * <br>You are young.
 * <br>
 * <br>You are young.
 * <br>You are a teenager.
 * <br>
 * <br>You are a teenager.
 * <br>You are old.
 * <br>
 * <br>You are old.
 * <br>You are old.
 * </code>
 *
 * <p>
 * <strong>Explanation</strong>
 * <br>Test Case 0: <code>initialAge</code> = -1
 * <br>Because <code>initialAge</code> &lt;0, our code must be <code>age</code> to 0 and print the
 * "Age is not valid..." message followed by the young message. Three years pass and
 * <code>age</code> = 3 , so we print the young message again.
 * <br>
 * <br>Teste Case 1: <code>initialAge</code> = 10
 * <br>Because <code>initialAge</code> &lt;13, our code should print that the person is young. Three
 * years pass and <code>age</code> = 13, so we print that the person is now a teenager.
 * <br>
 * <br>Teste Case 2: <code>initialAge</code> = 16
 * <br>Because 13&le;<code>initialAge</code> &lt;18, our code should print that the person is a
 * teenager. Three years pass and <code>age</code> = 19, so we print that the person is old.
 * <br>
 * <br>Teste Case 3: <code>initialAge</code> = 18
 * <br>Because <code>initialAge</code> &ge;18, our code should print that the person is old. Three
 * years pass and the person is still old at <code>age</code> = 21, so we print the old message
 * again.
 *
 * <p>
 * The extra line at the end of the output is supposed to be there and is trimmed before being
 * compared against the test case's expected output. If you're failing this challenge, check your
 * logic and review your print statements for spelling errors.</p>
 *
 * @author code36u4r60
 */
public class Day04_Class_Vs_Instance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }

}
