package HQueen;

/**
 * A classe rainha tem informações sobre a posição da rainha no tabuleiro Os
 * métodos são os getters e setters da posição e a movimentação da rainha
 *
 * @author Emerson Hoffmann
 * @author Leonardo Aparecido Caracho
 * @author Victor Augusto Pozzan
 * @author Vitor Lisboa Nogueira
 *
 */
class Queen {

    int X, Y;

    public Queen(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public void setX(int x) {
        this.X = x;
    }

    public void setY(int y) {
        this.Y = y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public void moveEsquerda() {
        Y--;
    }

    public void moveDireita() {
        Y++;
    }

}
