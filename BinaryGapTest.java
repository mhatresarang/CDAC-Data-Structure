import java.util.ArrayList;

public class BinaryGapTest {
	public static void main(String[] args) {
		int count1 = BinaryGap.solution(1041);
		System.out.println("max 0 count : "+count1);
	}
}

class BinaryGap{
	
	public static int solution(int number) {
		String Binaryform = Integer.toBinaryString(number);
		System.out.println(number+"  Binary is "+Binaryform);
		int longestgap=0;
		ArrayList<Integer> onelist = new ArrayList<Integer>();
		for (int i= 0; i<Binaryform.length();i++) {
			if (Binaryform.charAt(i)==0) 
				continue;
			onelist.add(i);
			
		}
		
		// 0 1 2   <-- index
		// 0 6 11  <-- data in index
		
		for(int i=0;i<onelist.size()-1;i++) {
			int indicesDifference = onelist.get(i+1) - onelist.get(i) - 1;
			longestgap = Math.max(longestgap, indicesDifference);
		}
		
		
		return longestgap;
		
	}
}
