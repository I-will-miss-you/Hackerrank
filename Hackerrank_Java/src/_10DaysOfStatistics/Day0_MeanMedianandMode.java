package _10DaysOfStatistics;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * <h3>Objective</h3>
 * In this challenge, we practice calculating the mean, median, and mode. Check out the
 * <a href="https://www.hackerrank.com/challenges/s10-basic-statistics/tutorial">Tutorial</a> tab
 * for learning materials and an instructional video!
 *
 * <h3>Task</h3>
 * Given an array, <em>X</em>, of <em>N</em> integers, calculate and print the respective mean,
 * median, and mode on separate lines. If your array contains more than one modal value, choose the
 * numerically smallest one.
 *
 * <p>
 * <strong>Note</strong> Other than the modal value (which will always be an integer), your answers
 * should be in decimal form, rounded to a scale of <em>1</em> decimal place (i.e., 12.3, 7.0
 * format).
 *
 * <h3>Input Format</h3>
 * The first line contains an integer, <em>N</em>, denoting the number of elements in the array. The
 * second line contains <em>N</em> space-separated integers describing the array's elements.
 *
 * <h3>Constraints</h3>
 * <ul>
 * <li> 10 &le; <em>N</em> &le; 2500
 * <li> 0 &lt; x<sub>i</sub> &le; 10<sup>5</sup>, where <em>x<sub>i</sub></em> is the
 * <em>i<sup>th</sup></em> element of the array.
 * </ul>
 *
 * <h3>Output Format</h3>
 * Print <em>3</em> lines of output in the following order:
 * <ol>
 * <li> Print the <em>mean</em> on a new line, to a scale of <em>1</em> decimal place (i.e., 12.3,
 * 7.0).
 * <li> Print the <em>median</em> on a new line, to a scale of <em>1</em> decimal place (i.e., 12.3,
 * 7.0).
 * <li> Print the <em>mode</em> on a new line; if more than one such value exists, print the
 * numerically smallest one.
 * </ol>
 *
 * <h3>Sample Input</h3>
 * <pre><code>
 *  10
 *  64630 11735 14216 99233 14470 4978 73429 38120 51135 67060
 * </code></pre>
 *
 * <h3>Sample Output</h3>
 * <pre><code>
 *  43900.6
 *  44627.5
 *  4978
 * </code></pre>
 *
 * <h3>Explanation</h3>
 * <h4>Mean:</h4>
 * We sum all <em>N</em> elements in the array, divide the sum by <em>N</em>, and print our result
 * on a new line.
 * <br>
 * <br> &mu; = (x<sub>0</sub> + x<sub>1</sub> + x<sub>2</sub> + x<sub>3</sub> + x<sub>4</sub> +
 * x<sub>5</sub> + x<sub>6</sub> + x<sub>7</sub> + x<sub>8</sub> + x<sub>9</sub>) / 10 =
 * <br> 439006 / 10 = 43900.6
 *
 * <h4>Median:</h4>
 * To calculate the median, we need the elements of the array to be sorted in either non-increasing
 * or non-decreasing order. The sorted array
 * <br>
 * <br> X = {4978, 11735, 14216, 14470, 38120, 55135, 64630, 67060, 73429, 99233}. We the average
 * the two middle elements:
 * <br>
 * <br> <em>median</em> = (x<sub>4</sub> + x<sub>5</sub>) / 2 = 89255 / 2 = 44627.5
 * <br> and print our result a new line.
 *
 * <h3>Mode:</h3>
 * We can find the number of occurrences of all the elements in the array:
 * <pre><code>
 *  4978 : 1
 * 11735 : 1
 * 14216 : 1
 * 14470 : 1
 * 38120 : 1
 * 51135 : 1
 * 64630 : 1
 * 67060 : 1
 * 73429 : 1
 * 99233 : 1
 * </code></pre> Every number occurs once, making <em>1</em> the maximum number of occurrences for
 * any number in <em>X</em>. Because we have multiple values to choose from, we want to select the
 * smallest one, <em>4978</em>, and print it on a new line.
 *
 * @author code36u4r60
 */
public class Day0_MeanMedianandMode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < qtd; i++) {
            nums.add(scan.nextInt());
        }

        double mean = nums.stream().mapToDouble(e -> e).average().getAsDouble();

        double median = nums.stream()
                .sorted(Integer::compare)
                .skip(nums.size() / 2 - 1)
                .limit(2).mapToDouble(e -> e)
                .average().getAsDouble();

        TreeMap<Integer, Integer> mode = new TreeMap<>();
        nums.forEach((num) -> {
            if (mode.containsKey(num)) {
                mode.put(num, mode.get(num) + 1);
            } else {
                mode.put(num, 1);
            }
        });

        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode.entrySet().stream().max((o1, o2) -> {
            return o1.getValue().compareTo(o2.getValue());
        }).get().getKey());
    }

}
