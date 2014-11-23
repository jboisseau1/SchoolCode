import java.util.Scanner;
public class BoxGame
{
	public static int ranNum;
	public static String Spaces="                         ";
	public static int boxes;
	public static boolean box1taken;
	public static boolean box2taken;
	public static boolean box3taken;
	public static boolean box4taken;
	public static boolean box5taken;
	public static boolean box6taken;
	public static boolean boxesDone;
	public static int ShortorLong=0;
	public static int attemptNum=0,lastBox=0;
	public static String spaces="                         ",spacing="\n\n\n\n";
	public static void Boxgame() throws InterruptedException{
		Scanner keyboard = new Scanner(System.in);
		String repeat="yes";
		Intro();

		while(repeat.equalsIgnoreCase("yes")){
			box1taken=false;
			box2taken=false;
			box3taken=false;
			box4taken=false;
			box5taken=false;
			box6taken=false;
			boxesDone=false;
			System.out.println("What would you like to do?\n"
					+ "1)Long way\n"
					+ "2)Short way\n");
			ShortorLong = keyboard.nextInt();
			makeGame();
			System.out.println("Want to stack again?");
			repeat=keyboard.next();
			boxes=0;
		}
	}
	private static void Intro(){
		System.out.println("Stack'em Stack'em Stack'em");
	}
	private static void makeGame() throws InterruptedException{
		switch(ShortorLong){
		case 1:
			LongWay();
			break;
		case 2:
			ShortWay();
			break;
		default:
			System.out.println("Please give 1 or 2");
		}


	}
	private static void LongWay() throws InterruptedException{
		while(boxesDone==false){
			Thread.sleep(500);
			ranNum = (int) (Math.random() *6)+1;
			//ranNum=1;
			switch(ranNum){
			case 1:
				evaluate1();
				break;
			case 2:
				evaluate2();
				break;
			case 3:
				evaluate3();
				break;
			case 4:
				evaluate4();
				break;
			case 5:
				evaluate5();
				break;
			case 6:	
				evaluate6();
				break;
			default:
				System.out.println("Cry");


			}
			attemptNum++;
			System.out.println("");
			System.out.println("---------------------------------------------------------");
			System.out.println("Current box above: "+ranNum);
			System.out.println("Boxes used: "+attemptNum);
			
		}
	}
	private static void ShortWay(){
		while(boxesDone==false){
			ranNum = (int) (Math.random() *6)+1;
			//ranNum=1;
			switch(ranNum){
			case 1:
				evaluate1();
				break;
			case 2:
				evaluate2();
				break;
			case 3:
				evaluate3();
				break;
			case 4:
				evaluate4();
				break;
			case 5:
				evaluate5();
				break;
			case 6:	
				evaluate6();
				break;
			default:
				System.out.println("Cry");


			}
			attemptNum++;
			System.out.println("");
			System.out.println("Current box: "+ranNum);
			System.out.println("Boxes used: "+attemptNum);
			System.out.println("---------------------------------------------------------");
			
		}
	}
	private static void Box1(){
		System.out.println(spacing);
		System.out.println(""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ " _________ \n"
				+ "|         |\n"
				+ "|    1    |\n"
				+ "|         |\n"
				+ "|_________|\n");

	}
	private static void Box12(){
		System.out.println(spacing);
		System.out.println(""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ " _________       _________ \n"
				+ "|         |     |         |\n"
				+ "|    1    |     |    2    |\n"
				+ "|         |     |         |\n"
				+ "|_________|     |_________|\n");
	}
	private static void Box2(){
		System.out.println(spacing);
		System.out.println(""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ "                 _________ \n"
				+ "                |         |\n"
				+ "                |    2    |\n"
				+ "                |         |\n"
				+ "                |_________|\n");
	}
	private static void Box123(){
		System.out.println(spacing);
		System.out.println(""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ " _________       _________       _________ \n"
				+ "|         |     |         |     |         |\n"
				+ "|    1    |     |    2    |     |    3    |\n"
				+ "|         |     |         |     |         |\n"
				+ "|_________|     |_________|     |_________|\n");
	}
	private static void Box3(){
		System.out.println(spacing);
		System.out.println(""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ "                                 _________ \n"
				+ "                                |         |\n"
				+ "                                |    3    |\n"
				+ "                                |         |\n"
				+ "                                |_________|\n");
	}	
	private static void Box23(){
		System.out.println(spacing);
		System.out.println(""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ "                 _________       _________ \n"
				+ "                |         |     |         |\n"
				+ "                |    2    |     |    3    |\n"
				+ "                |         |     |         |\n"
				+ "                |_________|     |_________|\n");
	}	
	private static void Box13(){
		System.out.println(spacing);
		System.out.println(""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ " _________                       _________ \n"
				+ "|         |                     |         |\n"
				+ "|    1    |                     |    3    |\n"
				+ "|         |                     |         |\n"
				+ "|_________|                     |_________|\n");
	}
	private static void Box124(){
		System.out.println(spacing);
		System.out.println(""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ "         _________                  \n"
				+ "        |         |                 \n"
				+ "        |    4    |                 \n"
				+ "        |         |                 \n"
				+ "        |_________|                 \n"
				+ " _________       _________                 \n"
				+ "|         |     |         |                \n"
				+ "|    1    |     |    2    |                \n"
				+ "|         |     |         |                \n"
				+ "|_________|     |_________|                \n");
	}
	private static void Box235(){
		System.out.println(spacing);
		System.out.println(""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ "                         _________  \n"
				+ "                        |         | \n"
				+ "                        |    5    | \n"
				+ "                        |         | \n"
				+ "                        |_________| \n"
				+ "                 _________       _________ \n"
				+ "                |         |     |         |\n"
				+ "                |    2    |     |    3    |\n"
				+ "                |         |     |         |\n"
				+ "                |_________|     |_________|\n");
	}
	private static void Box1234(){
		System.out.println(spacing);
		System.out.println(""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ "         _________  \n"
				+ "        |         | \n"
				+ "        |    4    | \n"
				+ "        |         | \n"
				+ "        |_________| \n"
				+ " _________       _________       _________ \n"
				+ "|         |     |         |     |         |\n"
				+ "|    1    |     |    2    |     |    3    |\n"
				+ "|         |     |         |     |         |\n"
				+ "|_________|     |_________|     |_________|\n");
	}
	private static void Box1235(){
		System.out.println(spacing);
		System.out.println(""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ "                         _________  \n"
				+ "                        |         | \n"
				+ "                        |    5    | \n"
				+ "                        |         | \n"
				+ "                        |_________| \n"
				+ " _________       _________       _________ \n"
				+ "|         |     |         |     |         |\n"
				+ "|    1    |     |    2    |     |    3    |\n"
				+ "|         |     |         |     |         |\n"
				+ "|_________|     |_________|     |_________|\n");
	}
	private static void Box12345(){
		System.out.println(spacing);
		System.out.println(""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ "         _________       _________  \n"
				+ "        |         |     |         | \n"
				+ "        |    4    |     |    5    | \n"
				+ "        |         |     |         | \n"
				+ "        |_________|     |_________| \n"
				+ " _________       _________       _________ \n"
				+ "|         |     |         |     |         |\n"
				+ "|    1    |     |    2    |     |    3    |\n"
				+ "|         |     |         |     |         |\n"
				+ "|_________|     |_________|     |_________|\n");
	}
	private static void Box123456(){
		System.out.println(spacing);
		System.out.println(""
				+ "                 _________ \n"
				+ "                |         |\n"
				+ "                |    6    |\n"
				+ "                |         |\n"
				+ "                |_________|\n"
				+ "         _________       _________  \n"
				+ "        |         |     |         | \n"
				+ "        |    4    |     |    5    | \n"
				+ "        |         |     |         | \n"
				+ "        |_________|     |_________| \n"
				+ " _________       _________       _________ \n"
				+ "|         |     |         |     |         |\n"
				+ "|    1    |     |    2    |     |    3    |\n"
				+ "|         |     |         |     |         |\n"
				+ "|_________|     |_________|     |_________|\n");
	}

