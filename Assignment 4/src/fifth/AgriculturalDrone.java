// -----------------------------------------------------
// Part: 2
// Written by: Berk BOZOK 40038674
// -----------------------------------------------------
package fifth;
import first.Airplane;
import fourth.UAV;
import second.Helicopter;
/**
 * 
 * @author Berk BOZOK 40038674
 * brand attribute to show company
 * carrycapacity to show how much it can carry
 *
 */
public class AgriculturalDrone extends UAV {
	private String Brand;
	private int CarryCapacity;

	
	

	//Parameterized Constructor
	/**
	 * 
	 * @param weight inherited from UAV
	 * @param price	inherited from UAV
	 * @param Brand its own attribute to show which company mande it
	 * @param CarryCapacity its own attribute to show capacity of how much it can carry
	 * this drone only inherited 2 attributes from the father and has its 2 own attribute
	 */
	public AgriculturalDrone(double weight,double price,String Brand,int CarryCapacity)
	{
	  super(weight,price);
	  this.Brand = Brand;
	  this.CarryCapacity = CarryCapacity;

	}
	
	//Copy Constructor
	/**
	 * Creates an agricultural drone with the same brand,and carry capacity as another agricultural drone
	 * @param ad object to make our copy constructor
	 */
	public AgriculturalDrone(AgriculturalDrone ad) { 
		super(ad);
		        System.out.println("Copy constructor called"); 
		        Brand = ad.Brand; 
		        CarryCapacity = ad.CarryCapacity; 
		     

		    } 
	

	//Default Constructor
	/**
	 * to create a agricultural drone with no brand,no carry capacity
	 */
	public AgriculturalDrone()
	{
	  super();
	  this.Brand=null;
	  this.CarryCapacity =0;
	  
	}
	//Getters and Setters 
	/**
	 * 
	 * @return the brand of the drone
	 */
	protected String getBrand() {
		return Brand;
	}
	/**
	 * 
	 * @param brand sets the brand
	 */
	protected void setBrand(String brand) {
		this.Brand = brand;
	}
	/**
	 * 
	 * @return the carry capacity of Drone
	 */
	protected int getCarryCapacity() {
		return CarryCapacity;
	}
	/**
	 * 
	 * @param carryCapacity sets "CarryCapacity"
	 */
	protected void setCarryCapacity(int carryCapacity) {
		this.CarryCapacity = carryCapacity;
	}
	

	
	//toString Method
	@Override
	/**
	 * to display the information of its own and inherited attributes
	 * 
	 * since UAV attributes became private we need to use get method to print toString method
	 */
	public String toString() {
		return "This Agricultural Drone weights " + getWeight() + " kg, and costs " + getPrice() + "$"+", the brand is "+Brand+", has  "+CarryCapacity+" carry capacity";
	}
	

	//equals Method
	/**
	 * compares the two object with each other and returns true or false
	 */
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		if (getClass() != obj.getClass())
			return false;
		
		AgriculturalDrone ag=(AgriculturalDrone)obj;
		
		//UAV Attributes
		/**
		 * since UAV attributes are private, we need get method to finish out equals method
		 */
		if (getWeight()!=ag.getWeight()) {
			
			return false;
		}
		
		if(getPrice()!=ag.getPrice()) {
			
			return false;
		}
		
		
		
		//AgriculturalDrone Attributes
		if(!Brand.equals(ag.Brand)) {
			return false;
		}
		
		if(CarryCapacity!=ag.CarryCapacity) {
			return false;
		}
		
		
		
		return true;
		
	}

}
