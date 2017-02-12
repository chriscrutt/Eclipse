import java.util.Scanner;

public class helloWorld {

	private static Scanner userInput;

	public static void main(String[] args) {
		
		userInput = new Scanner( System.in );
		
		String userName;
		
		boolean yes;
		
		do {
		
		System.out.print("Enter your first name: ");
		userName = userInput.next( );
		
		String firstName = userName.substring(0, 1).toUpperCase() + userName.substring(1);
		
		if (userName.length() <= 5 ) {
			
			yes = true;
			System.out.println("Hey " + firstName + "!");
			System.out.println();
			
		} else if (userName.length() > 5) {
			
			yes = true;
			System.out.println("Wazzup " + firstName + "???");
			System.out.println();
			
		} else if (userInput == null){
			
			yes = false;
			
		}
		
		} while (yes = true);
		
		System.out.println("Exit!");
		
	}

}