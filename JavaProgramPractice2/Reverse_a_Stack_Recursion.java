package JavaProgramPractice2;

import java.util.Stack;

public class Reverse_a_Stack_Recursion {

	public static void emptytheStack(Stack<Integer> stack) {
       if (stack.isEmpty()) {
		return;
	}
       int temp=stack.pop();
       reverseStack(stack,temp);
       
	}
	
	public static void reverseStack(Stack<Integer> stack, int temp1) {
	  if(stack.isEmpty()) {
		  stack.push(temp1);
		  return;
	 }
	 int elem=stack.pop();
	 reverseStack(stack, temp1);
     stack.push(elem);	
    }
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(100);
		stack.push(20);
		stack.push(10);
		stack.push(5);
		emptytheStack(stack);		
		 System.out.println("" + stack );
	}

}
