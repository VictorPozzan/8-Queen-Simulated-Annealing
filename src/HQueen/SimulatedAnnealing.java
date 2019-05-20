package HQueen;

/**
 * Estas classe SimulatedAnnealing herda a classe NQueen pois necessita das
 * coordenadas da rainha Aqui é calculado o custo com base nas posições de
 * ataque das rainhas
 *
 * @author Emerson Hoffmann
 * @author Leonardo Aparecido Caracho
 * @author Victor Augusto Pozzan
 * @author Vitor Lisboa Nogueira
 *
 */
public class SimulatedAnnealing extends NQueen {

    double t;

    //construtor
    SimulatedAnnealing(int tolerancia, double temperatura) {
        super(tolerancia);
        t = temperatura;
        estadoAtual = new SimulatedAnnealingState(8);
    }

    //a função solve() percorre até que a rainha esteja em um solução ideal
    //caso ela não estiver pecorre o for de temperatura ate´ que a rainha esteja em um estado seguro,
    //e a cada iteração a temperatura diminui
    @Override
    public void solve() {
        while (!isSolvedPossition(estadoAtual)) {
            double temperatura;
            double custoMovimento;
            double prob; //probabilidade
            double rand;

            /* A função de temperatura é inicialmente definida com um valor mais alto e um número aleatório 
            * é gerado em cada iteração, if o novo custo for menor que o custo
            * anterior, o próximo estado será sempre usado, else if  se esse valor aleatório for menor
            * que a probabilidade de o próximo estado ser avaliado, o próximo estado será retomado, mesmo que 
            * não esteja reduzindo o custo.
             */
            for (temperatura = t; (temperatura > 0) && (estadoAtual.getCost() != 0); temperatura--) {
                proxEstado = estadoAtual.getNextState();
                custoMovimento = estadoAtual.getCost() - proxEstado.getCost();
                prob = Math.exp(custoMovimento / temperatura);
                rand = Math.random();

                if (custoMovimento > 0) {
                    estadoAtual = proxEstado;
                } else if (rand <= prob) {
                    estadoAtual = proxEstado;
                }
            }
        }
    }
}
