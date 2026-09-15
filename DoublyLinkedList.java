package linked;

public class DoublyLinkedList {
	static class Node{
		int data;
		Node prev;
		Node next;
		Node(int data){
			this.data=data;
			this.prev=null;
			this.next=null;
		}
	}
	Node head;
	Node tail;
	void insertlast(int data) {
		Node newNode=new Node(data) ;
		if(head==null) {
			head=newNode;
			tail=newNode;
			return;
		}
		tail.next=newNode;
		newNode.prev=tail;
		tail=newNode;
		
	}
	void displayForward() {
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+"⇌");
			current=current.next;
		}
		System.out.println("Null");
	}
	void displayBackward() {
		Node current=tail;
		while(current!=null) {
			System.out.print(current.data+"⇌");
			current=current.prev;
		}
		System.out.println("Null");
	}
	public static void main(String[] args) {
		DoublyLinkedList list=new DoublyLinkedList() ;
		list.insertlast(10);
		list.insertlast(20);
		list.insertlast(30);
		list.insertlast(40);
		System.out.println("forward: ");
		list.displayForward();
		System.out.println("Backward:");
		list.displayBackward();
	}

}