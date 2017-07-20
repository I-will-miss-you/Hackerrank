package _30DaysOfCodeChallenges;

import java.util.Scanner;

/**
 * <p>
 * <strong>Objective</strong>
 * <br>In this challenge, you'll work with arithmetic operators. Check out the Tutorial tab for
 * learning materials and an instructional video!
 * </p>
 *
 * <p>
 * <strong>Task</strong>
 * <br>Given the meal price (base cost of a meal), tip percent (the percentage of the meal price
 * being added as tip), and tax percent (the percentage of the meal price being added as tax) for a
 * meal, find and print the meal's total cost.</p>
 *
 * <p>
 * <strong>Note:</strong> Be sure to use precise values for your calculations, or you may end up
 * with an incorrectly rounded result!</p>
 *
 * <p>
 * <strong>Input Format</strong>
 * <br> There are <i>3</i> lines of numeric input:
 * <br> The first line has a double, <em>mealCost</em>(the cost of the meal before tax and tip).
 * <br> The second line has an integer, <em>tipPercent</em> (the percentage of <em>mealCost</em>
 * being added as tip).
 * <br> The third line has an integer, <em>taxPercent</em> (the percentage of <em>mealCost</em>
 * being added as tax).
 * </p>
 *
 * <p>
 * <strong>Output Format</strong>
 * <br>Print The total meal cost is totalCost dollars., where <em>totalCost</em> is the rounded
 * integer result of the entire bill (<em>mealCost</em> with added tax and tip).</p>
 *
 * <p>
 * <strong>Sample Input</strong>
 * <code>
 * <br>12.00
 * <br>20
 * <br>8
 * </code>
 * </p>
 *
 * <p>
 * <strong>Sample Output</strong>
 * <br><code>The total meal cost is 15 dollars.</code></p>
 *
 * <p>
 * <strong>Explanation</strong>
 * <br>Given:
 * <br><em>mealCost</em> = 12, <em>tipPercent</em> = 20, <em>taxPercent</em> = 8
 * <br><br>Calculations:
 * <em>
 * <br> tip = 12 x 20 / 100 = 1.4
 * <br> tax = 12 x 8 / 100 = 0.96
 * <br> totalCost = mealCost + tip + tax = 12 + 2.4 + 0.96 = 15.36
 * <br> round(totalCost) = 15
 * </em>
 * <br><br> We round <em>totalCost</em> to the nearest dollar (integer) and then print our result:
 * <br><code>The total meal cost id 15 dollars.</code>
 *
 *
 * @author code36u4r60
 */
public class Day02_Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;
        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost + tip + tax);

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }

}
