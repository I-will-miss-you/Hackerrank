package _10DaysOfStatistics;

/**
 * <h3>Objective</h3>
 * In this challenge, we practice calculating probability. Check out the
 * <a href="https://www.hackerrank.com/challenges/s10-mcq-1/tutorial">Tutorial</a> tab for a
 * breakdown of probability fundamentals!
 *
 * <h3>Task</h3>
 * In a single toss of <em>2</em> fair (evenly-weighted) six-sided dice, find the probability that
 * their sum will be at most <em>9</em>.
 *
 * <ul>
 * <li> 2 / 3
 * <li> 1 / 4
 * <li> 5 / 6 &radic;
 * <li> 1 / 6
 * </ul>
 *
 * <p>
 * We define <em>E</em> to be the event in which the sum rolled by two evenly-weighted dice is &gt;
 * 9.
 * <p>
 * The set of outcomes satisfying <em>E</em> is: {(4,6),(5,5),(5,6),(6,4),(6,5),(6,6)}. We can use
 * this to find:
 * <p>
 * <code>P(E) = |E| / |S| = 6 / 36 = 1 / 6</code>
 *
 * <p>
 * We want to find the probability of sum being &le;<em>9</em>. Because we have <em>P(E)</em> and we
 * know that the probability we want comprises the rest of the sample space, we calculate it as
 * follows:<em>1 - P(E) = 1 - 1/6 = 5/6</em>
 *
 * @author code36u4r60
 */
public class Day2_BasicProbability {

}
