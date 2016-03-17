import java.util.*;

public class Java_Tests{
	public static void main(String args[]){
		System.out.println("Enter a number of times for \"Hello World\" to be displayed.");
		Scanner input = new Scanner(System.in);
		
		int option = input.nextInt();
		
		for(int i = 1; i <= option; i++){
			if(i < 10){
				System.out.println("Hello World has been printed 0" + i + " times so far.");
			}else{
				System.out.println("Hello World has been printed " + i + " times so far.");
			}
		}// End of for input
	}// End of main method
}// End of class