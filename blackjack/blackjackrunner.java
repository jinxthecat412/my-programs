import java.util.Scanner;
public class blackjackrunner {
    
    public static void game()
    {
        Scanner user = new Scanner(System.in);
        mainblackjackgame.betting();
        mainblackjackgame.player();
        mainblackjackgame.dealer();
        mainblackjackgame.Wins();
        System.out.println("Continue playing?");
        boolean play = user.nextBoolean();
        if (play == true)
        {
            System.out.println();
            blackjackrunner.game();
        }
        else
        {
            System.exit(0);
        }
    }

    public static void main(String[] args) throws Exception 
    {
        System.out.println("THE RESPONSE TO DRAWING ANOTHER CARD OR CONTINUING MUST BE TRUE OR FALSE");
        System.out.println("IF IT IS NOT THE PROGRAM WILL CRASH");
        System.out.println("THIS VERSION DOES NOT CONTAIN ACES BUT CARD NUMBERS CAN GO UP TO 11");
        System.out.println();
        blackjackrunner.game();
    }
}