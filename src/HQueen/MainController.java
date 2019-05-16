/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HQueen;

import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.image.ImageView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.image.Image;

/**
 *
 * @author vitor
 */
public class MainController implements Initializable {
    
    ImageView tabuleiro[][];
    
    @FXML
    private ImageView casa65;

    @FXML
    private ImageView casa10;

    @FXML
    private ImageView casa42;

    @FXML
    private ImageView casa32;

    @FXML
    private ImageView casa22;

    @FXML
    private ImageView casa12;

    @FXML
    private ImageView casa02;

    @FXML
    private ImageView casa71;

    @FXML
    private ImageView casa61;

    @FXML
    private ImageView casa51;

    @FXML
    private ImageView casa41;

    @FXML
    private ImageView casa31;

    @FXML
    private ImageView casa21;

    @FXML
    private ImageView casa11;

    @FXML
    private ImageView casa50;

    @FXML
    private ImageView casa01;

    @FXML
    private ImageView casa70;

    @FXML
    private ImageView casa60;

    @FXML
    private ImageView casa40;

    @FXML
    private ImageView casa30;

    @FXML
    private ImageView casa20;

    @FXML
    private ImageView casa55;

    @FXML
    private ImageView casa45;

    @FXML
    private ImageView casa35;

    @FXML
    private ImageView casa25;

    @FXML
    private ImageView casa15;

    @FXML
    private ImageView casa05;

    @FXML
    private ImageView casa74;

    @FXML
    private ImageView casa64;

    @FXML
    private ImageView casa54;

    @FXML
    private ImageView casa34;

    @FXML
    private ImageView casa44;

    @FXML
    private ImageView casa24;

    @FXML
    private ImageView casa04;

    @FXML
    private ImageView casa73;

    @FXML
    private ImageView casa63;

    @FXML
    private ImageView casa53;

    @FXML
    private ImageView casa43;

    @FXML
    private ImageView casa33;

    @FXML
    private ImageView casa23;

    @FXML
    private ImageView casa13;

    @FXML
    private ImageView casa03;

    @FXML
    private ImageView casa72;

    @FXML
    private ImageView casa62;

    @FXML
    private ImageView casa52;

    @FXML
    private ImageView casa14;

    @FXML
    private ImageView casa76;

    @FXML
    private ImageView casa66;

    @FXML
    private ImageView casa56;

    @FXML
    private ImageView casa46;

    @FXML
    private ImageView casa36;

    @FXML
    private ImageView casa26;

    @FXML
    private ImageView casa16;

    @FXML
    private ImageView casa06;

    @FXML
    private ImageView casa75;

    @FXML
    private ImageView casa00;

    @FXML
    private ImageView casa77;

    @FXML
    private ImageView casa67;

    @FXML
    private ImageView casa57;

    @FXML
    private ImageView casa47;

    @FXML
    private ImageView casa37;

    @FXML
    private ImageView casa27;

    @FXML
    private ImageView casa17;

    @FXML
    private ImageView casa07;
       
    int tollerence = 0;
    NQueen nq;
    @FXML
    public void solve(){  
        long time;
        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j< 8; j++)
            {
                tabuleiro[i][j].setImage(null);
            }
        }
 
        time = System.currentTimeMillis();
        nq.solve();
        time = System.currentTimeMillis()-time;
        nq.show(tabuleiro);
        
        System.out.println("Total Time taken :" + time);
  
    }
    @FXML
    public void randomQueens(){   
        
        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j< 8; j++)
            {
                tabuleiro[i][j].setImage(null);
            }
        }
 
        System.out.println("N = 8");
        System.out.println("Simulated Annealing approach");
        
        nq = new SimulatedAnnealing(tollerence,1000);
        nq.showInicialPosition(tabuleiro);
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tabuleiro = new ImageView[8][8];
        tabuleiro[0][0] = casa00;
        tabuleiro[1][0] = casa10;
        tabuleiro[2][0] = casa20;
        tabuleiro[3][0] = casa30;
        tabuleiro[4][0] = casa40;
        tabuleiro[5][0] = casa50;
        tabuleiro[6][0] = casa60;
        tabuleiro[7][0] = casa70;
        tabuleiro[0][1] = casa01;
        tabuleiro[1][1] = casa11;
        tabuleiro[2][1] = casa21;
        tabuleiro[3][1] = casa31;
        tabuleiro[4][1] = casa41;
        tabuleiro[5][1] = casa51;
        tabuleiro[6][1] = casa61;
        tabuleiro[7][1] = casa71;
        tabuleiro[0][2] = casa02;
        tabuleiro[1][2] = casa12;
        tabuleiro[2][2] = casa22;
        tabuleiro[3][2] = casa32;
        tabuleiro[4][2] = casa42;
        tabuleiro[5][2] = casa52;
        tabuleiro[6][2] = casa62;
        tabuleiro[7][2] = casa72;
        tabuleiro[0][3] = casa03;
        tabuleiro[1][3] = casa13;
        tabuleiro[2][3] = casa23;
        tabuleiro[3][3] = casa33;
        tabuleiro[4][3] = casa43;
        tabuleiro[5][3] = casa53;
        tabuleiro[6][3] = casa63;
        tabuleiro[7][3] = casa73;
        tabuleiro[0][4] = casa04;
        tabuleiro[1][4] = casa14;
        tabuleiro[2][4] = casa24;
        tabuleiro[3][4] = casa34;
        tabuleiro[4][4] = casa44;
        tabuleiro[5][4] = casa54;
        tabuleiro[6][4] = casa64;
        tabuleiro[7][4] = casa74;
        tabuleiro[0][5] = casa05;
        tabuleiro[1][5] = casa15;
        tabuleiro[2][5] = casa25;
        tabuleiro[3][5] = casa35;
        tabuleiro[4][5] = casa45;
        tabuleiro[5][5] = casa55;
        tabuleiro[6][5] = casa65;
        tabuleiro[7][5] = casa75;
        tabuleiro[0][6] = casa06;
        tabuleiro[1][6] = casa16;
        tabuleiro[2][6] = casa26;
        tabuleiro[3][6] = casa36;
        tabuleiro[4][6] = casa46;
        tabuleiro[5][6] = casa56;
        tabuleiro[6][6] = casa66;
        tabuleiro[7][6] = casa76;
        tabuleiro[0][7] = casa07;
        tabuleiro[1][7] = casa17;
        tabuleiro[2][7] = casa27;
        tabuleiro[3][7] = casa37;
        tabuleiro[4][7] = casa47;
        tabuleiro[5][7] = casa57;
        tabuleiro[6][7] = casa67;
        tabuleiro[7][7] = casa77;
        
        
    }
}
