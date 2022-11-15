
public class StackExample {
	public static void main(String[] args) {
		MyStack theStack = new MyStack(5);// object of class created with passing the length
		theStack.push(10);//pushing the element 
		theStack.push(20);
		theStack.push(30);
		theStack.push(40);
		theStack.push(50);
//		theStack.push(60);
		int a =theStack.peek();
		System.out.println(a);
		theStack.pop();
		a =theStack.peek();
		System.out.println(a);
		theStack.pop();
		theStack.pop();
		theStack.pop();
		theStack.pop();
		theStack.pop();
		
//		System.out.printf("%s \n", MyStack.toString());
	} 
}

class ArrayOverflowException extends RuntimeException
{
	public ArrayOverflowException (String str) {
		super(str);
	}
}	
class ArrayUnderflowException extends RuntimeException{
	public ArrayUnderflowException(String str) {
		super(str);
		
	}
}
class MyStack{
	int index = -1;
	int size;
	int array[]; //just a referance to int array
	
	
	
	public MyStack(int size) {
		System.out.println("MyStack is Created With"+size);
		this.size = size;
		array = new int[size];
	}
	
	void push(int item) {
		
		if (index > size-2) {
			throw new ArrayOverflowException("StackOverflow");//Parameterized Constructer is called here
		}
		array[++index]= item;
		System.out.println("added item "+item);
		
		
	}
	
	int peek() {
		System.out.println(array[index]);
		return array[index];
		
	}
	
	int pop () {
		if(index<0) {

			throw new ArrayUnderflowException ("underflow");
			
		}
		return array[index--];
	
	}
}

