import java.nio.channels.Pipe;
import java.util.Iterator;
import java.util.TreeSet;

public class TreesetExample {

	public static void main(String[] args) {
		
		
		
		PIPE P1 = new PIPE(100, "SS", 8, "high");
		PIPE P2 = new PIPE(200, "CS", 10, "low");
		PIPE P3 = new PIPE(50, "MS", 12, "verylow");
		PIPE P4 = new PIPE(400, "SS", 6, "high");
		
		
		

		TreeSet<PIPE> ts = new TreeSet<PIPE>();
		System.out.println("Adding the first Element");
		ts.add(P1);
		System.out.println("Adding the second Element");
		ts.add(P2);
		System.out.println("Adding the third Element");
		ts.add(P3);
		System.out.println("Adding the fourth Element");
		ts.add(P4);
		
		
		
		
		
		//System.out.println(ts);
		// the treeset is with object so on basis pf what to compare we need to define the content into comparable 
		// so need to add implement the comparable 
		
//		System.out.println(ts);
		System.out.println("============================================================================");
		
		Iterator <PIPE> ITPIPE = ts.iterator();
	   
		while(ITPIPE.hasNext()) {
			PIPE theValue = ITPIPE.next();
			System.out.println("The Pipe is "+theValue);
		}
		
	}

}


