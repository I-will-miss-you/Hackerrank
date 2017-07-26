package _10DaysOfStatistics;

/**
 * <h3>Objective</h3>
 * In this challenge, we get started with conditional probability. Check out the
 * <a href="https://www.hackerrank.com/challenges/s10-mcq-4/tutorial">Tutorial</a> tab for learning
 * materials!
 *
 * <h3>Task</h3>
 * Suppose a family has <em>2</em> cildren, one of which is a boy. What is the probability that both
 * children are boys?
 *
 * <ul>
 * <li> 1/3 &radic;
 * <li> 1/2
 * <li> 2/3
 * <li> 1/9
 * </ul>
 *
 * <h3>Editorial (v.PT)</h3>
 * Assumindo o gênero como um valor binário (ou <em>G</em>(menina) ou <em>B</em>(menino)) com a
 * problalidade de qualquer gênero 1/2. É o espaço de amostra +ara os gÊneros de duas crianças
 * <em>S={BB,BG,GB,GG}</em>, com cada evento tendo uma probalidade igual de 1/2 x 1/2 = 1/4. A
 * partir disso, podemos dizer o seguinte:
 * <ul>
 * <li> É a probalidade de uma criança ser menino se ambos os filhos são meninos é <em>P(B|BB) =
 * 1</em>.
 * <li> A probabilidade de pelo menos um dos dois filhos ser um menino é:
 * <br> P(B) = P(BB) + P(BG) + P(GB) = 1/4 + 1/4 + 1/4 = 3/4
 * <li> A probabilidade de dois dos dois filhos serem meninos é:
 * <br> P(BB) = P(B) . P(B) = 1/2 x 1/2 = 1/4
 * </ul>
 * <p>
 * Queremos encontrar a probabilidade de que o segundo filho seja um garoto, dado que a outra
 * criança é um menino. Podemos determinar isso aplicando a informação acima no Teorema de Bayes:
 * <br> P(BB|B) = (P(B|BB) x P(BB)) / P(B) = (1 x 1/4)/(3/4)
 *
 * <p>
 * Outra maneira de abordar esse problema é reduzir o espaço da amostra para que ele contenha apenas
 * eventos em que um filho é um menino:
 * <br> S<sub>B</sub> = {BB,BG,GB}.
 *
 * <p>
 * Se considerarmos o evento <em>E</em> como o evento em que ambos os filhos são meninos (então
 * <em>E = {BB}</em>), podemos encontrar a probabilidade como uma fração do espaço de amostra
 * reduzido:
 * <br> P(E) = |E|/|S| = 1/3
 *
 * @author code36u4r60
 */
public class Day3_ConditionalProbability {

}
