import java.util.Scanner;

public class Practice 
{

	public static void main(String[] args) 
	{
	//printing
		System.out.print("I know how to print.");
		
		//printing the value of a variable
		
		int num; //declared variable
		num=10; //the initialization----->Just the first assignment statement
		
		
		double decimal= 3.75; //declared and initialized in 1 line
		
		
		String str= "Some string here"; //declared and initialized in one...
		
		//print the value of each
		
		System.out.println("\n"+num); //concatenation: combining strings.
		System.out.println(decimal);
		System.out.println(str);
		
		//add 30 to num
		//subract 25 from deicmal
		//concatinate "more stuff" to str
		
		
		num+=30; // or num=num+30
		decimal= decimal-25.012345; 
		str+=" more stuff"; //str=str+" more stuff"
		
		
		System.out.println("decimal: "+ decimal);
		System.out.println("num: "+num);
		System.out.println("str:  " + str+" <-----that  was the content of the string.");
		
		//created a scanner for input!!!
		Scanner keyboard= new Scanner(System.in);
		
		//create a new string variable from the user to enter favorite sport
		//print to the screen "your favorite sport is _____ and mine is _____"
		
		
		System.out.print("What is your favorite sport?: ");
		String sport= keyboard.nextLine();
		
		System.out.println("Your favorite sport is "+sport+ ", and mine is Tennis."); // or do \n
		
		
		
		
		
		
		
		
		
		
		

	
	}


}
