/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//// Put your code here
		
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
		int num = Integer.parseInt(args[0]);
		String answer = "";
		boolean g = false;
		boolean b = false;
		int pick;
		int countt= 0;
		int avgkids= 0;
		int twokids = 0;
		int threekids= 0;
		int fourmore= 0;
		for (int i=0; i<num; i++){
			g=false;
			b=false;
			countt=0;

			do {
				pick = (int) (Math.random()*2);
				if (pick == 1) {
					g = true;
					
					//answer += "g ";
					}else {
					b = true;	
				}
				countt++;
			}
				while (!b||!g);
			
				
				avgkids+=countt;
				if (countt==2){
					twokids++;
				}else if (countt==3){
					threekids++;
				}else if (countt>=4){
					fourmore++;
				
				}
			}
					
					System.out.println("Average: " + ((double) avgkids)/((double)num));
					System.out.println("Number of families with 2 children: " + twokids);
					System.out.println("Number of families with 3 children: " + threekids);
					System.out.println("Number of families with 4 or more children: " + fourmore);

				

						}
			



	}

