import java.util.Scanner;
public class mainblackjackgame {
    private static int playerTotal = 0;
    private static int dealerTotal = 0;
    private static int playerWins = 0;
    private static int dealerWins = 0;
    private static int ties = 0;
    private static int chips = 100;
    private static int bet = 0;
    private static int deck = 52;

    public static void betting()
    {
        Scanner user = new Scanner(System.in);
        if (chips == 0 || chips < 0)
        {
            System.out.println("You are in debt or have no chips.");
            System.out.println("You have been kicked out of the casino.");
            System.exit(0);
        }
        System.out.println("Your total chips: " + chips);
        System.out.println("How much do you want to bet?");
        bet = user.nextInt();
        if (bet == 0)
        {
            System.out.println("No bet placed");
        }
        else if (bet < 0 || bet > chips)
        {
            while (bet < 0 || bet > chips)
            {
                System.out.println("Invalid bet.");
                bet = user.nextInt();
            }
        }
        chips -= bet;
        System.out.println("Your bet: " + bet);
        System.out.println();
    }
    
    public static int player()
    {
        Scanner userInput = new Scanner(System.in);
        int random = (int)(Math.random() * 11 + 1);
        int random2 = (int)(Math.random() * 10 + 1);
        playerTotal = random + random2;
        deck -= 2;
        System.out.println("Your cards: " + random + " and " + random2 + " Your total: " + playerTotal + ".");
        System.out.println("Draw another card?");
        boolean card1 = userInput.nextBoolean();
        if (card1==true) 
        {
            int randomExtra = (int)(Math.random() * 11 + 1);
            playerTotal += randomExtra;
            deck -= 1;
            System.out.println("Your new total: " + playerTotal + ".");
            if (playerTotal < 21)
            {
                System.out.println("Draw another card?");
                boolean card2 = userInput.nextBoolean();
                if (card2==true)
                {
                    int extra2 = (int)(Math.random() * 11 + 1);
                    playerTotal += extra2;
                    deck -= 1;
                    System.out.println("Your new total: " + playerTotal + ".");
                    if (playerTotal < 21)
                    {
                        System.out.println("Draw another card?");
                        boolean card3 = userInput.nextBoolean();
                        if (card3==true)
                        {
                            int extra3 = (int)(Math.random() * 11 + 1);
                            playerTotal += extra3;
                            deck -= 1;
                            System.out.println("Your new total: " + playerTotal + ".");
                        }
                        else
                        {
                            System.out.println("Your total has not changed.");
                        }
                    }
                }
                else
                {
                    System.out.println("Your total has not changed.");
                }
            }
        } 
        else
        {
            System.out.println("Your total has not changed.");
        }
        System.out.println();
        return playerTotal;
    }

    public static int dealer()
    {
        int dealerRandom = (int)(Math.random() * 11 + 1);
        int dealerRandom2 = (int)(Math.random() * 11 + 1);
        System.out.println("Dealer's cards: " + dealerRandom + " and " + dealerRandom2 + ".");
        dealerTotal = dealerRandom + dealerRandom2;
        deck -= 2;
        System.out.println("Dealer's total: " + dealerTotal + ".");
        if (dealerTotal < 18)
        {
            System.out.println("Dealer draws until their total is 18 or above.");
            while (dealerTotal <= 18)
            {
                dealerTotal+= (int)(Math.random() * 11 + 1);
            }
            System.out.println("Dealer new total: " + dealerTotal + ".");
        }
        System.out.println();
        return dealerTotal;
    }
    
    public static int Wins()
    {
        if (deck == 0 || deck < 0)
        {
            System.out.println("The deck has emptied. Quitting program...");
            System.exit(0);
        }
        else if (playerTotal > 21 && dealerTotal > 21 || playerTotal == dealerTotal)
        {
            System.out.println("It's a tie!");
            chips += bet;
        }
        else if (playerTotal < 21 && playerTotal > dealerTotal || dealerTotal > 21)
        {
            playerWins += 1;
            System.out.println("The player wins!");
            chips += bet * 2;
        }
        else if (dealerTotal < 21 && playerTotal < dealerTotal || playerTotal > 21 || dealerTotal == 21 && playerTotal < dealerTotal)
        {
            dealerWins += 1;
            System.out.println("The dealer wins!");
            chips -= bet;
        }
        System.out.println("Stats:");
        System.out.println("Total chips: " + chips);
        System.out.println("Ties: " + ties);
        System.out.println("Dealer wins: " + dealerWins);
        System.out.println("Player wins: " + playerWins);
        System.out.println("Amount of cards in deck: " + deck);
        System.out.println();
        return dealerWins;
    }
}