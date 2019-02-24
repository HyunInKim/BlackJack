public class Main{
    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
        Card card = new Card();
        cardDeck.CardDecks();
        cardDeck.shuffle();
        System.out.println(cardDeck.cards.get(1));
        String shape = cardDeck.cards.get(1).getNumber(); //카드번호 가져오기
        System.out.println(shape); 
        System.out.println("Test");
       
    }
}