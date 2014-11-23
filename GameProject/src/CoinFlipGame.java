
import java.util.Scanner;

public class CoinFlipGame
{

	public static int numHeads = 0;
	public static String spaces = "                         ";

	public static void CoinFlip() throws InterruptedException{
		String skipChoice = "";
		Scanner keyboard = new  Scanner(System.in);
		String repeatGame = "Yes";
		while(repeatGame.equalsIgnoreCase("Yes")){
			introduction();
			skipChoice = keyboard.next();

			if(skipChoice.equalsIgnoreCase("yes")){
				ShortWay();

			}
			else{
				LongWay();
			}
			System.out.println(spaces+"Do you want to play again?");
			repeatGame=keyboard.next();
		}
	}

	private static void introduction() throws InterruptedException{
		Scanner keyboard = new  Scanner(System.in);
		System.out.println(spaces+"Lets play the coin flip game!");
		Thread.sleep(1000);
		System.out.println(spaces+"How many heads do you want?");
		numHeads=keyboard.nextInt();
		System.out.println(spaces+"Do you skip to the end? or watch it go!(Yes or No)");


	}



	private static void ShortWay(){

		int count=0;
		int trys=0;

		while(count<=numHeads){
			int ranNum = (int) (Math.random()*2)+1;
			if(ranNum==1){

				count++;
				trys++;
			}
			else{

				count=0;
				trys++;
			}
		}
		System.out.println("");
		System.out.println("**********************************************************************************************************");
		System.out.println("");
		System.out.println(spaces+"It took "+trys+" trys to complete!");
		System.out.println("");
	}


	private static void LongWay() throws InterruptedException{

		int count=0;
		int trys=0;
		String flip = ""; 
		while(count!=numHeads){
			int ranNum = (int) (Math.random()*2)+1;
			if(ranNum==1){
				flip="Heads";
				count++;
				trys++;
			}
			else{
				flip="Tails";
				count=0;
				trys++;
			}
			System.out.println(spaces+"Try: "+trys+" Outcome: "+flip+","+" Number of heads: "+count);
			System.out.println("");
			Thread.sleep(1000);

		}

		System.out.println("");
		System.out.println("**********************************************************************************************************");
		System.out.println("");
		System.out.println(spaces+"It took "+trys+" trys to complete!");
		System.out.println("");
	}
}
