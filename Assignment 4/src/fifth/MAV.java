// -----------------------------------------------------
// Part: 2
// Written by: Berk BOZOK 40038674
// -----------------------------------------------------
package fifth;
import fourth.UAV;
/**
 * 
 * @author Berk BOZOK 40038674
 * type to show what type it is
 * size to show how big it is
 *
 */
public class MAV extends UAV {
	protected String type;
	protected double size;
	
	

	//Parametrized Constructor
	/**
	 * 
	 * @param weight inherited from UAV
	 * @param price inherited from UAV
	 * @param type its own attribute to show type of the MAV
	 * @param size its own attribute to show size of the MAV
	 * MAV only has 2 attributes by its own and it inherits the 2 from UAV(father)
	 */
	public MAV(double weight,double price,String type,double size)
	{
	  super(weight,price);
	  this.type = type;
	  this.size = size;
	
	}
	
	
	
	//Copy Constructor
	/**
	 * Creates a MAV with the same type, and size as another helicopter
	 * @param ma object to create our copy constructor
	 */
	public	MAV(MAV ma) { 
			        System.out.println("Copy constructor called"); 
			        type = ma.type; 
			        size = ma.size; 
			     

			    }
	//Default Constructor
	/**
	 * to create a MAV with no type, and no size
	 */
		public MAV()
		{
		  super();
		  this.type=null;
		  this.size =0;
		  
		}

	//Getters and Setters 
	/**
	 * 
	 * @return the type of MAV
	 */
	public String getType() {
		return type;
	}


	/**
	 * 
	 * @param type sets the type 
	 */
	public void setType(String type) {
		this.type = type;
	}


	/**
	 * 
	 * @return the size of MAV
	 */
	public double getSize() {
		return size;
	}


	/**
	 * 
	 * @param size sets the size of MAV
	 */
	public void setSize(double size) {
		this.size = size;
	} 

	//toString Method
	@Override
	/**
	 * to display its own information and inherited attributes
	 * since all above classes are private now, we need to use get method
	 */
	public String toString() {
		return "This MAV weights " + getWeight() + " kg, and costs " + getPrice() + "$"+", type is "+type+" ,size is "+size;
	}
	
	
	
	
	
	
	
	//equals method
	/**
	 * to compare two object with each other and return true or false 
	 */
	public boolean equals(Object obj) {
		//Testing if my object is me?
		if(this==obj) {
			return true;
		}
		//Testing if it exist?
		if(obj==null) {
			return false;
		}
		//Testing Are we are talking about same class?
		if (getClass() != obj.getClass()) {
			return false;
		}
		//Casting
		MAV mav	=(MAV)obj;
		
		//UAV attributes
		/**
		 * in our to execute equals method correctly we need to use set method since UAV has private attributes
		 */
		if(getWeight()!=mav.getWeight()) {
			
			return false;
		}
		if(getPrice()!=mav.getPrice()) {
			
			return false;
		}
		
		
		//MAV attributes
		if(type.equals(mav.type)) {
			return false;
		}
		if(size!=mav.size) {
			
			return false;
		}
		
		
		
		
		
		
		return true;
	}
	
}
