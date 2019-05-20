package HQueen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;

/**
 *
 * @author Emerson Hoffmann
 * @author Leonardo Aparecido Caracho
 * @author Victor Augusto Pozzan
 * @author Vitor Lisboa Nogueira
 */
class SimulatedAnnealingState extends State {

    Random random = new Random();

    //instancia o numero de rainha para cada posição no tabuleiro 
    public SimulatedAnnealingState(int tamTabuleiro) {
        super(tamTabuleiro);
        for (int i = 0; i < tamTabuleiro; i++) {
            queen[i] = new Queen(i, random.nextInt(tamTabuleiro));
        }
    }

    //construtor quando for solucionar o problema
    public SimulatedAnnealingState(int tamTabuleiro, Queen q[]) {
        super(tamTabuleiro);
        this.queen = q;
        custo = 0;
    }

    //este metodo escolhe uma rainha aleatória de depois sorteia uma coluna aleatóriamente
    //até que ela não seja igual ao valor anterior
    //atualiza o estado da rainha 
    //retorna tabuleiro e o proximo estado
    @Override
    public State getNextState() {
        int i;
        Queen nextStateQueen[] = new Queen[tamTabuleiro];
        int rand = random.nextInt(tamTabuleiro);

        for (i = 0; i < tamTabuleiro; i++) {
            nextStateQueen[i] = new Queen(queen[i].getX(), queen[i].getY());
            if (rand == i) {
                int temp = random.nextInt(tamTabuleiro);
                while (temp == queen[i].getY()) {
                    temp = random.nextInt(tamTabuleiro);
                }
                nextStateQueen[i] = new Queen(queen[i].getX(), temp);
            }
        }

        return new SimulatedAnnealingState(tamTabuleiro, nextStateQueen);
    }
}
