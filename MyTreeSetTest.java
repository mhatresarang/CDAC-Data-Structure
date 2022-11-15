import java.util.Scanner;

public class MyTreeSetTest{
	
	public static void main(String[] args) {
		
		
		ChemicalElement gold = new ChemicalElement(79,"Gold","Au",196.97f); //R
		ChemicalElement silver = new ChemicalElement(47,"Silver","Ag",107.87f); //L
		ChemicalElement radium = new ChemicalElement(88,"Radium","Ra",226.03f); //R
	
		ChemicalElement calcium = new ChemicalElement(20,"Calcium","Ca",40.08f); // L L
		ChemicalElement tin  = new ChemicalElement(50,"Tin","Sn",118.711f);// L R
		
		ChemicalElement lead = new ChemicalElement(82,"Lead","Pb",207.2f); // R L
		ChemicalElement uranium  = new ChemicalElement(92,"Uranium","U",238.29f);// R R
	
	Scanner scan = new Scanner(System.in);
	
	MyTreeSet myTreeSet = new MyTreeSet();
	
	int choice = 0;
	do 
	{
		
		System.out.println("1.Insert an Element");
		System.out.println("2.Delete an Element");
		System.out.println("3.InOrder an Element");
		System.out.println("4.PreOrder an Element");
		System.out.println("5.PostOrder an Element");
		System.out.println("6.Exit");
		System.out.println("Enter the chooice ");
		choice = scan.nextInt();
		
		switch(choice)
		{
		case 1 : myTreeSet.Insert();break;
		
		case 3 : myTreeSet.InOrder(myTreeSet.root);break;
		
		case 6 : break;
		}
	}while(choice !=6);
	}
}

class MyTreeSet {
	
	ChemicalElement root = null, temp;
	
	
	void Insert() {
		 create();
		 if(root == null) {
			 root = temp;
		 }
		 else {
			 search(root);
		 }
	}
	void create() {
		System.out.println("Enter the atomic number...");
		Scanner scan = new Scanner(System.in);
		int tempAtomicNumber = scan.nextInt();
		
		temp = new ChemicalElement();
		temp.atomicNumber = tempAtomicNumber;
		temp.left = null;
		temp.right = null;
		
	}
	void search(ChemicalElement ce) {
		
		if ((temp.atomicNumber > ce.atomicNumber)&&(ce.right!=null)) {
			search(ce.right);
			
		}else if((temp.atomicNumber > ce.atomicNumber)&&(ce.right==null)) {
			ce.right = temp;
		}else if ((temp.atomicNumber < ce.atomicNumber) && (ce.left!=null)) {
			search(ce.left);
		}else if ((temp.atomicNumber < ce.atomicNumber) && (ce.left==null)) 
			ce.left=temp; // assing the node
		
	}
	
	void InOrder (ChemicalElement ce) {
		if(root == null) {
			System.out.println("No elements to show in the tree");
			return ;
		}
		if(ce.left!=null) {
			InOrder(ce.left);
		}
		System.out.println("Data :"+ce);
		if(ce.right != null) {
			InOrder(ce.right);
		}
	}
}
