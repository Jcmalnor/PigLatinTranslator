import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String ans = "y";
		while (ans.equalsIgnoreCase("y")) {
			System.out.print("Please type a sentence: ");
			String sentence = sc.nextLine();
			// insert split method
			String result = "";
			for (String word: sentence.split(" ")) {
			result += translateSentence(word) + " ";
			}
			System.out.println("Your sentence is " + result + " in PigLatin");
			
			System.out.print("Again? (Y/N) ");
			ans = sc.nextLine();
			if (ans.equalsIgnoreCase("n")) {
				System.out.println("Goodbye!");
			}
		}
	}

	// method to translate word
	public static String translateSentence(String word) {
		for (int i = 1; i < word.length(); i++) {
//			char letter = (word.charAt(0));
//			if (letter == 'a' || letter == 'e' || letter == 'i' || 
//					letter == 'o' || letter == 'u') {
//				String vowelWord = word + "way";
//				return vowelWord;
			//} else 
				if (word.charAt(i) == 'a' || word.charAt(i) == 'e' 
					|| word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u') {
				String wordStart = word.substring(0, i);
				String wordEnd = word.substring(i, word.length());
				String plWord = wordEnd + wordStart + "ay";
				return plWord;
				}
			}
		return word + "way";
	}
}
