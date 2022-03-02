import java.util.Random;

public class Deck {

    private static String[] suits = { "club", "diamond", "heart", "spade" };
    private static String[] names = { "Jack", "Queen", "King", "Ace" };

    private Card[] cards = new Card[52];
    private int cards_idx = 0;

    public Deck() {
        for(int s = 0; s < suits.length; s++) {
            Card temp;
            for(int i = 0; i < 13; i++) {
                if(i >= 9) {
                    temp = new Card(names[i % 9], suits[s], i + 1);
                } else {
                    temp = new Card((i + 2) + "", suits[s], i + 1);
                }
                cards[s * 13 + i] = temp;
            }
        }
    }

    public Card draw() {
        return cards[cards_idx++ % 52];
    }

    public void deal() {
        for(int i = 0; i < 5; i++) {
            System.out.println(draw());
        }
    }

    public void shuffle() {
        Random rand = new Random();
        for(int i = 0; i < 52; i++) {
            // Pick two cards
            int p1 = rand.nextInt(52);
            int p2 = rand.nextInt(52);
            // Swap the cards
            if(p1 == p2) continue;
            Card temp = cards[p1];
            cards[p1] = cards[p2];
            cards[p2] = temp;
        }
    }

    // Not part of your assignment lmao
    public void printDeck() {
        for(Card c : cards) {
            System.out.print(c + ", "); }
        System.out.print('\n');
    }

}
