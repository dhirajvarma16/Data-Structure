package JavaProgramPractice2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FirstUnique1 {

	Set<Integer> unique = new LinkedHashSet<>();
	Set<Integer> allIntegers = new HashSet<>();

	public void add(int num) {
		if (allIntegers.add(num)) {
			unique.add(num);
		} else {
			unique.remove(num);
		}
	}

	public void FirstUnique(int[] nums) {
		for (int num : nums) {
			add(num);
		}
		System.out.print("Unique set "+ unique);
		System.out.print("All set "+ allIntegers);
	}

	public void showUniqueValue() {
		if (unique.isEmpty()) {
			System.out.print(" ");
		}
		System.out.println(unique.iterator().next());
	}
	public static void main(String[] args) {
		int[] num = { 2, 3, 4, 5 };
		FirstUnique1 firstUnique = new FirstUnique1();
		firstUnique.add(5);
		firstUnique.add(1);
		firstUnique.add(2);
		firstUnique.FirstUnique(num);
		firstUnique.showUniqueValue();
		
	}


}
