package HQueen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victor Augusto Pozzan
 */
public class SimulatedAnnealing extends NQueen {

    double tempreture;

    SimulatedAnnealing(int tollerence, double tempreture) {
        super(tollerence);
        this.tempreture = tempreture;
        currentState = new SimulatedAnnealingState(8);
    }

    @Override
    public void solve() {
        while (!isSolvedPossition(currentState)) {
            double temperature;
            double delta;
            double probability;
            double rand;


            for (temperature = this.tempreture; (temperature > 0) && (currentState.getCost() != 0); temperature--) {
                nextState = currentState.getNextState();
                delta = currentState.getCost() - nextState.getCost();
                probability = Math.exp(delta / temperature);
                rand = Math.random();

                if (delta > 0) {
                    currentState = nextState;
                } else if (rand <= probability) {
                    currentState = nextState;
                }
            }
        }
    }
}
