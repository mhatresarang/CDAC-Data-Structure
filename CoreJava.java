
public class CoreJava {
	
// class	
class pipe{
	
}


//Class inheritance
class Steelpipe extends pipe{
	diameterBased pipe1 = new diameterBased();  // has a relationship
	MaterialBased pipe2 = new MaterialBased();	// has a relationship
}


// for has a relationship
class diameterBased{
	
	int diameter ;
	int length;
	//////////////////////////////////////////////////////////////////////////////
	
	
}

class MaterialBased{
	
	
	String Material;
}

class diameter extends diameterBased{
	// cannot with final class
}
// interface no implementation
interface PlantRequirement{
	void pipeRequirement();
	void staticEquipmemt();
	void refrigerationAndBoilers();
	void DistillationColoumn();
	
}

//implementation of interface with all methods 
class Plant implements PlantRequirement{

	@Override
	public void pipeRequirement() {
		
		diameterBased d1 = new diameterBased();
		MaterialBased m1 = new MaterialBased();
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void staticEquipmemt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void refrigerationAndBoilers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DistillationColoumn() {
		// TODO Auto-generated method stub
		
	}
	
}


}
