/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here

		String word= args[0];
		int wrd_Length = word.length();
		int middle_chr = 0;

		if (wrd_Length==0){
		System.out.println(" ");
	}
		else  {
		// get the mid char
		middle_chr = wrd_Length/2;
	
	for (int i = (word.length()-1); i>=0; i--){
		System.out.print(word.charAt(i));
	}
		System.err.println();

		System.out.println("The middle character is " + word.charAt(middle_chr));

	}
}
}
