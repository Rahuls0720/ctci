package Question1_3;

public class QuestionB {	
	// public static boolean permutation(String s, String t) {
	// 	if (s.length() != t.length()) {
	// 		return false;
	// 	}
		
	// 	int[] letters = new int[128];
		 
	// 	char[] s_array = s.toCharArray();
	// 	for (char c : s_array) { // count number of each char in s.
	// 		letters[c]++;  
	// 	}
		  
	// 	for (int i = 0; i < t.length(); i++) {
	// 		int c = (int) t.charAt(i);
	// 	    if (--letters[c] < 0) {
	// 	    	return false;
	// 	    }
	// 	}
		  
	// 	return true;
	// }

	// st2 needs to be formed rearranging chars in str1; str1 len == str2 len
	public static boolean permutation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		int[] letter_count = new int[26];
		for (int i = 0; i < str1.length(); i++) { 
			letter_count[str1.charAt(i) - 'a']++;
		}

		for (int i = 0; i < str2.length(); i++) {
			if (--letter_count[str2.charAt(i) - 'a'] < 0) {
				return false;
			} 
		}

		return true;
	}
	
	public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = permutation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}
	}
}
