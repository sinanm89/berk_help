// -----------------------------------------------------
// Part: 2
// Written by: Berk BOZOK 40038674
// -----------------------------------------------------
package first;


import driver.FlyingObject;

//We are trying to create our Father Airplane class
/**
 * 
 * @author Berk BOZOK 40038674
 * brand attribute to show company
 * price to show how much does it cost
 * horsepower to show engine power 
 * we are making it all protected to get full advantage of access rights
 *
 */
public class Airplane extends FlyingObject {
	private String brand;
	private double price;
	private int HorsePower;
	
	
	//Parametrized Constructor
	/**
	 *  Creates an airplane with specified brand, price and horse power
	 * @param brand to show which company did it
	 * @param price to show how much does it costs
	 * @param HorsePower to show engine's cycle power
	 */
	public Airplane(String brand,double price,int HorsePower)
	{
	  this.brand = brand;
	  this.price = price;
	  this.HorsePower = HorsePower;
	}
	
	//Copy Constructor
	/**
	 * Creates an airplane with the same brand, price and horse power as another helicopter
	 * @param a object to create our copy constructor
	 */
//	breaks here
	public Airplane(Airplane a) { 
        System.out.println("Copy constructor called"); 
        brand = a.brand; 
        price = a.price; 
  	  	HorsePower = a.HorsePower;

    } 

	//Default Constructor
	/**
	 * to create a Airplane with no brand,no price year and no horse power
	 */
	public Airplane()
	{
	  this.brand="";
	  this.price=0;
	  this.HorsePower=0;
	}
	
	//Getters and Setters
	/**
	 * 
	 * @return our brand name
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * 
	 * @param brand set our brand name
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * 
	 * @return our price value
	 * In part 1 we made this public to get our price to find cheapest and second cheapest in driver but since we need
	 * to be really restrictive about our access right we need to unfortunately keep it as public to compare the prices
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * 
	 * @param price set our price value
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * 
	 * @return the horse power of the plane
	 */
	public int getHorsePower() {
		return HorsePower;
	}
	/**
	 * 
	 * @param horsePower to set it to "HorsePower"
	 */
	public void setHorsePower(int horsePower) {
		this.HorsePower = horsePower;
	}

	//toString method
	@Override
	/**
	 * toString method to display given attitudes properly
	 */
	public String toString() {
		return "This Airplane is manifactured by " + brand + " , it costs " + price + "$, and has HorsePower=" + HorsePower + ".";
	}

	
	//equals method
	@Override
	/**
	 * to check if we have the object and compare obj with our new object
	 * this equals method will find for us that if our objects the same or not
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		//Casting
		Airplane other = (Airplane) obj;
		if (HorsePower != other.HorsePower)
			return false;
		
		if (brand == null) {
			if (other.brand != null)
				return false;
			
		} else if (!brand.equals(other.brand))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	
	


}
