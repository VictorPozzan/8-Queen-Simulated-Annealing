package HQueen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;

/**
 * Esta classe armazena os dados sobre estado atual do tabuleiro.
 *
 *
 * @author Emerson Hoffmann
 * @author Leonardo Aparecido Caracho
 * @author Victor Augusto Pozzan
 * @author Vitor Lisboa Nogueira
 */
abstract class State {

    int tamTabuleiro;
    int custo;
    protected Queen[] queen;

    //construtor
    public State(int boardSize) {
        this.tamTabuleiro = boardSize;
        queen = new Queen[boardSize];

        custo = 0;
    }

    abstract public State getNextState();

    //este metodo verifica se as rainhas estao na mesma linha, coluna ou diagonal caso estjam é incrementado o custo
    public void calculateCost() {
        int i, j;
        custo = 0;

        for (i = 0; i < tamTabuleiro; i++) {
            for (j = 0; j < tamTabuleiro; j++) {
                if (i == j) {
                    continue;
                }
                if (queen[i].getX() == queen[j].getX() // mesma linha
                        || queen[i].getY() == queen[j].getY() //mesma coluna
                        || (queen[i].getX() - queen[j].getX() == queen[i].getY() - queen[j].getY()) // mesma diagonal
                        || (queen[i].getX() - queen[j].getX() == queen[j].getY() - queen[i].getY())) { //mesma diagonal
                    custo++;
                }
            }
        }
        custo = custo / 2;
    }

    //retorna o custo 
    public int getCost() {
        calculateCost();
        return custo;
    }

    //retorna estado das rainhas
    public Queen[] getQueens() {
        return queen;
    }
}
