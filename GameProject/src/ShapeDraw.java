import java.util.Scanner;

public class ShapeDraw
{
	public static String spaces = "                         ";
	public static int AskedShape;
	public static int height;
	public static String Spacing = "\n\n\n\n\n\n";
	public static String repeat = "yes";
	public static void Shapes(){

		Scanner keyboard = new Scanner(System.in);

		while(repeat.equalsIgnoreCase("yes")){
			Space();
			Intro();
			makeGame();
			Space();
			System.out.println("Would you like to draw another shape?");
			Space();
			repeat=keyboard.next();
			height=0;
			spaces="                         ";
		}


	}
	private static void Intro(){
		Scanner keyboard = new Scanner(System.in);

		System.out.println(spaces+"Please choose a shape to draw! \n"
				+ spaces+"1) Triangle \n"
				+ spaces+"2) Parallelogram \n"
				+ spaces+"3) Pine Tree \n"
				+ spaces+"4) Diamond \n"
				+ spaces+"5) Trapezoid ");
		AskedShape= keyboard.nextInt();

	}
	private static void makeGame(){
		switch(AskedShape){
		case 1:
			GetTriangleSize();
			Triangle();
			break;
		case 2:
			GetParallelogramSize();
			Parallelogram();
			break;
		case 3:
			Pine_Tree();
			break;
		case 4:
			GetDiamondSize();
			DiamondTop();
			DiamondBot();
			break;
		case 5:
			GetTrapezoid();
			Trapezoid();
			break;
		default:
			System.out.println("Please enter a nummber between 1 and 5");			
			break;

		}
	}
	private static void Triangle(){

		int rows = height;
		int starCount = 1;
		int spaceCount = rows - 1;

		for (int rowCount = 1; rowCount <= rows; rowCount++) {
			System.out.print(spaces);
			for (int count = 0; count < spaceCount; count++) {
				System.out.print(" ");
			}
			for (int count = 0; count < starCount; count++) {
				System.out.print("*");
			}
			starCount += 2;
			spaceCount--;
			System.out.println();
		}

	}
	private static void Space(){
		System.out.println(Spacing);
	}
	private static void Parallelogram(){

		for ( int k = 0; k < height; k++){ 
			for ( int j =19 - k ; j>0; j--) 
			{ 
				System.out.print(" "); 
			} 
			System.out.print("*"); 

			for (int i = 0; i < height; i++) 
			{ 
				System.out.print("*"); 
			} 
			System.out.println("*"); 
		} 

	} 


	private static void Pine_Tree(){
		height=14;	
		spaces="                              ";
		Triangle();
		height=11;
		spaces="                        ";
		Trapezoid();
		height=13;
		spaces="                    ";
		Trapezoid();
		Trunk();
	}
	private static void DiamondTop(){
		height=(height + 1) / 2;
		int rows = height;
		int starCount = 1;
		int spaceCount = rows - 1;
		for (int rowCount = 1; rowCount <= rows; rowCount++) {
			System.out.print(spaces);
			for (int i = 0; i < spaceCount; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < starCount; i++) {
				System.out.print("*");
			}
			starCount += 2;
			spaceCount--;
			System.out.println();
		}

	}
	private static void DiamondBot(){
		int rows = height-1;
		int starCount = 2 * (rows - 1) + 1;
		int spaceCount = 1;
		for (int rowCount = 1; rowCount <= rows; rowCount++) {
			System.out.print(spaces);
			for (int i = 0; i < spaceCount; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < starCount; i++) {
				System.out.print("*");
			}
			starCount -= 2;
			spaceCount++;
			System.out.println();
		}
	}
	private static void Trapezoid(){

		int rows = height-2;
		int starCount = height*2;
		int spaceCount = rows - 1;
		for (int rowCount = 1; rowCount <= rows; rowCount++) {
			System.out.print(spaces);
			for (int count = 0; count < spaceCount; count++) {
				System.out.print(" ");
			}
			for (int count = 0; count < starCount; count++) {
				System.out.print("*");
			}
			starCount += 2;
			spaceCount--;
			System.out.println();
		}


	}
	private static void Trunk(){
		for (int count = 0; count < 4; count++) {
			System.out.println(spaces+"                    "+"******");
			}
	}
	
	private static void GetTriangleSize(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println(spaces+"What size triangle would you want? Bigger then 5 less then 20 please");
		height = keyboard.nextInt();

	}
	private static void GetDiamondSize(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println(spaces+"What size diamond would you want? Bigger then 5 less then 20 please");
		height = keyboard.nextInt();
	}
	private static void GetTrapezoid(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println(spaces+"What size trapezoid would you want? Bigger then 5 less then 20 please");
		height = keyboard.nextInt();
	}
	private static void GetParallelogramSize(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println(spaces+"What size parallelogram would you want? Bigger then 5 less then 20 please");
		height = keyboard.nextInt();

	}
}
