package themindsrc;

import java.util.ArrayList;

public class Dealer {
    public ArrayList<Player> players = new ArrayList<Player>();
    public Deck deck = new Deck();
    int cardsIndex = 0;
    int round = 1;

    public Dealer(){};

    public void dealCards(ArrayList<Player> players ){

        for(Player p : players){

            for(int i = 0 ; i < round ; i ++){
                deck.drawCard(p,cardsIndex);
                cardsIndex++;
            }
        }
    }

    public void nextRound(){

        if(round > 12){
            System.out.println("Game finished");
        }

        for(Player p : players){
            p.hand.removeAll(p.hand);
        }
        round++;
    }



}
