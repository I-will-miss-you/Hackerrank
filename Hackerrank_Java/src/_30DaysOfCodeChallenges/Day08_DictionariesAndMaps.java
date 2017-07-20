package _30DaysOfCodeChallenges;

import java.util.HashMap;
import java.util.Scanner;

/**
 * <p>
 * <strong>Objective</strong>
 * <br>Today, we're learning about Key-Value pair mappings using a Map or Dictionary data structure.
 * Check out the Tutorial tab for learning materials and an instructional video! </p>
 *
 * <p>
 * <strong>Task</strong>
 * <br>Given <em>n</em> names and phone numbers, assemble a phone book that maps friends' names to
 * their respective phone numbers. You will then be given an unknown number of names to query your
 * phone book for. For each <em>name</em> queried, print the associated entry from your phone book
 * on a new line in the form name=phoneNumber; if an entry for <em>name</em> is not found, print <code>Not
 * found instead</code>.</p>
 *
 * <p>
 * <strong>Note:</strong> Your phone book should be a Dictionary/Map/HashMap data structure.</p>
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>The first line contains an integer, <em>n</em>, denoting the number of entries in the phone
 * book.
 * <br>Each of the <em>n</em> subsequent lines describes an entry in the form of <em>2</em>
 * space-separated values on a single line. The first value is a friend's name, and the second value
 * is an <em>8</em>-digit phone number.</p>
 * <p>
 * After the <em>n</em> lines of phone book entries, there are an unknown number of lines of
 * queries. Each line (query) contains a <em>name</em> to look up, and you must continue reading
 * lines until there is no more input.</p>
 * <p>
 * <strong>Note:</strong> Names consist of lowercase English alphabetic letters and are first names
 * only.</p>
 *
 * <p>
 * <strong>Constraints</strong>
 * <ul>
 * <li>1 &le; n &le; 10<sup>5</sup></li>
 * <li>1 &le; queries &le; 10<sup>5</sup></li>
 * </ul>
 *
 * <p>
 * <strong>Output Format</strong>
 * <br>On a new line for each query, print <code>Not found</code> if the name has no corresponding
 * entry in the phone book; otherwise, print the full <em>name</em> and <em>phoneNumber</em> in the
 * format name=phoneNumber.</p>
 *
 * <p>
 * <strong>Sample Input</strong>
 * <pre><code>
 *      3
 *      sam 99912222
 *      tom 11122222
 *      harry 12299933
 *      sam
 *      edward
 *      harry
 * </code></pre>
 *
 * <p>
 * <strong>Sample Output</strong>
 * <pre><code>
 *      sam=99912222
 *      Not found
 *      harry=12299933
 * </code></pre>
 *
 * <p>
 * <strong>Explanation</strong>
 * <br>We add the following <em>n = 3</em>(Key,Value) pairs to our map so it looks like this:
 * <br>
 * <br><em>phoneBook = {(sam,99912222),(tom,11122222),(harry,12299933)}</em>
 * <br>
 * <br>We then process each query and print <em>key=value</em> if the queried <em>key</em> is found
 * in the map; otherwise, we print Not found.
 * <br>
 * <br> Query 0: sam
 * <br> Sam is one of the keys in our dictionary, so we print sam=99912222.
 * <br>
 * <br> Query 1: edward
 * <br> Edward is not one of the keys in our dictionary, so we print Not found.
 * <br>
 * <br> Query 2: harry
 * <br> Harry is one of the keys in our dictionary, so we print harry=12299933.
 *
 * @author code36u4r60
 */
public class Day08_DictionariesAndMaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> myMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            myMap.put(name, phone);
        }

        while (in.hasNext()) {
            String s = in.next();

            if (myMap.containsKey(s)) {
                System.out.println(s + "=" + myMap.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }

}
