package tokenizing;

public class StringDotSplit {

	/* regex:
	 * 
	 * \\s+ - 1 or more whitespace
	 * \\. - dot(period)
	 * (\\. +) - period with 1 or more whitespace after.
	 * \n - newline
	 * (/) - front slash
	 */
	public static void main(String[] args) {
		
		String text = "Washi/ngton is the U.S Capital. Barack is living\nthere.";
		String regex = "\\. +|\\s+|/|\n";
		
		String[] tokens = text.split(regex);
		
		for(String token : tokens)
			System.out.println(token);
	}
}