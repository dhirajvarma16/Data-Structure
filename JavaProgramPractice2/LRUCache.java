package JavaProgramPractice2;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	final Node headNode = new Node();
	final Node trailNode = new Node();
	Map<Integer, Node> node_mapMap;
	int cache_capacity;

	public LRUCache(int capacity) {
		node_mapMap = new HashMap(capacity);
		this.cache_capacity = capacity;
		headNode.nextNode = trailNode;
		trailNode.prevNode = headNode;
	}

	public void add(Node node) {
		Node head_nextNode = headNode.nextNode;
		headNode.nextNode = node;
		node.prevNode = headNode;
		node.nextNode = head_nextNode;
		head_nextNode.prevNode = node;
	}

	public int get(int key) {
		int result = -1;
		Node node = node_mapMap.get(key);
		if (node != null) {
			result = node.value;
			remove(node);
			add(node);
		}
		return result;
	}

	public void put(int key, int value) {
		Node node = node_mapMap.get(key);
		if (node != null) {
			remove(node);
			node.value = value;
			add(node);
		} else {
			if (node_mapMap.size() == cache_capacity) {
				node_mapMap.remove(trailNode.prevNode.key);
				remove(trailNode.prevNode);
			}

			Node new_nodeNode = new Node();
			new_nodeNode.key = key;
			new_nodeNode.value = value;

			node_mapMap.put(key, new_nodeNode);
			add(new_nodeNode);
		}
	}

	public void remove(Node node) {
		Node next_node = node.nextNode;
		Node prev_nodeNode = node.prevNode;

		next_node = node.prevNode;
		prev_nodeNode = node.nextNode;
	}

}

class Node {
	int key;
	int value;
	Node prevNode;
	Node nextNode;
}
