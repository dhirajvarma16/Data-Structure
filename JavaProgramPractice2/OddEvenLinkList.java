package JavaProgramPractice2;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class OddEvenLinkList {
	public ListNode oddEveList(ListNode head) {
		if (head == null)
			return null;

		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenHead = even;
		while (even != null && even.next != null) {
			odd.next = even.next;
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
		}

		odd.next = evenHead;
		return head;

	}

}
