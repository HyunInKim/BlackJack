public class Main{
    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
        cardDeck.shuffle();  
        System.out.println(cardDeck.giveCard());
        System.out.println(cardDeck.cards.size());
        
    }
}