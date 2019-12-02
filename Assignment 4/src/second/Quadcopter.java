// -----------------------------------------------------
// Part: 2
// Written by: Berk BOZOK 40038674
// -----------------------------------------------------
package second;
import first.Airplane;
/**
 * 
 * @author Berk BOZOK 40038674
 *maxFlySpeed to show how fast it can fly
 */
public class Quadcopter extends Helicopter {
	private int MaxFlySpeed;
	
	//Parameterized Constructor
	/**
	 * 
	 * @param brand inherited from airplane
	 * @param price inherited from airplane
	 * @param HorsePower inherited from airplane
	 * @param NumberOfCylinders inherited from Helicopter
	 * @param CreationYear inherited from Helicopter
	 * @param PassengerCapacity inherited from Helicopter
	 * @param MaxFlySpeed it is Quadcopters own attribute
	 * Except MaxFlySpeed the rest is inherited from Airplane and Helicopter but Quadcopter only exteds Helicopter ,on the other hand Helicopter extands Airplane
	 */
	public Quadcopter(String brand,double price,int HorsePower,int NumberOfCylinders,int CreationYear,	 int PassengerCapacity,int MaxFlySpeed)
	{
	  super(brand,price,HorsePower,NumberOfCylinders,CreationYear,PassengerCapacity);
	  
	  this.MaxFlySpeed = MaxFlySpeed;
	  
	}
	
	
	
	//Copy Constructor
	/**
	 * Creates an quadcopter with the same max fly speed as another helicopter
	 * @param q objecct to create our copy constructor
	 */
	public	Quadcopter(Quadcopter q) { 
		super(q);
		        System.out.println("Copy constructor called"); 
		        MaxFlySpeed = q.MaxFlySpeed; 
		      

		    } 
	//Default Constructor
	/**
	 * to create a quadcopter with no max fly speed
	 */
	public Quadcopter()
	{
	  super();
	  this.MaxFlySpeed=0;
	  
	}


	//Getters and Setters
	/**
	 * 
	 * @return our maximum fly speed 
	 */
	public int getMaxFlySpeed() {
		return MaxFlySpeed;
	}


	/**
	 * 
	 * @param maxFlySpeed sets the "MaxFlySpeed"
	 */
	public void setMaxFlySpeed(int maxFlySpeed) {
		this.MaxFlySpeed = maxFlySpeed;
	}
	
	
	//toString 
	@Override
	/**
	 * to display of its information and inherited information
	 * since the above classes became private we need to use respected get method to print out our toString method
	 */
	public String toString() {
		return "This Quadcopter is manifactured by " + getBrand() + ", it costs " + getPrice() + "$, has HorsePower=" + getHorsePower() + " ,has "+getNumberOfCylinders()+" clinders"+ ", created in "+getCreationYear()+", has "+getPassengerCapacity()+" passender capacity ,and its maximum fly speed is "+MaxFlySpeed;
	}
	
	//equals Method
	/**
	 * compares two object and returns true or false if they are the same or not
	 */
			public boolean equals(Object obj) {
				if (obj == null) {
					return false;
				}
				
				if (getClass() != obj.getClass())
					return false;
				
				Quadcopter q=(Quadcopter)obj;
				
				//Airplane Attributes
				/**
				 * since above classes became private we need to use respected get method to continue our equals method
				 */
				if (!getBrand().equals(q.getBrand())) {
					
					return false;
				}
				
				if(getPrice()!=q.getPrice()) {
					
					return false;
				}
				
				
				if(getHorsePower()!=q.getHorsePower()) {
					return false;
				}
				
				//Helicopter Attributes
				if(getNumberOfCylinders()!=q.getNumberOfCylinders()) {
					return false;
				}
				
				if(getCreationYear()!=q.getCreationYear()) {
					return false;
				}
				if(getPassengerCapacity()!=q.getPassengerCapacity()) {
					return false;
				}
				if(MaxFlySpeed!=q.MaxFlySpeed) {
					return false;
				}
				
				
				return true;
				
			}




	
 
}
