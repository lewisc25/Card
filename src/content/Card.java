package content;

/**
 * This class +++Insert Description Here+++
 *
 * @author Christopher Lewis
 */
public class Card 
{
    private String cardSuit;
    private String cardValue;
    
    private final String SUIT [] = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private final String VALUE [] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    
    public String getCardSuit ()
    {
        return cardSuit;
    }
    
    public String getCardValue ()
    {
        return cardValue;
    }
    
    public Card ()
    {
        cardSuit = SUIT[0 + (int)(Math.random() * ((3 - 0) + 1))];
        cardValue = VALUE[0 + (int)(Math.random() * ((12 - 0) + 1))];
    }
}
