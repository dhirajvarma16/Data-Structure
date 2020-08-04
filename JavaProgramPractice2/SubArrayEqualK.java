package JavaProgramPractice2;

import java.util.HashMap;
import java.util.Map;

public class SubArrayEqualK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 2, -2, -30, 10 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int sum = 0, count = 0;
		int k = -20;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum == k) {
				count++;
			}

			if (map.containsKey(sum - k)) {
				count += map.get(sum - k);
			}

			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}

		System.out.print("" + count);

	}

}
