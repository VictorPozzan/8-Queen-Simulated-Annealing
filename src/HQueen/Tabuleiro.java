/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HQueen;

/**
 *
 * @author vitor
 */
public class Tabuleiro {
    
    Casa[][] tabuleiro;
    int[] queens = new int[8];

    public Tabuleiro() {
        this.tabuleiro = new Casa[8][8];
    }
    
    void inicializaTabuleiro(){
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++) {
                this.tabuleiro[i][j] = new Casa();
            }
        }
    }
    
    void inicizalizaRainhas(){
        int rdn = 0;
        for (int i = 0; i < 8; i++) {
            rdn = (int) Math.round((Math.random() * 7));
            this.tabuleiro[rdn][i].setQueen(true);
            this.queens[i] = rdn;
        }
    }
    
    
    
    
}
