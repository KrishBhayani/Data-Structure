import java.util.Scanner;

public class CircularQueue{
	static int f=-1 , r=-1, y;
	static int[] queue = new int[5];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<=5 ; i++){
			System.out.println("enter element to enter :");
			y = sc.nextInt();
			Cqinsert(y);
			Display();
		}
		for(int i=0 ; i<=5 ; i++){
			Cqdelete();
		}
	}
	public static void Cqinsert(int y){
		//reset rear pointer
		if(r==4){
			r=0;
		}
		else{
			r=r+1;
		}
		//check for overflow
		if(f==r){
			System.out.println("Queue overflow");
			return;
		}
			queue[r] = y;
		if(f==-1){
			f=0;
		}
	}
	public static void Cqdelete(){
		if(f==-1){
			System.out.println("Queue Underflow");
			return;
		}
		else{
			y = queue[f];
			System.out.println("deleted element is:"+y+"   ");
		}
		if(f==r){
			f=0;
			r=0;
		}
		if(f==4){
			f=-1;
		}
		else{
			f=f+1;
		}
	}
	public static void Display(){
		for(int i=0;i<=4;i++){
			System.out.println("Queue is:"+queue[i]+"   ");
		}
	}
}