package Java.Strings;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * <p>
 * Two strings, a and b, are called anagrams if they contain all the same characters in the same
 * frequencies. For example, the anagrams of CAT are CAT, ACT, TAC,TCA, ATC, and CTA.
 *
 * <p>
 * Complete the function in the editor. If <em>a</em> and <em>b</em> are case-insensitive anagrams,
 * return <em>true</em>; otherwise, return <em>false</em> instead.
 *
 * <h3>Input Format</h3>
 * The first line contains a string denoting <em>a</em>.
 * <br>The seconde line contains a string denoting <em>b</em>.
 *
 * <h3>Constraints</h3>
 * <ul>
 * <li> 1 &le; <em>length(a), length(b) &le; 50</em>
 * <li> Strings <em>a</em> and <em>b</em> consist of English alphabetic characters.
 * <li> The comparison should NOT be case sensitive
 * </ul>
 *
 * <h3>Output Format</h3>
 * Return <em>true</em> if <em>a</em> and <em>b</em> are case-insensitive of each other; otherwise,
 * return <em>false</em> instead.
 *
 * <h3>Sample Input 0</h3>
 * <div><code>
 *  anagram
 *  margana
 * </code></div>
 *
 * <h3>Sample Output 0</h3>
 * <div><code>
 *  Anagrams
 * </code></div>
 *
 * <h3>Explanation 0</h3>
 * <table style="border: 1px solid black; border-collapse: collapse;">
 * <tr>
 * <th style="border: none;">Charater</th>
 * <th style="border: none;">Frequency: anagram</th>
 * <th style="border: none;">Frequency: margana</th>
 * </tr>
 * <tr style=" text-align: center;"><td>A or a</td><td>3</td><td>3</td></tr>
 * <tr style=" text-align: center;"><td>G or g</td><td>1</td><td>1</td></tr>
 * <tr style=" text-align: center;"><td>N or n</td><td>1</td><td>1</td></tr>
 * <tr style=" text-align: center;"><td>M or m</td><td>1</td><td>1</td></tr>
 * <tr style=" text-align: center;"><td>R or r</td><td>1</td><td>1</td></tr>
 * </table>
 * The two strings contain all the same letters in the same frequencies, so we return <em>true</em>.
 *
 * <h3>Sample Input 1</h3>
 * <div><code>
 *  anagramm
 *  marganaa
 * </code></div>
 *
 * <h3>Sample Output 1</h3>
 * <div><code>
 *  Not Anagrams
 * </code></div>
 *
 * <h3>Explanation 0</h3>
 * <table style="border: 1px solid black; border-collapse: collapse;">
 * <tr>
 * <th style="border: none;">Charater</th>
 * <th style="border: none;">Frequency: anagram</th>
 * <th style="border: none;">Frequency: margana</th>
 * </tr>
 * <tr style=" text-align: center;"><td>A or a</td><td>3</td><td>4</td></tr>
 * <tr style=" text-align: center;"><td>G or g</td><td>1</td><td>1</td></tr>
 * <tr style=" text-align: center;"><td>N or n</td><td>1</td><td>1</td></tr>
 * <tr style=" text-align: center;"><td>M or m</td><td>2</td><td>1</td></tr>
 * <tr style=" text-align: center;"><td>R or r</td><td>1</td><td>1</td></tr>
 * </table>
 * The two strings don't contain the same number of a's and m's, so we return <em>false</em>.
 *
 *
 * <h3>Sample Input 2</h3>
 * <div><code>
 *  Hello
 *  hello
 * </code></div>
 *
 * <h3>Sample Output 0</h3>
 * <div><code>
 *  Anagrams
 * </code></div>
 *
 * <h3>Explanation 2</h3>
 * <table style="border: 1px solid black; border-collapse: collapse;">
 * <tr>
 * <th style="border: none;">Charater</th>
 * <th style="border: none;">Frequency: anagram</th>
 * <th style="border: none;">Frequency: margana</th>
 * </tr>
 * <tr style=" text-align: center;"><td>E or e</td><td>3</td><td>3</td></tr>
 * <tr style=" text-align: center;"><td>H or h</td><td>1</td><td>1</td></tr>
 * <tr style=" text-align: center;"><td>L or l</td><td>1</td><td>1</td></tr>
 * <tr style=" text-align: center;"><td>O or o</td><td>1</td><td>1</td></tr>
 * </table>
 * The two strings contain all the same letters in the same frequencies, so we return <em>true</em>.
 *
 * @author code36u4r60
 */
public class JavaAnagrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a;
        String b;
        try (Scanner scan = new Scanner(System.in)) {
            a = scan.next();
            b = scan.next();
        }

        //Forma 1
        boolean ret1 = isAnagram(a, b);
        //Forma 2
        boolean ret2 = isAnagram2(a, b);

        System.out.println((ret1) ? "Anagrams" : "Not Anagrams");
        System.out.println((ret2) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }
        char[] arrayA = a.toLowerCase().toCharArray();
        Arrays.sort(arrayA);
        char[] arrayB = b.toLowerCase().toCharArray();
        Arrays.sort(arrayB);
        return Arrays.equals(arrayA, arrayB);
    }

    static boolean isAnagram2(String a, String b) {
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }
        char[] arrayA = a.toLowerCase().toCharArray();
        char[] arrayB = b.toLowerCase().toCharArray();

        TreeMap<Character, Integer> mapA = map(arrayA);
        TreeMap<Character, Integer> mapB = map(arrayB);

        return mapA
                .entrySet()
                .stream()
                .noneMatch((entry)
                        -> (!(Objects.equals(entry.getValue(),
                        mapB.get(entry.getKey())))));
    }

    /**
     * Cria uma estrutura do tipo Arvore em que cada key corresponde a uma letra e o seu value ao
     * número de vez que ela aparece no array
     *
     * @param arr array de valores
     * @return Treemap formada por: key = letra ; value = qtd de vez que aparece a key
     */
    private static TreeMap<Character, Integer> map(char[] arr) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], (map.get(arr[i]) + 1));
            } else {
                map.put(arr[i], 1);
            }
        }
        return map;
    }

}
