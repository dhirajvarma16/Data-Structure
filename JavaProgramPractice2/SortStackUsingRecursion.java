package JavaProgramPractice2;

import java.util.Stack;

public class SortStackUsingRecursion {

	public static void sort(Stack<Integer> stacktrace)
	{
		if (stacktrace.isEmpty()) {
			return;
		}
	int temp=stacktrace.pop();	
	sort(stacktrace);
	sortedArrary(stacktrace,temp);
	}
	
	public static void sortedArrary(Stack<Integer> stack,int tempvalue)
	{
		if (stack.isEmpty() || stack.peek()<tempvalue) {
		stack.push(tempvalue);
		return;
		}
		int elem=stack.pop();
		sortedArrary(stack, tempvalue);
		stack.push(elem);
	}
		
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(9);
		stack.push(-1);
		stack.push(120);
		stack.push(2);
		
		System.out.println(stack);
		sort(stack);
		System.out.println(stack);
	  	
	}

}
