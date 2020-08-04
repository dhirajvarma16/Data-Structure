package JavaProgramPractice2;

public class StackImp {

	public static void main(String[] args) {
		StackImp stackImp = new StackImp(10);
		stackImp.pop();

		System.out.println("--------------");

		stackImp.push(100);
		stackImp.push(200);
		stackImp.push(300);
		stackImp.push(400);

		System.out.println("--------------");
		System.out.println(stackImp.peek());

		stackImp.pop();
		stackImp.pop();
		stackImp.pop();

		System.out.println(stackImp.isEmpty());
		System.out.println(stackImp.isFull());

	}

	int size;
	int arr[];

	int top;

	// time complexity : O(1)

	StackImp(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (size - 1 == top);
	}

	public int peek() {

		if (!this.isEmpty()) {
			return arr[top];
		} else {
			System.out.println("Stack is empty");
			return -1;
		}

	}

	public int pop() {

		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("popped element : " + arr[returnedTop]);
			return arr[returnedTop];
		} else {
			System.out.println("stack is empty");
			return -1;
		}

	}

	public void push(int element) {

		if (!isFull()) {
			top++;
			arr[top] = element;
			System.out.println("pushed element : " + element);
		} else {
			System.out.println("Stack is full now");

		}

	}

}
