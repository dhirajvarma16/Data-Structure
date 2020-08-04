package JavaProgramPractice2;

public class square_root_bineary_tree {

	public static int binery_tree() {
		int arr = 9, mid_value = 0;
		int start_value = 1, end_value = arr;

		while (start_value <= end_value) {

			if (mid_value * mid_value == arr) {
				return mid_value;
			} else if (mid_value * mid_value > arr) {
				end_value = end_value - 1;
			} else {
				start_value = start_value + 1;
			}

		}
		return end_value;
	}

	public static void main(String[] args) {
		System.out.print("" + binery_tree());
	}
}
