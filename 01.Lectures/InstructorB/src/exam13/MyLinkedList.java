package InstructorB.src.exam13;

public class MyLinkedList {
	private Node head; // 첫 번째 노드를 가리키는 변수
	private int size = 0;
	
	private class Node {
		Object data;
		Node next;
		
		Node(Object input) {
			this.data = input;
			this.next = null;
		}
	}
	
	// 새로운 노드를 만들고 맨 앞에 붙이는 원리
	public void addFirst(Object input) {
	public void add(int index, Object input) { // 여기서 집중력 저하...
		if(index == 0) {
			addFirst(input);
			return;
		}
	
		Node newNode = new Node(input);
		Node prev = head;
		for (int i = 0; i < index - 1; i++) {
			prev = prev.next;
		}
		newNode.next = prev.next;
		prev.next = newNode;
		size++;
	}

//	public void addFirst(Object input) {
//		Node newNode = new Node(input);
//		Node prev = head;
//		for (int i = 0; i < index - 1; i++) {
//			prev = prev.next;
//		}
//		newNode.next = prev.next;
//		prev.next = newNode;
//		newNode.next = head;
//		head = newNode;
//		size++;
//	}
//	
//	public Object remove(int index) {
//		if (index == 0) {
//			Object data = head.data;
//			head = head.next;
//			size--;
//			return data;
//		}
//	}
	
//		Node prev = head;
//		for (int i = 0; i < index - 1; i++) {
//		prev = prev.next;
//	}
//		Node toDelete = prev.next;
//		prev.next = toDelete.next;
//		Object returnData = toDelete.data;
//		toDelete = null;
//		size--;;
//		return returnData;
//	
	
	// 연결된 고리를 타고 하나씩 이동
	public Object get(int index) {
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp.data;
	}
	
	public String toString() {
		if (head == null) return "[]";
		
		Node temp = head;
		String str = "[";
		while (temp.next != null) {
			str += temp.data + ", ";
			temp = temp.next;
		}
		return str + temp.data + "]";
	}
}
}
