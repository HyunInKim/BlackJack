import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;


public class CardDeck{
    
    private static final String[] PATTERNS = {"spade", "heart", "diamond", "club"};
    ArrayList<Card> cards = new ArrayList<>();
    public void CardDecks(){

        for(String pattern : PATTERNS){
            for(int i=1;i<=13;i++){
                Card card = new Card();
                String number = this.numToStr(i);
                card.setNumber(number);//카드 번호 저장
                card.setShape(pattern);//카드모양 저장
                cards.add(card);       //cards 리스트에 저장
            }
        }
    }
    private String numToStr(int number){ //A = 1 , K = 11 , Q = 12, J = 13
        if(number == 1){
            return "A";
        }else if(number == 11){
            return "K";
        }else if(number == 12){
            return "Q";
        }else if(number == 13){
            return "J";
        }
        return String.valueOf(number); //나머지 숫자들은 숫자에서 문자로

    }
    public ArrayList<Card> giveCard(){
        ArrayList<Card> giveCard = new ArrayList<>();
        double randomNum = Math.random();
        int rand = (int)(randomNum * cards.size()); //outOfBounds 에러가 발생하지않도록 하기위해 cards.size의 중 랜덤 수 하나 뽑기
        giveCard.add(cards.get(rand));
        cards.remove(rand);
        return giveCard;
    } 
    public void shuffle(){ //카드섞기
        Collections.shuffle(cards);

    }
	
    
    @Override
    public String toString() {// 52장의 카드 출력
        StringBuilder sb = new StringBuilder();

        for(Card card : cards){
            sb.append(card.toString());
            sb.append("\n");
        }

        return sb.toString();
    }
}