package HQueen;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victor Augusto Pozza
 */
abstract class NQueen {

    protected int boardSize;
    protected State currentState, nextState;
    protected int tollerenceCost;

    public NQueen(int boardSize, int tollrence) {
        this.boardSize = boardSize;
        this.tollerenceCost = tollrence;
        if (boardSize<4)
        throw new UnsupportedOperationException("No of N should be more than 3 to solve the problem");
    }

    abstract public void solve();

    public void showInicialPosition(){
        System.out.println("This is the inicial Position");
                int temp = 0;
        Queen q[] = currentState.getQueens();
        boolean queen = false;
        System.out.println();

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                for (int k = 0; k < boardSize; k++) {
                    if (i == q[k].getIndexOfX() && j == q[k].getIndexOfY()) {
                        queen = true;
                        temp = k;
                        break;

                    }
                }

                if (queen) {
                    System.out.print("" + temp + "");
                    queen = false;
                } else {
                    System.out.print("|*|");
                }
            }

            System.out.println();
        }
    }
    
    public void show() {
        System.out.println("Total Cost of " + currentState.getCost());
        int temp = 0;
        Queen q[] = currentState.getQueens();
        boolean queen = false;
        System.out.println();

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                for (int k = 0; k < boardSize; k++) {
                    if (i == q[k].getIndexOfX() && j == q[k].getIndexOfY()) {
                        queen = true;
                        temp = k;
                        break;

                    }
                }
                if (queen) {
                    

                    System.out.print("" + temp + "\t");
                    queen = false;
                } else {
                    System.out.print("*\t");
                }
            }

            System.out.println();
        }
    }

    protected boolean isSolvedPossition(State s) {
        if (s.getCost() <= tollerenceCost) {
            return true;
        }
        return false;
    }
}
