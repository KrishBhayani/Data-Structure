import java.util.*;
class Node{
	int info;
	Node link;
}

class SinglyLinkedList{
	static Scanner sc = new Scanner(System.in);
	static Node FIRST = null;
	public static void main(String args[]){
		System.out.println("Enter Your Choice : \n1. Insert at First\n2. Insert at End\n3. Display\n4. Exit");
		int ch = sc.nextInt();
		while(true){
			switch(ch){
			case 1:
				FIRST = insert(sc.nextInt(),FIRST);
				break;
			case 2:
				FIRST = insertEnd(sc.nextInt(),FIRST);
				break;
			case 3:
				display(FIRST);
				break;
			case 4:
				System.exit(0);
				break;
		}
			System.out.println("Enter Your Choice : \n1. Insert at First\n2. Insert at End\n3. Display\n4. Exit");
			ch = sc.nextInt();
		}
		
		
	}

	public static Node insert(int x, Node FIRST){
		Node newNode = new Node(); 
		if(newNode == null){
			System.out.println("Stack Underflow");
			return FIRST;
		}
		newNode.info = x;
		newNode.link = FIRST;
		return newNode;
	}

	public static Node insertEnd(int x, Node FIRST){
		Node newNode = new Node(); 
		if(newNode == null){
			System.out.println("Stack Underflow");
			return FIRST;
		}
		newNode.info = x;
		newNode.link = null;

		if(FIRST == null){
			return newNode;
		}
		Node SAVE = FIRST;
		while(SAVE.link != null){
			SAVE = SAVE.link;
		}
		SAVE.link = newNode;
		return FIRST;
	}

	public static void display(Node FIRST){
		Node SAVE = FIRST;
		while(SAVE.link != null){
			System.out.println(SAVE.info+"\t"+SAVE.link);
			SAVE = SAVE.link;
		}
		System.out.println(SAVE.info+"\t"+SAVE.link);
	}
}