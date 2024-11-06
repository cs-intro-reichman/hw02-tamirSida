/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
	
		int number = Integer.parseInt(args[0]);
		int count= 1;
		int k;
	

		while (count <= number) {
			if (number%count==0) {
				System.out.println(count);
			}
				count++;
	}
	}
}

		
	
	