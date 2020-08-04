package JavaProgramPractice2;

public class BitwiseANDOperation {
	int count;

	public static void main(String[] args) {

		int n = 6, m = 8;

		while (n != m) {
			n >>= 1;
			m >>= 1;
			count++;
		}

		m << count;
		System.out.println("Bit wise AND operation" + m);

	}

}
