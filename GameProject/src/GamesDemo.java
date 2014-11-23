import java.util.Scanner;
public class GamesDemo

{
	public static void main(String [] args) throws InterruptedException
	{
		int choiceNumber = 0;
		intruduction();
		while(choiceNumber != 3)
		{
			printMenuChoices();
			choiceNumber = readChoiceNumber();
			switch (choiceNumber)
			{
			case 1:
				CoinFlipGame.CoinFlip();
				break;
			case 2:
				NameRace.Namerace();
				break;
			case 3:
				NameRace2.Namerace2();
				break;
			case 4:
				ShapeDraw.Shapes();
				break;
			case 5:
				HangMan.HangMan();
				break;
			case 6:
				BoxGame.Boxgame();
				break;
			case 7:
				System.out.println("                     Thank you for learning the examples.");
				choiceNumber = 3;
				break;
			default:
				System.out.println("         Invalid choice.  The game is over.");
				choiceNumber = 3;
				break;
			}//switch

		}//while
	}
	private static void intruduction()
	{
		System.out.println("\n\n" +
				"                   \n\n\n\n\n\n\n\n\n\n");
		System.out.println("" +
				"                   This program deminstrates the framework\n" +
				"                            of the games projects.\n"+
				"                      \n" );
	}
	private static void printMenuChoices()
	{
		System.out.println(""+
				"                      Testing an example project.\n"
				+ "                        1) Coin Flip Game\n"
				+ "                        2) NameRace \n"
				+ "                        3) NameRace2 \n"
				+ "                        4) Drawing shapes \n"
				+ "                        5) HangMan \n"
				+ "                        6) Box Game\n"
				+ "                        7) Quit playing this example. \n"
				+ "                      Please choose 1 of the 7 choices.");

	}
	private static int readChoiceNumber()
	{
		Scanner scan = new Scanner(System.in);
		int choiceNumber;
		String indent = "                   ";
		choiceNumber = scan.nextInt();
		while(choiceNumber < 1 || choiceNumber > 7)
		{
			System.out.println(indent + "the number must be 1 through 7 inclusive");
			System.out.println(indent + "    please enter a proper choice.  ");
			choiceNumber = scan.nextInt();
		}
		return choiceNumber;
	}
}