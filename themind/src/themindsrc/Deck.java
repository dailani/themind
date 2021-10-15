package themindsrc;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    public  ArrayList<Integer> cards = new ArrayList<>();

    public Deck (){
        initializeDeck();
    }

    public  void  initializeDeck() {
        for (int i = 0; i < 100; i++) {
            Random r = new Random();
            int low = 1;
            int high = 100;
            int result = r.nextInt(high - low) + low;

            cards.add(result);
        }
    }

    public  void drawCard(Player player, int index){

        player.hand.add(cards.get(index));
        cards.remove(index);

    }


}
