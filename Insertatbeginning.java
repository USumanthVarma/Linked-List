package linked;

public class Insertatbeginning {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	Node head;
	//inser at beginning
	void insertAtBeginning(int data) {
		Node newNode=new Node(data);
	      newNode.next=head;
	      head=newNode;
	}
	void display() {
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+"->");
			current=current.next;
		}
		System.out.print("null");
	}
	public static void main(String[] args) {
		Insertatbeginning list=new Insertatbeginning();
		list.insertAtBeginning(10);
		list.insertAtBeginning(20);
		list.insertAtBeginning(30);
		list.insertAtBeginning(5);
		list.display();
		
	}

}