package JavaProgramPractice2;

public class CountNumberOfRotion {
	static int arr4[] = { 15, 18, 2, 3, 6 };
	static int temp4;
	static int count2 = 0;

	public static void main(String[] args) {

		for (int j = arr4.length - 1; j > 0; j--) {
			temp4 = arr4[0];
			if (temp4 > arr4[j]) {
				for (int j2 = 0; j2 < arr4.length - 1; j2++) {
					arr4[j2] = arr4[j2 + 1];
				}
				arr4[arr4.length - 1] = temp4;
			} else if (temp4 < arr4[j]) {
				break;
			}
			count2++;
		}

		System.out.println("Count " + count2);

	}

}
