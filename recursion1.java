
public class recursion1 {
	
	public static void main(String[] args) {
		FactorialThroughRecursion f1 = new FactorialThroughRecursion();
		int a = f1.recursion(5);
		System.out.println(a);
		
	}

}

class FactorialThroughRecursion{
	int recursion (int num) {
		
		if(num ==0) {
			
			return 1;
			
		}
		else {
			
			int factorial = num * recursion(num-1);
			return factorial;
		}
		
		
	}
}
