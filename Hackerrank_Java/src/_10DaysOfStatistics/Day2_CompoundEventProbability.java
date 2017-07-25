package _10DaysOfStatistics;

/**
 * <h3>Objective</h3>
 * In this challenge, we practice calculating the probability of a compound event. We recommend you
 * review today's <a href="https://www.hackerrank.com/challenges/s10-mcq-1/tutorial">Probability
 * Tutorial</a> before attempting this challenge.
 *
 * <h3>Task</h3>
 * The are <em>3</em> urns <em>X</em>, <em>Y</em> and <em>Z</em>.
 * <ul>
 * <li> Urn <em>X</em> contains <em>4</em> red balls and <em>3</em> black balls
 * <li> Urn <em>Y</em> contains <em>5</em> red balls and <em>4</em> black balls
 * <li> Urn <em>Z</em> contains <em>4</em> red balls and <em>4</em> black balls
 * <li>
 * </ul>
 * One bal is drwan from each of the <em>3</em> urns. What is the probability that, of the
 * <em>3</em> balls drawn, <em>2</em> are red and <em>1</em> is black?
 *
 * <ul>
 * <li> 10 / 36
 * <li> 2 / 7
 * <li> 17 / 42 &radic;
 * <li> 31 / 126
 * </ul>
 *
 * <p>
 * Let's define the following events:
 * <p>
 * <strong>Urn X</strong>
 * <ul>
 * <li> E<sub>X,R</sub>: Four of the seven balls are <em>red</em>, so <em>P(E<sub>X,R</sub>) =
 * 4/7</em>
 * <li> E<sub>X,B</sub>: Three of the seven balls are <em>black</em>, so <em>P(E<sub>X,B</sub>) =
 * 3/7</em>
 * </ul>
 *
 * <p>
 * <strong>Urn Y</strong>
 * <ul>
 * <li> E<sub>Y,R</sub>: Five of the nine balls are <em>red</em>, so <em>P(E<sub>Y,R</sub>) =
 * 5/9</em>
 * <li> E<sub>Y,B</sub>: Four of the nine balls are <em>black</em>, so <em>P(E<sub>Y,B</sub>) =
 * 4/9</em>
 * </ul>
 *
 * <p>
 * <strong>Urn Z</strong>
 * <ul>
 * <li> E<sub>Z,R</sub>: Four of the eight balls are <em>red</em>, so <em>P(E<sub>Z,R</sub>) =
 * 1/2</em>
 * <li> E<sub>Z,B</sub>: Four of the eight balls are <em>black</em>, so <em>P(E<sub>Z,B</sub>) =
 * 1/2</em>
 * </ul>
 *
 * <p>
 * Let <em>E(X,Y,Z)</em> be the result of drawing <em>1</em> ball from each urn. We care about three
 * scenarios:
 * <ol>
 * <li> E(R, R, B)
 * <br> P(E(R, R, B)) = P(E<sub>X,R</sub>) X P(E<sub>Y,R</sub>) X P(E<sub>Z,B</sub>) = 20/126
 * <li> E(R, B, R)
 * <br> P(E(R, B, R)) = P(E<sub>X,R</sub>) X P(E<sub>Y,B</sub>) X P(E<sub>Z,R</sub>) = 16/126
 * <li> E(B, R, R)
 * <br> P(E(B, R, R)) = P(E<sub>X,B</sub>) X P(E<sub>Y,R</sub>) X P(E<sub>Z,R</sub>) = 15/126
 * </ol>
 *
 * <p>
 * Now, let's find the probabilty for the event <em>E</em>, getting two red and one black balls.
 * Because each event is independent of one another, we can simply sum their probabilities:
 *
 * <p>
 * <code>P(2 balls are red and 1 is black) = P(E(R,R,B)) + P(E(R,B,R)) + P(E(B,R,R)) = 51/126 = 17/42</code>
 *
 * @author code36u4r60
 */
public class Day2_CompoundEventProbability {

}
