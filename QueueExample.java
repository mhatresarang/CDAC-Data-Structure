
public class QueueExample {
	
	public static void main(String[] args) {
		
		Queue MyQueue = new Queue(5);
		MyQueue.add(10);
		MyQueue.add(20);
		MyQueue.add(30);
		MyQueue.add(40);
		MyQueue.add(50);
//		MyQueue.add(60);
		System.out.println(MyQueue.remove());
		System.out.println(MyQueue.remove());
		System.out.println(MyQueue.remove());
		System.out.println(MyQueue.remove());
		System.out.println(MyQueue.remove());
		
		
		
	}

} 

class ArrayOverflowException extends RuntimeException{
	public ArrayOverflowException(String str){
		super(str);		
	}
	
class ArrayUnderFlowException extends RuntimeException{
	
	public ArrayUnderFlowException(String str) {
		// TODO Auto-generated constructor stub
		super (str);
	}
}
}
class Queue {
	int index = -1;
	 int length;
	 int array[];
	 int front = -1;
	
	
	Queue(int length){
		
		this.length = length;
		array= new int [length];
		
	}
	
	void add (int item) {
		
		if(index>length-2) {
			throw new ArrayOverflowException("Overflow");	
		}
		array[++index]=item;
		System.out.println("Added item is " +item+"at index "+index);
		
	}
	
	int remove () {
		
		if ( front> index-1) {
		throw new RuntimeException("underflow");
		}
		System.out.println("removed element is "+array[++front]);
		return array[front];
		
	}
}
