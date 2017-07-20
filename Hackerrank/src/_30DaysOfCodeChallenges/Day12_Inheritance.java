package _30DaysOfCodeChallenges;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <p>
 * <strong>Objective</strong>
 * <br>Today, we're delving into Inheritance. Check out the attached tutorial for learning materials
 * and an instructional video!
 *
 * <p>
 * <strong>Task</strong>
 * <br>You are given two classes, Person and Student, where Person is the base class and Student is
 * the derived class. Completed code for Person and a declaration for Student are provided for you
 * in the editor. Observe that Student inherits all the properties of Person.
 * <br>
 * <br>Complete the Student class by writing the following:
 *
 * <ul>
 * <li>A Student class constructor, which has <em>4</em> parameters:
 * <ol>
 * <li> A string, <em>firstName</em>.
 * <li> A string, <em>lastName</em>.
 * <li> An integer, <em>id</em>.
 * <li> An integer array (or vector) of test scores, <em>scores</em>.
 * </ol>
 * <li>A char calculate() method that calculates a Student object's average and returns the grade
 * character representative of their calculated average:
 * </ul>
 *
 * <br>
 * <table style="border: 1px solid black; border-collapse: collapse;">
 * <caption>Grading Scale</caption>
 * <tr>
 * <th style="border: none;">Letter</th>
 * <th style="border: none;">Average(<i>a</i>)</th>
 * </tr>
 * <tr>
 * <td style=" text-align: center;"><strong>O</strong></td>
 * <td style=" text-align: center;">90 &le; a &le; 100</td>
 * </tr>
 * <tr>
 * <td style=" text-align: center;"><strong>E</strong></td>
 * <td>80 &le; a &lt; 90</td></tr>
 * <tr>
 * <td style=" text-align: center;"><strong>A</strong></td>
 * <td style=" text-align: center;">70 &le; a &lt; 80</td>
 * </tr>
 * <tr>
 * <td style=" text-align: center;"><strong>P</strong></td>
 * <td style=" text-align: center;">55 &le; a &lt; 70</td>
 * </tr>
 * <tr>
 * <td style=" text-align: center;"><strong>D</strong></td>
 * <td style=" text-align: center;">40 &le; a &lt; 55</td>
 * </tr>
 * <tr>
 * <td style=" text-align: center;"><strong>T</strong></td>
 * <td style=" text-align: center;">a &lt; 40</td>
 * </tr>
 * </table>
 *
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>The locked stub code in your editor calls your Student class constructor and passes it the
 * necessary arguments. It also calls the calculate method (which takes no arguments).
 * <br>
 * <br>You are not responsible for reading the following input from stdin:
 * <br>The first line contains <em>firstName, lastName</em>, and <em>id</em>, respectively. The
 * second line contains the number of test scores. The third line of space-separated integers
 * describes <em>scores</em>.
 *
 * <p>
 * <strong>Constraints</strong>
 * <ul>
 * <li> 1 &le; |<em>firstName</em>|,|<em>lastName</em>| &le; 10
 * <li> |<em>id</em>| = 7
 * <li> 0 &le; <em>score, average</em> &le; 100
 * </ul>
 *
 * <p>
 * <strong>Output Format</strong>
 * <br>This is handled by the locked stub code in your editor. Your output will be correct if your
 * Student class constructor and calculate() method are properly implemented.
 *
 * <p>
 * <strong>Sample Input</strong>
 * <pre><code>
 *      Heraldo Memelli 8135627
 *      2
 *      100 80
 * </code></pre>
 *
 * <p>
 * <strong>Sample Output</strong>
 * <pre><code>
 *      Name: Memelli, Heraldo
 *      ID: 8135627
 *      Grade: O
 * </code></pre>
 *
 * <p>
 * <strong>Explanation</strong>
 * <br>This student had <em>2</em> scores to average: <em>100</em> and <em>80</em>. The student's
 * average grade is (100 + 80) / 2 = 90. An average grade pf 90 corresponds to the letter grade
 * <em>O</em>, so our calculate() method should return the caracter <em>'O'</em>.
 *
 * @author code36u4r60
 */
public class Day12_Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}

class Person2 {

    String firstName;
    String lastName;
    int idNumber;

    // Constructor
    Person2(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                + "\nID: " + idNumber);
    }

}

class Student extends Person2 {

    private int[] testScores;

    /**
     * Class Constructor
     *
     * @param firstName - A string denoting the Person's first name.
     * @param lastName - A string denoting the Person's last name.
     * @param id - An integer denoting the Person's ID number.
     * @param scores - An array of integers denoting the Person's test scores.
     */
    public Student(String firstName, String lastName, int identification, int[] notas) {
        super(firstName, lastName, identification);
        testScores = Arrays.copyOf(notas, notas.length);
    }

    /**
     * Method Name: calculate
     *
     * @return A character denoting the grade.
     */
    public String calculate() {
        int media = 0;
        for (int i = 0; i < testScores.length; i++) {
            media += testScores[i];
        }
        media /= testScores.length;

        if (media < 40) {
            return "T";
        }
        if (media < 55) {
            return "D";
        }
        if (media < 70) {
            return "P";
        }
        if (media < 80) {
            return "A";
        }
        if (media < 90) {
            return "E";
        } else {
            return "O";
        }
    }

}
