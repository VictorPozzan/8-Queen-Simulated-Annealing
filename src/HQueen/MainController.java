/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HQueen;

import static javafx.application.ConditionalFeature.FXML;
import javafx.scene.image.ImageView;
import javafx.fxml.FXML;

/**
 *
 * @author vitor
 */
public class MainController {
    
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
    
    long time;
    NQueen nq;
    int tollerence = 0;
    int[][] matrizImgView = new int[8][8];
    
    public void inicialize(){
        nq = new SimulatedAnnealing(8,tollerence,1000);
        time = System.currentTimeMillis();
        nq.showInicialPosition();
    }
    
    public void inicializaTabuleiro(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
            }
        }
    }
    
    
    
}
