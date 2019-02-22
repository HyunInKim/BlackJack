import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;


public class CardDeck{
    
    private static final String[] PATTERNS = {"spade", "heart", "diamond", "club"};
    ArrayList<Card> cards = new ArrayList<>();
    public CardDeck(){

        for(String pattern : PATTERNS){
            for(int i=1;i<=13;i++){
                Card card = new Card();
                String number = this.numToStr(i);
                card.setNumber(number);
                card.setShape(pattern);
                cards.add(card);
            }
        }
    }
    private String numToStr(int number){
        if(number == 1){
            return "A";
        }else if(number == 11){
            return "K";
        }else if(number == 12){
            return "Q";
        }else if(number == 13){
            return "J";
        }
        return String.valueOf(number);

    }
    public ArrayList<Card> giveCard(){
        ArrayList<Card> giveCard = new ArrayList<>();
       
        double randomNum = Math.random();
        int rand = (int)(randomNum * 52)+1;
        giveCard.add(cards.get(rand));
        cards.remove(rand);
        return giveCard;
    } 
    public void shuffle(){
        Collections.shuffle(cards);

    }
	
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(Card card : cards){
            sb.append(card.toString());
            sb.append("\n");
        }

        return sb.toString();
    }
}