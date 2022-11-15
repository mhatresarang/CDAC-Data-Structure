
public class GenericExample {
	
	public static void main(String [] args) {
	
	Generic<Integer> example1 = new Generic<Integer>(10, 20);
	example1.print();
	example1.swap();
	System.out.println("----------------------------------------------------");
	example1.print();
	
	song s1= new song("thousand years","Ellie Goudling","Romantic",2010);
	song s2 = new song ("radha hi bawri","Swapnil Bandodkar","love",2000);
	
	
	

}
}
class Generic<GenericValues>{
	
	GenericValues x;
	GenericValues y;
	
	
	public Generic(GenericValues x, GenericValues y) {
		
		this.x = x;
		this.y = y;
	}
	
	void print () {
		System.out.println("X   "+x);
		System.out.println("Y   "+y);
	}
	
	void swap() {
		GenericValues temp = x;
		x= y;
		y = temp;
	}
}

class song {
	
	String title;
	String movie;
	String genre;
	int year ;
	
	
	
	public song(String title, String movie, String genre, int year) {
		super();
		this.title = title;
		this.movie = movie;
		this.genre = genre;
		this.year = year;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getMovie() {
		return movie;
	}



	public void setMovie(String movie) {
		this.movie = movie;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	@Override
	public String toString() {
		return "song [title=" + title + ", movie=" + movie + ", genre=" + genre + ", year=" + year + "]";
	}
	
	
	
	
}