	private static void ResetGame(){
		box1taken=false;
		box2taken=false;
		box3taken=false;
		box4taken=false;
		box5taken=false;
		box6taken=false;

	//	System.out.println("Box reset");
	}
	private static void evaluate1(){
		if(box1taken==true){
			ResetGame();
			//System.out.println("first if");
		}
		 if(box1taken==false){
			if(box2taken==false&&box3taken==true){
				Box13();
				box1taken=true;
			}
			if(box2taken==true&&box3taken==true){
				Box123();
				box1taken=true;
			}

			if(box2taken==false&&box3taken==false){
				Box1();
				box1taken=true;
			}
			if(box2taken==true&&box3taken==false){
				Box12();
				box1taken=true;
			}
			//System.out.println("second if");
		}	

		else{
			ResetGame();
			//System.out.println("in else");
		}
	}
	private static void evaluate2(){
		if(box2taken==true){
			ResetGame();
			//System.out.println("first if");
		}
		 if(box2taken==false){
			if(box1taken==false&&box3taken==true){
				Box23();
				box2taken=true;
			}
			if(box1taken==true&&box3taken==true){
				Box123();
				box2taken=true;
			}
			if(box1taken==true&&box3taken==false){
				Box12();
				box2taken=true;
			}
			if(box1taken==false&&box3taken==false){
				Box2();
				box2taken=true;
			}
			//System.out.println("second if");
		}
		else{
			ResetGame();
			//System.out.println("in else");
		}
	}
	private static void evaluate3(){
		if(box3taken==true){
			ResetGame();
			//System.out.println("first if");
		}
		 if(box3taken==false){
			if(box1taken==false&&box2taken==false){
				Box3();
				box3taken=true;
			}
			
			if(box1taken==true&&box2taken==true){
				Box123();
				box3taken=true;
			}
			if(box1taken==false&&box2taken==true){
				Box23();
				box3taken=true;
			}
			if(box1taken==true&&box2taken==false){
				Box13();
				box3taken=true;
			}
			//System.out.println("second if");
			
		}
		else{
			ResetGame();
			//System.out.println("in else");
		}
	}
	private static void evaluate4(){
		if(box4taken==true){
			ResetGame();
			//System.out.println("first if");
		}
		 if(box4taken==false){
						
			if(box1taken==true&&box2taken==true&&box3taken==true&&box5taken==true){
				Box12345();
				box4taken=true;
				
			}
			
			if(box1taken==true&&box2taken==true&&box3taken==true&&box5taken==false){
				Box1234();
				box4taken=true;
			}
			
			if(box1taken==true&&box2taken==true&&box3taken==false&&box5taken==false){
				Box124();
				box4taken=true;
			}
			if(box1taken==false||box2taken==false){
				ResetGame();
				//System.out.println("reset if");
			}
			//System.out.println("second if");
		}
		else{
			ResetGame();
			//System.out.println("in else");
		}

	}
	private static void evaluate5(){
		if(box5taken==true){
			ResetGame();
			//System.out.println("first if");
		}
		 if(box5taken==false){
						
			if(box1taken==true&&box2taken==true&&box3taken==true&&box4taken==true){
				Box12345();
				box5taken=true;
			}
			if(box1taken==true&&box2taken==true&&box3taken==true&&box4taken==false){
				Box1235();
				box5taken=true;
			}
			
			if(box2taken==true&&box3taken==true&&box3taken==false&&box4taken==false){
				Box235();
				box5taken=true;
			}
			if(box3taken==false||box2taken==false){
				ResetGame();
			//	System.out.println("reset if");
			}
			//System.out.println("second if");

		}
		else{
			ResetGame();
			//System.out.println("in else");
		}

	}
	private static void evaluate6(){
		if(box6taken==true){
			ResetGame();
			//System.out.println("first if");
		}
		  if(box6taken==false){
			  if(box1taken!=true||box2taken!=true||box3taken!=true||box4taken!=true||box5taken!=true){
					ResetGame();
					//System.out.println("first if in second if");
				}
			if(box1taken==true&&box2taken==true&&box3taken==true&&box4taken==true&&box5taken==true){
				Box123456();
				box6taken=true;
				boxesDone=true;
			}
			
			//System.out.println("second if");

		}
		  else{
				ResetGame();
				//System.out.println("in else");
			}
	}
}
