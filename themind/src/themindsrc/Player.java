package themindsrc;

import java.util.ArrayList;

public class Player extends Thread{

    ArrayList<Integer> hand = new ArrayList<Integer>();
    int round = 1;


    public Player(){}



    @Override
    public void run() {

    }


    public ArrayList<Integer> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Integer> hand) {
        this.hand = hand;
    }
}
