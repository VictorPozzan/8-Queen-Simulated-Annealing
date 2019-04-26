/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HQueen;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author vitor
 */
public class Casa {
    
    int value;
    ImageView image;
    boolean isQueen;
    
    public Casa() {
        this.value = 0;
        isQueen = false;
    }
    
    public void incrementaValue(){
        this.value ++;
    }
    
    public void decrementaValue(){
        this.value --;
    }
    
    public void setQueen(boolean value){
        this.isQueen = value;
    }
    
}
