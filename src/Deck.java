import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck;
    private ArrayList<Card> hand;
    public Deck(){
        hand = Card.buildHand();
        deck = Card.buildDeck();
    }
    public void makeDeck(){
        for (Card card : hand) {
            for(int i = deck.size()-1; i>-1; i--){
                if(card.getSuit().equals(deck.get(i).getSuit()) && card.getValue().equals(deck.get(i).getValue())){
                    deck.remove(i);
                }
            }
        }
    }
    public void updateHand(int index){
        hand.remove(index);
        int r = (int)(Math.random()*deck.size());
        hand.add(deck.get(r));
        deck.remove(r);
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }
}
