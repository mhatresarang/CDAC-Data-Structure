
public class MyLinkedList {
    
	Kite Start, ptr, prev;
	
	void addAtEnd(Kite newkite) {
		if (Start == null) {
			Start = newkite;
			System.out.println("adding the first node");
					}
		else {
			ptr = Start;
			System.out.println("Adding internal nodes");
			while(ptr != null) {
				
				System.out.println("Searching....");
				prev = ptr;
				ptr= ptr.next;
			}
			prev.next=newkite  ;
			newkite.next= null;
			
		}
		
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	void addatFirst(Kite newKite) {
		
		if (Start!=null) {
			newKite.next=Start;
			Start = newKite;
			
		}
			else {
				Start=newKite;
				System.out.println("You  are the first kite..");
		}
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	void findaccordinglength(int lengthtofind) 
	{
		if (Start==null)
		{
		System.out.println("ntg to search List is Empty");					
		}
		
		else {
			boolean found = false;
			System.out.println("List is not empty ....Searching....");
			ptr = Start;// have to start from start to search
			while(ptr!=null)  // to check the ptr is not null till the end
			{
				if(ptr.length == lengthtofind) // to check the condition where given condition is matching
				{
					System.out.println("Kite found   "+ptr);
					found = true;
					break;
				}
				ptr= ptr.next;// tp carry forward the ptr for the loop 
				
			}
		}
		
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	void findaccordingowner(String Owner) 
	{
		if (Start==null)
		{
		System.out.println("ntg to search List is Empty");					
		}
		
		else {
			
			boolean found  = false;
			System.out.println("List is not empty ........Searching...............");
			
			ptr = Start ;
			while(ptr!=null) 
			{
				if( ptr.owner == Owner)
				{
					System.out.println("Found kite is   "+ptr);
					found = true;
							break;
				}
				ptr=ptr.next;
			}
		}
		
	}
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	void Showlist() {
		if(Start == null) {
			System.out.println("list is empty");
		}
		else {
			System.out.println("List is not empty");
			ptr = Start;
			while(ptr!= null) {
				System.out.println("DATA IS  :"  +ptr);
				ptr = ptr.next;
			}
		
		}
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	void ModifyByOwner (String Owner,String changeName) {
		if(Start==null) {
			System.out.println("ntg to print");
		}
		else {
			boolean found = false;
			ptr = Start;
			while (ptr!=null) {
				if(ptr.owner==Owner) {
					
					System.out.println("Kite found "+ptr);
					ptr.owner = changeName;
					System.out.println("============================================");
					System.out.println("kite found with changes   "+ptr);
					
					found = true;
					break;
				}
			}
		}
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	void RemoveNode(String Owner) {
		
		if (Start==null) {
			System.out.println("ntg to remove ");
			
		}
		
		else
		{
			
			boolean found = false;
			ptr = Start;
			
			while(ptr!=null) {
				
				if(ptr.owner==Owner) {
					if(ptr==Start) {
						Start = ptr.next ;
						found = true;
						break;
					}
					else {
					prev.next=ptr.next;
					found = true;
					break;
					}
				}
				prev = ptr;
				ptr = ptr.next;
			}
			
			
		}
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	void findaccordingocolor(String color) 
	{
		if (Start==null)
		{
		System.out.println("ntg to search List is Empty");					
		}
		
		else {
			
			boolean found  = false;
			System.out.println("List is not empty ........Searching...............");
			
			ptr = Start ;
			while(ptr!=null) 
			{
				if( ptr.color == color)
				{
					System.out.println("Found kite is   "+ptr);
					found = true;
							break;
				}
				ptr=ptr.next;
			}
		}
		
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
void InsertBeforeByOwner(String ownerToFind,Kite newKite) {
	boolean found = false;
	if(Start == null) {
		System.out.println("List is Empty cannot find the owner looking for");
	}else if(Start.owner.equals(ownerToFind)){
		System.out.println("Searching Owner is the first Owner so ... Newkite is the first kite to add");
		addatFirst(newKite);
		
	}
	else {
		ptr= Start;
		
		while (ptr!=null) {
			if(ptr.owner == ownerToFind) {
			found = true;
			break;
			}
			prev = ptr;
			ptr = ptr.next;
		}
		
		if(found= true) {
			prev.next = newKite;
			newKite.next = ptr;
			System.out.println("kite added in  before Given Owner");
			
		}
		else {
			System.out.println("Invalid Owner Input Please input valid Owner");
		}
			
		}
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

void InsertAfterByOwner(String ownerToFind,Kite newKite) {
	boolean found = false;
	if(Start == null) {
		System.out.println("List is Empty cannot find the owner looking for");
	}else if(Start.owner.equals(ownerToFind)){
		System.out.println("Searching Owner is the first Owner so ... Newkite is the first kite to add");
		addAtEnd(newKite);
		
	}
	else {
		ptr= Start;
		
		while (ptr!=null) {
			if(ptr.owner == ownerToFind) {
			found = true;
			break;
			}
			prev = ptr;
			ptr = ptr.next;
		}
		
		if(found= true) {
			ptr.next = newKite;
			ptr.next.next = prev;
			
					System.out.println("kite added in After Given Owner");
			
		}
		else {
			System.out.println("Invalid Owner Input Please input valid Owner");
		}
			
		}
	}
}




