package _30DaysOfCodeChallenges;

/**
 * Classe <code>Person</code> de complemento a resolução do desafio
 * <code>Day4_Class_Vs_Instance</code>
 *
 * @author code36u4r60
 */
public class Person {

    private int age;

    public Person(int initialAge) {
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;
        } else {
            age = initialAge;
        }
    }

    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        age++;
    }
}
