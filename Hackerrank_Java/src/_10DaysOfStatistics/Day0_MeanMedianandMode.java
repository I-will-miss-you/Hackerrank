/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _10DaysOfStatistics;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

/**
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
