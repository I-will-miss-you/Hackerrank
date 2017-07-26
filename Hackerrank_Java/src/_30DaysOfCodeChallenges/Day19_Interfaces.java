package _30DaysOfCodeChallenges;

import java.util.Scanner;

/**
 *
 *
 *
 * @author code36u4r60
 */
public class Day19_Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        AdvancedArithmetic myCalculator = new Calculator2();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}

interface AdvancedArithmetic {

    int divisorSum(int n);
}

/**
 * *
 * O nome da class é Calculadora2 pois já existe uma class Calculadora nesta package
 *
 * @author code36u4r60
 */
class Calculator2 implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
