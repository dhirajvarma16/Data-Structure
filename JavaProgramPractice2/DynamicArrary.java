package JavaProgramPractice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArrary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Q = scanner.nextInt();
		int N = scanner.nextInt();
		DynamicArrary da = new DynamicArrary(N);
		for (int i = 0; i < Q; i++) {
			int queryType = scanner.nextInt();
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			if (queryType == 1) {
				da.appendValue(x, y, N);
			} else {
				da.printValue(x, y, N);
			}
		}

	}

	List<Integer> seqIntegers = new ArrayList<Integer>();

	List<List<Integer>> seqList = new ArrayList<List<Integer>>();

	int lastAnswer = 0;

	public DynamicArrary(int n) {
		for (int i = 0; i < n; i++) {
			seqList.add(seqIntegers);
		}
	}

	public void appendValue(int x, int y, int N) {
		List<Integer> seq = new ArrayList<>();
		int rowNum = (x ^ lastAnswer) % N;
		seq = seqList.get(rowNum);
		seq.add(y);
	}

	public void printValue(int x, int y, int N) {
		int rowIndex = (x ^ lastAnswer) % N;
		List<Integer> seq = seqList.get(rowIndex);
		int colNum = y % seqList.size();
		lastAnswer = seq.get(colNum);
		System.out.print(lastAnswer);
	}

}