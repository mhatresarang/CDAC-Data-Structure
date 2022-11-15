
public class Flowervase {
public static void main (String [] args ) {
	
	flowervasexxx f1 = new flowervasexxx();
	int a =f1.recursion2(7);
	System.out.println(a);
}
}
class flowervasexxx {
	int vase = 0;
	
	int recursion2 (int num) {
		if (num>0) {
	    int vase = num - recursion2(num-1);	
	    System.out.println(">"+vase);
		
		}
				
		return vase;
	}
}