package JavaProgramPractice2;

public class SumOfSubArrarys {

	public static void main(String[] args) {
		int[] n = { 10, 2, 4, 7, 5 };
		int k = 13;
		int start = 0;
		int end = 1;
		int sum = n[0];
		int len = n.length;
		while (start <= len) {

			while (sum > k && start < end - 1) {
				sum = sum - n[start];
				start++;
			}

			if (sum == k) {
				System.out.print(" " + start + " " + end);
			}
			if (end < len) {
				sum = sum + n[end];
				end++;
			}
		}
	}

}
