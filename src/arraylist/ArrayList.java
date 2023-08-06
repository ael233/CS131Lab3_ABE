package arraylist;

import java.util.Arrays;

public class ArrayList<T> {

	private final int DEFAULT_SIZE=10;
   	private int currentItem=0; //this is how many items are in the array
   	private T arList[];
   	
	
   	@SuppressWarnings("unchecked")
	public ArrayList()
	{   
   	/*
   	 * The code below will cause a compile error because T is cast to object
   	 * if we cast object to whatever T is (like a String) we will cause a runtime error.
   	 * We could use a java collection like ArrayList for this.     
   	 */
	// arList=new T[DEFAULT_SIZE];                                        				  	
			  
    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 

  @SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
    }//end preferred constructor
	
  	public boolean addItem(T item) {
	  if(currentItem < arList.length) {
		  arList[currentItem] = item;
		  currentItem++;
		  return true;
	  }else {
		  System.out.println("No slots remaining.");
		  return false;
	  }
  	}//end addItem

  		
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("ArrayList [currentItem=" + currentItem + ", arList=[");
		
		for (int i = 0; i < currentItem; i++) {
			str.append(arList[i]);
			if (i < currentItem - 1) {
				str.append(", ");
			}//this if statement adds a comma to add another item, if i is less than the total # of items
		}//end for loop
		str.append("]]"); // this closes out the array
		return str.toString(); //this returns a String
	}//end toString

  
}//end class
