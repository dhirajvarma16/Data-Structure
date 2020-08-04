package JavaProgramPractice2;

public class LinkedListStack {
	class Node {
		int value;
		Node nextNode;
	}

	public static void main(String[] args) {
		LinkedListStack lls = new LinkedListStack();
		lls.push(100);

	}

	Node headNode;

	public LinkedListStack() {
		headNode = null;
	}

	public int pop() {
		if (headNode == null) {
			System.out.println("stack is empty");
		}
		int value = headNode.value;
		headNode = headNode.nextNode;
		return value;
	}

	public void push(int value) {
		Node extraNode = headNode;
		headNode = new Node();
		headNode.value = value;
		headNode.nextNode = extraNode;
	}

}
