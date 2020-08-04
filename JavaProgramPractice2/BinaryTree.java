package JavaProgramPractice2;

public class BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	Node rootNode;

	BinaryTree() {
		rootNode = null;
	}

	void printPostorder(Node node) {

		if (node == null) {
			return;
		}

		printPostorder(node.leftNode);
		printPostorder(node.rightNode);

	}

}
