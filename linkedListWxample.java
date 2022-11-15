
public class linkedListWxample {

	public static void main(String[] args) {
		
		Kite k1 = new Kite("Red","Sarang",50,true);
		Kite k2 = new Kite ("Green","Akash",40,false);
		Kite k3 = new Kite ("Blue","Paresh",30,true);
		Kite k4 = new Kite ("Black","Sushant",100,false);
		Kite k6 = new Kite ("purple","Pavan",200,true);
		Kite k7 = new Kite ("Magenta","shubham",300,true);
		Kite k8 = new Kite ("Grey","Saurav",900,true);
		
		
		
//		k1 = k2;
		//k1.next = k2;
		//k2.next = k3;
		//k3.next = k4;
		
		
		/*System.out.println(k1.hashCode());
		System.out.println(k2.hashCode());                              
		System.out.println(k3.hashCode());
		System.out.println(k4.hashCode());
		
		/*1365202186
		1651191114
		1586600255
		474675244*/
		
		/*System.out.println(k1.hashCode());
		System.out.println(k1.next.hashCode());                              
		System.out.println(k1.next.next.hashCode());
		System.out.println(k1.next.next.next.hashCode());
		
		
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);
		System.out.println(k4 );*/
		
		MyLinkedList list = new MyLinkedList();
		list.Showlist();
		list.addAtEnd(k1);
		list.addAtEnd(k2);
		list.addAtEnd(k3);
		list.addAtEnd(k4);
		list.addAtEnd(k6);
		list.Showlist();
		System.out.println("=========================================================");
		
		/*list.findaccordinglength(50);
		list.findaccordingowner("Sarang");
		list.findaccordingowner("Pavan");
		list.ModifyByOwner("Pavan", "aditya");
		list.RemoveNode("aditya");
		list.Showlist();
		list.RemoveNode("Akash");
		list.Showlist();*/
		
		list.InsertBeforeByOwner("Akash", k7);
		System.out.println("=========================================================");
		list.Showlist();
		System.out.println("=========================================================");
		list.InsertAfterByOwner("Akash", k8);
		System.out.println("=========================================================");
		list.Showlist();
	}
}
	class Kite{
		
		String color;
		String owner;
		int length;
		boolean flying;
		Kite next;
		
		
		


		public Kite(String color, String owner, int length, boolean flying) {
			
			this.color = color;
			this.owner = owner;
			this.length = length;
			this.flying = flying;
		}


		public String getColor() {
			return color;
		}


		public void setColor(String color) {
			this.color = color;
		}


		public String getOwner() {
			return owner;
		}


		public void setOwner(String owner) {
			this.owner = owner;
		}


		public int getLength() {
			return length;
		}


		public void setLength(int length) {
			this.length = length;
		}


		public boolean isFlying() {
			return flying;
		}


		public void setFlying(boolean flying) {
			this.flying = flying;
		}


		public Kite getNext() {
			return next;
		}


		public void setNext(Kite next) {
			this.next = next;
		}


		@Override
		public String toString() {
			return "Kite [color=" + color + ", owner=" + owner + ", length=" + length + ", flying=" + flying + "]";
		}
			
		
	}


