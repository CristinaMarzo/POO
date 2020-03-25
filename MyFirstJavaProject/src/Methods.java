import java.util.Scanner;

public class Methods {

	public static void printFullNameScanner (Scanner name, Scanner family_name) {
		//Write the method printFullName of student which prints the full name of a student.
		System.out.print("Your full name is: ");
		System.out.print(name);
		System.out.print(" ");
		System.out.print(family_name);
	}

	public static void main (String[]args) {
		String name1 = "Lucas";
		String family_name1 = "Rodriguez";
		printFullName(name1, family_name1);
		
		System.out.println("Please introduce your name here: ");
		Scanner name = new Scanner(System.in);
		System.out.println("Please introduce your family name here: ");
		Scanner family_name = new Scanner(System.in);
		printFullNameScanner (name, family_name);
		
	}
	
	public static void printFullName (String name, String family_name) {
		System.out.print("Your full name is: ");
		System.out.print(name);
		System.out.print(" ");
		System.out.println(family_name);
	}
	
}
