
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
		String answer = "";
		boolean g = false;
		boolean b = false;
		int pick;
		int countt= 0;
		

		do {
			pick = (int) (Math.random()*2);
			if (pick == 1) {
				g = true;
				System.out.print("g ");
				//answer += "g ";
				 }else {
				//g = false;
				b = true;
				System.out.print("b ");
				// answer += "b ";
				
			}
			countt++;
		}
			while (!b||!g);

			System.out.println();
			System.out.println("You made it... and you now have " + countt + " children.");
				
			}

					}
		


