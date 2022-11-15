

public class DoublyLinkedList {

	public static void main(String[] args) {
		
		MySongs S1 = new MySongs("My Heart Will Go On", "Titanic", "CelionDion",200);
		MySongs S2 = new MySongs("Perfect", "AlbulEd", "Edsheren",2002);
		MySongs S3 = new MySongs("LoseYourself", "8 Mile", "Eminem",2010);
		MySongs S4 = new MySongs("Zinghat", "Sairat", "Ajay Atul",2020);
		MySongs S5 = new MySongs("Koligeet","KrunalMusic", "Kunalda", 1990);
		// TODO Auto-generated method stub
     doublelinklist list = new doublelinklist();
     list.add(S1);
     list.show();
     list.add(S2);
     list.add(S3);
     list.add(S4);
     list.show();
     System.out.println("====================================================================================");
//     list.delete("Titanic");
     System.out.println("==================================================================================");
//     list.show();
     System.out.println("==================================================================================");
//     list.delete("8 Mile");
     System.out.println("==================================================================================");
//     list.show();
     System.out.println("==================================================================================");
     list.Insert("Perfect", S5);
     list.show();
     System.out.println("==================================================================================");
		
	}
}
class MySongs{
	
	MySongs start=null;
	MySongs ptr;
	
	
	String Title;
	String Movie;
	String Singer;
	int year ;
	MySongs prev;
	MySongs next;
	
	public MySongs(String title, String movie, String singer, int Year) {
		
		Title = title;
		Movie = movie;
		Singer = singer;
		year = Year;
	}

	public String getMovie() {
		return Movie;
	}

	public void setMovie(String movie) {
		Movie = movie;
	}

	public String getSinger() {
		return Singer;
	}

	public void setSinger(String singer) {
		Singer = singer;
	}

	public MySongs getPrev() {
		return prev;
	}

	public void setPrev(MySongs prev) {
		this.prev = prev;
	}

	public MySongs getNext() {
		return next;
	}

	public void setNext(MySongs next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "MySongs [Title=" + Title + ", Movie=" + Movie + ", Singer=" + Singer + ", year=" + year + "]";
	}
	
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


























