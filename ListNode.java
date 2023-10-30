package edu.monmouth.hw2;

public class ListNode {
	private Node head;

	public ListNode() {
		head = null;
	}

	public Node removeFirst() {
		if (head == null) {
			return null;
		}

		Node removedNode = head;
		head = head.getNext();
		return removedNode;
	}

	public Node first() {
		return head;
	}

	public Node last() {
		if (head == null) {
			return null;
	}

	Node current = head;
	while (current.getNext() != null) {
		current = current.getNext();
	}
	return current;
	}

	public void insert(Book element) {
		Node newNode = new Node(element);
		newNode.setNext(head);
		head = newNode;
	}

	public void insertEnd(Book element) {
		Node newNode = new Node(element);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newNode);
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int size() {
		int count = 0;
		Node current = head;
		while (current != null) {
			count++;
			current = current.getNext();
		}
		return count;
	}

	public void clear() {
		head = null;
	}

	@Override
	public String toString() {
		StringBuilder logString = new StringBuilder();
		Node node = head;
		int count = 0;
		while (node != null) {
			count++;
			logString.append(count + " . " + node.getInfo() + "\n");
			node = node.getNext();
		}
		return logString.toString();
	}
}