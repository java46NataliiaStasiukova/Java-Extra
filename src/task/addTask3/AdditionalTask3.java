package task.addTask3;

public class AdditionalTask3 {
	public static boolean isAnagram(String sourceWord, String targetWord) {
		if(sourceWord.length() != targetWord.length()) return false;
		StringBuilder str = new StringBuilder("");
		int res = sourceWord.compareToIgnoreCase(str.append(targetWord).reverse().toString());
		return res == 0 ? true : false;
	}
}
