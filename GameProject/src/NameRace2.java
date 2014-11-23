import java.util.Scanner;
public class NameRace2{

	//sets names 
	public static String fahad=" Fahad                                 |";
	public static String donna=" Donna                                 |";
	public static String jacob=" Jacob                                 |";
	public static String Winner;
	public static boolean notAtEnd=true;

	static String playAgain="no",finishLine="|";
	static int masterCount=0, donnaCount=0,fahadCount=0,jacobCount=0;
	//spacing and other long strings
	public static String spaces = "                         ";
	public static String stars = "**********************************************************************************************************";
	public static void Namerace2() throws InterruptedException{


		Scanner keyboard = new  Scanner(System.in);

		Intro();
		System.out.println(spaces+"Are you ready to wach?");
		playAgain=keyboard.next();
		while(playAgain.equalsIgnoreCase("yes")){

			while(fahad.contains(" |")&&jacob.contains(" |")&&donna.contains(" |")){
				theGame();

			}
			FindWinner();
			//this is displayed after the race
			System.out.println(stars);
			System.out.println(spaces+Winner);

			System.out.println(spaces+"Want to watch again?");
			playAgain=keyboard.next();
			//this resets the values
			donnaCount=0;fahadCount=0;jacobCount=0;
			donna=" Donna                                 |";
			fahad=" Fahad                                 |";
			jacob=" Jacob                                 |";
		}

	}
	//makes the game
	private static void theGame() throws InterruptedException{

		Space();

		Fahad();
		Donna();	
		Jacob();

		Space();
		Thread.sleep(500);
		//StopCrash();

	}


	//makes the name and makes them move
	private static void Fahad() throws InterruptedException{
				
		int randomNumber = (int)((Math.random()*5)+1);
		{
			for (int i = 0; i < randomNumber; i++)
			{
				if (fahad.contains(" |"))
				{
					fahad = " " + fahad.substring(fahad.indexOf(" "), fahad.indexOf(" |"))+"|";
				}		
			}
			System.out.println(fahad);
		}

	}


	private static void Donna(){
		
	
		int randomNumber = (int)((Math.random()*5)+1);
		{
			for (int i = 0; i < randomNumber; i++)
			{
				if (donna.contains(" |"))
				{
					donna = " " + donna.substring(donna.indexOf(" "), donna.indexOf(" |"))+"|";
				}		
			}
			System.out.println(donna);
		}
	}
	private static void Jacob(){
		int randomNumber = (int)((Math.random()*5)+1);
		{
			for (int i = 0; i < randomNumber; i++)
			{
				if (jacob.contains(" |"))
				{
					jacob = " " + jacob.substring(jacob.indexOf(" "), jacob.indexOf(" |"))+"|";
				}		
			}
			System.out.println(jacob);
		}

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

		if(fahad.indexOf(" |")<0){
			Winner="Fahad won!";
		}
		if(donna.indexOf(" |")<0){
			Winner="Donna won!";
		}
		if(jacob.indexOf(" |")<0){
			Winner="Jacob won!";
		}
		if(fahad.indexOf(" |")<0&&donna.indexOf(" |")<0){
			Winner = "Fahad and Donna tie!";
		}
		if(fahad.indexOf(" |")<0&&jacob.indexOf(" |")<0){
			Winner = "Fahad and Jacob tie!";
		}
		if(jacob.indexOf(" |")<0&&donna.indexOf(" |")<0){
			Winner = "Jacob and Donna tie!";
		}
		if(fahad.indexOf(" |")<0&&donna.indexOf(" |")<0&&jacob.indexOf(" |")<0){
			Winner = "They all tie!";
		}
	}

}







