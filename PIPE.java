
public class PIPE implements Comparable<PIPE>{

	int diameter;
	String Material;
	int Thickness;
	String purity;
	
	
	public PIPE(int diameter, String material, int thickness, String purity) {
		super();
		this.diameter = diameter;
		Material = material;
		Thickness = thickness;
		this.purity = purity;
	}


	public int getDiameter() {
		return diameter;
	}


	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}


	public String getMaterial() {
		return Material;
	}


	public void setMaterial(String material) {
		Material = material;
	}


	public int getThickness() {
		return Thickness;
	}


	public void setThickness(int thickness) {
		Thickness = thickness;
	}


	public String getPurity() {
		return purity;
	}


	public void setPurity(String purity) {
		this.purity = purity;
	}


	@Override
	public String toString() {
		return "PIPE [diameter=" + diameter + ", Material=" + Material + ", Thickness=" + Thickness + ", purity="
				+ purity + "]";
	}


//	@Override
//	public int compareTo(PIPE o) {
//		System.out.println("comparing the diameter"+diameter +" to "+o.diameter);
//		return Integer.compare(diameter,o.diameter);
//	}
	
//	@Override
//	public int compareTo(PIPE o) {
//		System.out.println("comparing the purity"+purity +" to "+o.purity);
//		return purity.compareTo(o.purity);
//	}
	
	
	@Override
	public int compareTo(PIPE o) {
		System.out.println("comparing the purity"+purity +" to "+o.purity);
		return purity.compareTo(o.purity);
	}
	
}
