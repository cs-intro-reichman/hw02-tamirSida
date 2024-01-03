/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {

public static void main(String[] args) {

	int current = (int) (Math.random() * 10);
	int next;
	int temp;
	System.out.print(current);

	do {
		next = (int) (Math.random() * 10);
		if (next > current) {
			
			System.out.print(" " +next);
			temp= current;
			current=next;
			next= temp;
			
			
			
	}
}
	while (next<current);

}
}