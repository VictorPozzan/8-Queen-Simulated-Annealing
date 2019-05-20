package HQueen;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Esta classe abstrata tem como serventia apresentar as soluções
 *
 * @author Emerson Hoffmann
 * @author Leonardo Aparecido Caracho
 * @author Victor Augusto Pozzan
 * @author Vitor Lisboa Nogueira
 */
abstract class NQueen {

    protected int tamTabuleiro = 8;
    protected State estadoAtual, proxEstado;
    protected int tolerancia;

    public NQueen(int tolerancia) {
        this.tolerancia = tolerancia;
    }

    abstract public void solve();

//este método mostra tanto no terminal quanto no FXML as rainhas espalhadas no tabuleiro    
    public void showInicialPosition(ImageView tabuleiro[][]) {
        Image img = new Image("Imagens/crown.png");
        System.out.println("Posicao Atual:");
        int rainha = 0;
        Queen q[] = estadoAtual.getQueens();
        boolean queen = false;
        System.out.println();

        for (int i = 0; i < tamTabuleiro; i++) {
            for (int j = 0; j < tamTabuleiro; j++) {
                for (int k = 0; k < tamTabuleiro; k++) {
                    if (i == q[k].getX() && j == q[k].getY()) {
                        queen = true;
                        rainha = k;
                        break;

                    }
                }
                System.out.print("|");
                if (queen) {
                    tabuleiro[i][j].setImage(img);
                    System.out.print(" " + rainha + " ");
                    queen = false;
                } else {
                    System.out.print(" * ");
                }
                System.out.print("");
            }

            System.out.println("|");
        }
    }

//este método mostra tanto no terminal quanto no FXML a solução final    
    public void show(ImageView tabuleiro[][]) {
        Image img = new Image("Imagens/crown.png");
        int rainha = 0;
        Queen q[] = estadoAtual.getQueens();
        boolean queen = false;
        System.out.println();

        for (int i = 0; i < tamTabuleiro; i++) {
            for (int j = 0; j < tamTabuleiro; j++) {
                for (int k = 0; k < tamTabuleiro; k++) {
                    if (i == q[k].getX() && j == q[k].getY()) {
                        queen = true;
                        rainha = k;
                        break;
                    }
                }
                System.out.print("|");
                if (queen) {
                    tabuleiro[i][j].setImage(img);
                    System.out.print(" " + rainha + " ");
                    queen = false;
                } else {
                    System.out.print(" * ");
                }
                System.out.print("");
            }

            System.out.println("|");
        }
    }

    //retorna true se o custo do estado é menor igual  que a tollerancia que é 0
    protected boolean isSolvedPossition(State s) {
        if (s.getCost() <= tolerancia) {
            return true;
        }
        return false;
    }
}
