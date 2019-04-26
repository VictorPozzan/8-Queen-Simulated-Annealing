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
public class SimulatedAnnealing {
    
    int temperaturaInicial;
    int constResfriamento;
    int temperaturaFinal;
    Casa[][] tabuleiro;


    public SimulatedAnnealing(int temperaturaInicial, int constResfriamento, int temperaturaFinal) {
        this.temperaturaInicial = temperaturaInicial;
        this.constResfriamento = constResfriamento;
        this.temperaturaFinal = temperaturaFinal;
    }
    
    public Casa[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(Casa[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
    
    public void start(){
        
        while (temperaturaInicial < temperaturaFinal){
            
        }
      
    }
    
    
    
    
    
    
}
