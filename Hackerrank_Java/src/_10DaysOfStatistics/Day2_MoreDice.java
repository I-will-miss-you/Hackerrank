package _10DaysOfStatistics;

/**
 * <h3>Objective</h3>
 * In this challenge, we practice calculating probability. We recommend you review the previous
 * challenge's <a href="https://www.hackerrank.com/challenges/s10-mcq-1/tutorial">Tutorial</a>
 * before attempting this problem.
 *
 * <h3>Task</h3>
 * In a single toss of <em>2</em> fair (evenly-weighted) six-sided dice, find the probability that
 * the values rolled by each die will be different and the two dice have a sum of <em>6</em>.
 *
 * <ul>
 * <li> 1 / 9 &radic;
 * <li> 1 / 6
 * <li> 2 / 3
 * <li> 5 / 6
 * </ul>
 *
 * <p>
 * We define <em>E</em> to be the event satisfying the following conditions:
 * <ul>
 * <li> The values rolled by both dice are different.
 * <li> The sum of the values rolled is <em>6</em>.
 * </ul>
 *
 * <p>
 * The set outcomes satidfying <em>E</em> is:<em>{(1,5),(2,4),(4,2),(5,1)}</em>. We also know that
 * |<em>S</em>|(the size of the sample space) is <em>36</em>,because there are <em>6</em>
 * possible rolls per die and we have <em>2</em> dice <em>(6<sup>2</sup> = 36)</em>. We can use this
 * to find:
 *
 * <p>
 * <code>P(E) = |E|/|S| = 4/36 = 1/9</code>
 *
 * @author code36u4r60
 */
public class Day2_MoreDice {
}
