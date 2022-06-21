package extra.array;

public class AdditionalTask1 {
	

	public static int maxSubsequenceLength(int[] arr) {	
		int temp = 0;
		int count = 0;
		int res = 0;
		for(int i = 0; i < arr.length; i++) {
			if(temp == arr[i]) count++;
			else {
				res = Math.max(count, res);
				temp = arr[i];
				count = 1;
			}
		}
	return res;
	}
}

