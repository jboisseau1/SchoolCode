import java.util.Scanner;
public class HangMan
{
	public static String spaces = "                         ";
	public static String wordToGuess;
	public static String hiddenWord="";
	public static String repeat="yes";
	public static boolean Solved = false;
	public static boolean LegitWord = true;
	public static String guesses=""; 
	public static String ABC="abcdefghijklmnopqrstuvwxyz ";
	public static String ABCletter;
	public static String guess;
	public static int length =0;
	public static void HangMan(){
		Scanner keyboard = new Scanner(System.in);
		Intro();
		GetTextToGuess();
		while(repeat.equalsIgnoreCase("yes")){
			while(Solved==false){
				makeGame();
				
			}
			System.out.println("Nice job you solved it! want to play again?");
			repeat=keyboard.nextLine();
			wordToGuess="";
			hiddenWord="";
			guesses="";
			ABC="abcdefghijklmnopqrstuvwxyz ";
			Solved=false;
			GetTextToGuess();
		}



	}
	private static void makeGame(){
		displayGame();
		GuessCheck();
		
	}
	private static void displayGame(){

		System.out.println(spaces+wordToGuess);
		System.out.println(spaces+hiddenWord);
		System.out.println(spaces+ABC);

	}
	private static void GuessCheck(){
		Scanner keyboard = new Scanner(System.in);
		if(hiddenWord.contains("*")){

			System.out.println(spaces+"What is your guess?");
			guess = keyboard.nextLine();
			guess = guess.toLowerCase();
			GuessString();
			if(LegitWord){
				
				BreakString();
			
			System.out.println(spaces+wordToGuess);
			System.out.println(spaces+hiddenWord);
			System.out.println(spaces+ABC);
			System.out.println("");
			System.out.println("---------------------------------------------------------");
			}
			
			
		}

		else
			Solved=true;
	}
	private static void GuessString(){
		int letterPosition=0;
		length= wordToGuess.length();
		char letter = wordToGuess.charAt(letterPosition);
		String Letter = letter+"";

		for(int count=0; count<=length; count++){
					
		if(ABC.contains(Letter)){
			
			LegitWord=true;
			
		}
		else{
			LegitWord=false;
		}
		letterPosition++;
		Letter="";
		}
	}
	
	private static void BreakString(){		
		int letterPosition=0;
		length= wordToGuess.length();
		
		for(int count=0; count<length; count++){	
		
		char letter = wordToGuess.charAt(letterPosition);
		String Letter = letter+"";
		
		
		if(Letter.equalsIgnoreCase(guess)||Letter.equalsIgnoreCase(" ")){
			
			int position = letterPosition;
			int position2 = letterPosition+1; 
			String frontWord = hiddenWord.substring(0,position);

			String endWord = hiddenWord.substring(position2);
			
			hiddenWord = frontWord+Letter+endWord;
			ABCletter=Letter;
		}
		
		letterPosition++;
		}
		int ABCindexPosition = ABC.indexOf(ABCletter);
		
		
		int ABCposition = ABCindexPosition;
		int ABCposition2 = ABCindexPosition+1; 
		String frontABC = ABC.substring(0,ABCposition);

		String endABC = ABC.substring(ABCposition2);
		ABC=frontABC+endABC;
		
	
	}


	private static void GetTextToGuess(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println(spaces+"What is the text that you want to guess?");
		wordToGuess=keyboard.nextLine();

		int numOfChar = wordToGuess.length();

		for(int count=0; count<numOfChar; count++){
			hiddenWord=hiddenWord+"*";

		}
	}
	private static void Intro(){
		System.out.println(spaces+"Play a game of hangman!");
	}
	
}
