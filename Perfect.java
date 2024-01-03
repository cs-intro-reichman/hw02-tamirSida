/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
		int num = Integer.parseInt(args[0]);
		int sum = 0;
		String perfectNum = (num + " is a perfect number since " + num + " = " + "1");

		for (int i=1; i>0; i++) {
			if (num % i == 0 && i!= num) {
				sum+= i;
				if (num % i == 0 && i!= num && i!=1){
					 perfectNum+= " + " + i;
				}
			}
		}
			if (sum == num) {
				System.out.print(perfectNum);
			}
			else {
				System.out.print(num + " is not a perfect number");
			}
		}
	}
			
	