/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _30DaysOfCodeChallenges;

import java.util.Scanner;

/**
 * <p>
 * <strong>Objective</strong>
 * <br>Today, we're taking what we learned yesterday about Inheritance and extending it to Abstract
 * Classes. Because this is a very specific Object-Oriented concept, submissions are limited to the
 * few languages that use this construct. Check out the Tutorial tab for learning materials and an
 * instructional video!
 *
 * <p>
 * <strong>Task</strong>
 * <br>Given a Book class and a Solution class, write a MyBook class that does the following:
 * <ul>
 * <li>Inherits from Book
 * <li>Has a parameterized constructor taking these <em>3</em> parameters:
 * <ol>
 * <li>String <em>title</em>
 * <li>String <em>author</em>
 * <li>int <em>price</em>
 * </ol>
 * <li>implements the <em>Book class</em> abstract <em>display()</em> method so it prints these
 * <em>3</em> lines:
 * <ol>
 * <li><em>Title:</em>, a space, and then the current instane's <em>title</em>.
 * <li><em>Author:</em>, a space, and then the current instance's <em>author</em>.
 * <li><em>Price;</em>, a space, and then the current instance´s <em>price</em>.
 * </ol>
 * </ul>
 *
 * <p>
 * <strong>Note:</strong>Because these classes are being written in the same file, you must not use
 * an access modifier (e.g.: <em>public</em>) when declaring <em>MyBook</em> or your code will not
 * execute.
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>You are not responsible for reading any input from stdin. The Solution class creates a Book
 * object and calls the <em>MyBook</em> class constructor (passing it the necessary arguments). It
 * then calls the <em>display</em> method on the <em>Book</em> object.
 *
 * <p>
 * <strong>Output Format</strong>
 * <br>The <em>void display()</em> methos should print and label respective <em>title, author</em>
 * and <em>price</em> of the <em>MyBook</em> object's instance (with each value on its own line)
 * like so:
 * <pre><code>
 *  Title: $title
 *  Author: $author
 *  Price: $price
 * </code></pre>
 *
 * <p>
 * <strong>Sample Input</strong>
 * <br>The following input from stdin is handled by the locked stub code in your editor:
 * <pre><code>
 *  The Alchemist
 *  Paulo Coelho
 *  248
 * </code></pre>
 *
 * <p>
 * <strong>Sample Output</strong>
 * <br>The following output is printed by your <em>display()</em> method:
 * <pre><code>
 *  Title: The Alchemist
 *  Author: Paulo Coelho
 *  Price: 248
 * </code></pre>
 *
 *
 * @author code36u4r60
 */
public class Day13_AbstractClasses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}

class MyBook extends Book {

    int price;

    /**
     * Class Constructor
     *
     * @param title The book's title.
     * @param author The book's author.
     * @param price The book's price.
     */
    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    /**
     * Method Name: display
     *
     * Print the title, author, and price in the specified format.
     */
    @Override
    void display() {
        System.out.println("Title: " + super.title);
        System.out.println("Author: " + super.author);
        System.out.println("Price: " + this.price);
    }

}

abstract class Book {

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}
