
public class Recursion {
	public static void main (String [] args) {
	
		factorialclass f1 = new factorialclass();
		int a = f1.calculation(5);
		System.out.println(a);
			
	}
}
class factorialclass{

		int factorial = 1;
		
		int calculation(int num) {
			while (num>0) {
				
				factorial = factorial* num ;
				num --;
				
			}
			return factorial;
		}
}