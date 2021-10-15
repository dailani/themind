package themindsrc;

import java.util.ArrayList;
import java.util.Random;

public class main {


    public static void main(String[] args) {
        Deck deck = new Deck();

        Player p1 = new Player();
        Player p2 = new Player();
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(p1);
        players.add(p2);

        Dealer dealer = new Dealer();
        //First round
        System.out.println("First round");
        dealer.dealCards(players);
        System.out.println(p1.hand.toString());
        System.out.println(p2.hand.toString());
        System.out.println(deck.cards.size());
        dealer.nextRound();

        //Next round
        System.out.println("Second round");
        dealer.dealCards(players);
        System.out.println(p1.hand.toString());
        System.out.println(p2.hand.toString());
        System.out.println(deck.cards.size());






    }


}
