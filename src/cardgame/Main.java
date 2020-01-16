package cardgame;
import content.Card;

/**
 * This class +++Insert Description Here+++
 *
 * @author Christopher Lewis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Card one = new Card();
        System.out.println("Card is a: " + one.getCardValue() + " of " + one.getCardSuit());
        
    }

}
