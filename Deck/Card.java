public class Card {
    
    private String name, suit;
    private int value;

    public Card(String name, String suit, int value) {
        this.name = name;
        this.suit = suit;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getSuit() {
        return suit;
    }

    public int value() {
        return value;
    }

    public String toString() {
        String t = name + " of ";
        t += (char)(suit.charAt(0) - 32);
        t += suit.substring(1) + "s";
        return t;
    }

}
