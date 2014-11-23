import java.util.Scanner;
public class NameRace
{
	//sets names 
	public static String fahad="Fahad", donna="Donna", jacob="Jacob",Winner;

	static String playAgain="no",finishLine="|";
	static int masterCount=0, donnaCount=0,fahadCount=0,jacobCount=0;
	//spacing and other long strings
	public static String spaces = "                         ";
	public static String stars = "**********************************************************************************************************";
	public static void Namerace() throws InterruptedException{

		boolean reset = false;
		Scanner keyboard = new  Scanner(System.in);

		Intro();
		System.out.println(spaces+"Are you ready to wach?");
		playAgain=keyboard.next();
		while(playAgain.equalsIgnoreCase("yes")){

			while(jacob.length()<60&&donna.length()<60&&fahad.length()<60){
				theGame();

			}
			FindWinner();
			//this is displayed after the race
			System.out.println(stars);
			System.out.println(spaces+Winner+" won!");

			System.out.println(spaces+"Want to watch again?");
			playAgain=keyboard.next();
			//this resets the values
			donnaCount=0;fahadCount=0;jacobCount=0;
			donna="Donna";fahad="Fahad";jacob="Jacob";
		}

	}
	//makes the game
	private static void theGame() throws InterruptedException{
		Space();
		FinishLine();
		FinishLine();
		Fahad();
		Donna();	
		Jacob();
		FinishLine();
		FinishLine();
		Space();
		Thread.sleep(1000);
	}
	//makes the name and makes them move
	private static void Fahad(){
		int count=0;		
		int ranNum =(int) (Math.random()*5)+1;
		while(count<ranNum){

			fahad = " "+fahad;			
			count++;

		}
		fahadCount++;
		System.out.println(fahad);
		count=0;
	} 

	private static void Donna(){
		int count=0;		
		int ranNum = (int) (Math.random()*5)+1;
		while(ranNum>count){

			donna = " "+donna;			

			count++;

		}
		donnaCount++;
		System.out.println(donna);
	}

	private static void Jacob(){
		int count=0;		
		int ranNum =(int) (Math.random()*5)+1;
		while(count<ranNum){

			jacob = " "+jacob;			
			count++;

		}
		jacobCount++;
		System.out.println(jacob);
		count=0;
	}


	private static void Space(){  //long spacing 

		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"+"\n\n\n\n\n\n\n\n\n");

	}

	//intro
	private static void Intro(){
		System.out.println(spaces+"Welcome to the Name Race Game");
		System.out.println("");
		System.out.println(spaces+"This game races names across your screen!");
		System.out.println("");
		System.out.println(spaces+"The names racing today are Jacob, Fahad and Donna");
		System.out.println("");
	}

	//this finds the winner of the race
	private static void FindWinner(){

		if(jacob.length()>donna.length()&&jacob.length()>fahad.length()){
			Winner="Jacob";
		}
		else if(fahad.length()>donna.length()&&fahad.length()>jacob.length()){
			Winner="Fahad";
		}
		else if(donna.length()>fahad.length()&&donna.length()>jacob.length()){
			Winner="Donna";
		}
		else
			System.out.println("What a tie!");

	}
	//prints the finish line
	private static void FinishLine(){

		System.out.println("                                                       |");

	}

}



