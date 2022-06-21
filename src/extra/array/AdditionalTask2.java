package extra.array;

public class AdditionalTask2 {
	
	public static String toBinaryStr(int number) {
		int temp = 0;
		StringBuffer str = new StringBuffer("");
		int count = 0;
		while(number > 0) {
			temp = number % 2;
			number = number / 2;
			str.insert(count, temp);
			count++;
		}
		String res = str.reverse().toString();
		return res;
	}

}
