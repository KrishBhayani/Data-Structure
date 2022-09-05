import java.util.Scanner;

public class Enqueue{
	static int element,size ;
	static int front=0,rear=0;
	static int queue[] = new int[5];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter size of queue:");
		size = sc.nextInt();
		for (int i=0;i<size ;i++) {
			System.out.println("Enter element to enter in queue:");
			element = sc.nextInt();
			enqueue(element);
			display();
		}
		System.out.println("delete :");
		dequeue();
	}

	public static void enqueue(int element){
		if(rear == 4){
			System.out.println("queue overflow");
		}
		else{
			rear = rear + 1;
			queue[rear] = element;
			if(front==0){
				front = 1;
			}
		}
	}

	public static void display(){
		if(front==0){
			System.out.println("Queue empty");
		}
		else{
			for (int i=front;i<=rear ;i++ ){
				System.out.print(queue[i]+"   ");
			}
			System.out.println();
		}
	}

	static void dequeue()
        {
		if(front == 0 || front == rear ) {
			System.out.print("\nQueue is Empty");
		} else {
			queue[front] = 0;
			front = front + 1;
		}
		display();
	}
}