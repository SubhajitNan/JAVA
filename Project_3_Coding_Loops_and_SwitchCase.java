import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		int choice;
		System.out.println("Pick one :-");
		System.out.println("1. Hi");
		System.out.println("2. Hey");
		System.out.println("3. Hello");
		System.out.println("*************");
		Scanner s = new Scanner (System.in);
		choice = s.nextInt();
		switch(choice)
		{
			case 1 : System.out.println("You said Hi \n");
			break;
			case 2 : System.out.println("You said Hey \n");
			break;
			case 3 : System.out.println("You said Hello \n");
			break;
			default : System.out.println("Invalid choice. \n");
		}
	}
}

*************************************************************************************************
