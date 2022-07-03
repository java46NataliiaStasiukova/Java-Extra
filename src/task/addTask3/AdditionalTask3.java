package task.addTask3;

public class AdditionalTask3 {
	public static boolean isAnagram(String sourceWord, String targetWord) {
		 String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}1234567890";
		if(sourceWord.length() != targetWord.length()) return false;
		for(int i = 0; i < sourceWord.length(); i++) {
			if(specialCharactersString.indexOf(sourceWord.charAt(i)) >= 0) return false;
			if(specialCharactersString.indexOf(targetWord.charAt(i)) >= 0) return false;
		}
		
		StringBuilder str = new StringBuilder("");
		int res = sourceWord.compareToIgnoreCase(str.append(targetWord).reverse().toString());
		return res == 0 ? true : false;
	}
}
