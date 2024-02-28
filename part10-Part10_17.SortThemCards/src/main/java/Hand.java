import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Hand implements Comparable<Hand>{

    private ArrayList<Card> myHand;

    public Hand() {
        this.myHand = new ArrayList<>();
    }

    public void add(Card card) {
        this.myHand.add(card);
    }

    public void print() {
        Iterator<Card> iterator = myHand.iterator();

        while (iterator.hasNext()) {
            Card nextCard = iterator.next();
            System.out.println(nextCard);

        }
    }
    
    public ArrayList<Card> getCards() {
        return this.myHand;
    }

    public void sort() {
        Comparator<Card> comparator = Comparator
                .comparing(Card::getValue)
                .thenComparing(Card::getSuit);

        Collections.sort(myHand, comparator);
    }

    public int compareTo(Hand hand) {
        int myHandValue = 0;
        int handValue = 0;
        
        for (Card c : this.getCards()) { 
            myHandValue += c.getValue();
        }
        
        for (Card c : hand.getCards()) { 
            handValue += c.getValue();
        }
        
        return myHandValue - handValue;
    }
    
    public void sortBySuit() {
        Collections.sort(myHand, new BySuitInValueOrder());
    }
}
