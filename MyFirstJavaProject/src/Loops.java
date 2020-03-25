
public class Loops {

	public static void main(String[] args) {
		int i;
		for (i = 0; i < 5; i++) {
		    if (i >= 2) {
		    	break;
		    }
		    System.out.println("Yuhu");
		}
		System.out.println(i);
		System.out.println("\n");
		
		int a;
		for (a = 0; a < 5; a++) {
		    if (a >= 3) {
		        break;
		    }
		    System.out.println("Yuhu");
		    if (a >= 1) {
		        continue;
		    }
		    System.out.println("Tata");
		}
		System.out.println(a);
		
		//Loop through and print out all even numbers, each in a separate line, from the
		//numbers list in the same order they are received. Don't print
		//any numbers that come after 237 in the sequence.
		
		System.out.println("\n");
		int num;
		for (num = 0; num < 237; num++) {
			
			if ((num%2) == 0) {
				System.out.println(num);
			}
		}
	}

}
