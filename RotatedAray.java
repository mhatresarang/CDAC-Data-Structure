import java.util.Arrays;

/*1-- declare the target assray as per length of source array
 * 2--iterate through source array from 0 to length
 * 3--determine the rotated index as per formulae
 * 
 *  rotatedindex = (i+K)% source.length
 *  
 *4-- assign the i th index of source code to the target index 
 *5--return target array
 * 
 * 
 */
public class RotatedAray {

	public static void main(String[] args) {
	
		 int SA [ ]= {1,2,3,4};
		 int k = 2;  
		 int rotatedArray[] = rotationTest.solution(SA, k);
		 System.out.println(Arrays.toString(SA));
		 System.out.println(Arrays.toString(rotatedArray));
		

	}
}	
	class rotationTest{
	
	public static int[] solution (int [] sourcearray , int k) {
		 int targetarray[] = new int [sourcearray.length];
		 for (int i = 0;i < sourcearray.length;i++) {
			 int rotationIndex = (i+k) % sourcearray.length;
			 targetarray[rotationIndex]= sourcearray[i]; 
		 }
		return targetarray;
		
	}
}
	
