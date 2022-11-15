public class doublelinklist{

	
	MySongs start=null;
	MySongs ptr,temp,prev;
	
void add(MySongs newsong) {
	
	
	
	
	if(start==null)
	{
		start = newsong;
		start.prev=null;
		start.next = null;
		System.out.println("Added the first Song");
		
	}
	else if(start.next == null) {
		
		start.next = newsong;
		newsong.next = null;
		newsong.prev = start;
		
		System.out.println("Added the second  Song");
		}
	else {
		
		ptr = start.next; 
		if(ptr.next!=null) {
			ptr = ptr.next;
		}
		ptr.next= newsong;
		newsong.prev= ptr;
		newsong.next= null;
		
	}
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
void show() {
	
    if(start==null) {
    	System.out.println("jukebox is empty");
    }
    else {
    	
	ptr = start;
	
	while(ptr!=null) {
		System.out.println("printing the data "+ ptr);
		ptr = ptr.next;
		
	}
}
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

void delete (String name ) {
	
	
	if(start== null) {
		System.out.println("string is empty ntg to delete ");
	}
	else
	{
		
		boolean found = false;
		ptr = start;
		
		while(ptr!=null) {
			
			if(ptr.Movie==name) {
				if(ptr==start) {
					start = ptr.next ;
					start.prev = null;
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
///////////////////////////////////////////////////////////////////////////////////////////////////////////////

void Insert(String name,MySongs S5) 
{
	boolean found = false;
	ptr = start;
 if(start == null) 
 {
	 start = S5;
	 start.prev= null;
	 start.next = null;
 }
 else {
	 ptr=start;
	 
 while(ptr!=null) {
	 if(ptr.Title == name) {
		 
		 S5.next=ptr.next;
		 S5.prev=ptr;
		 ptr.next.prev=S5;
		 ptr.next=S5;
		 System.out.println("Added");
 
	
	 }
	 ptr=ptr.next;
 }
 }
 
// else
//	 System.out.println("given title sing name not found");}
// 
 {
	 
	    ptr=ptr.next;
 }
}
}


