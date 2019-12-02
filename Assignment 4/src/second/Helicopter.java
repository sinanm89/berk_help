// -----------------------------------------------------
// Part: 2
// Written by: Berk BOZOK 40038674
// -----------------------------------------------------
package second;
import first.Airplane;
/**
 * 
 * @author Berk BOZOK 40038674
 * numberOfCylinders to show how much cylinders does it have
 * creationYear to show when its made
 * PassengerCapacity to show how much person it can carry
 * 
 * 
 *
 */

public class Helicopter extends Airplane {
	private int NumberOfCylinders;
	private int CreationYear;
	private int PassengerCapacity;
	 
	 
		//Parameterized Constructor
		/**
		 * 
		 * @param brand inherited from airplane
		 * @param price inherited from airplane
		 * @param HorsePower inherited from airplane
		 * @param NumberOfCylinders helicopter's original attribute to show number of cylinders 
		 * @param CreationYear helicopter's original attribute to show when it was created
		 * @param PassengerCapacity helicopter's original attribute to show how many people can ride it
		 * Helicopter has 3 attributes and it inherits the rest from Airplane(father)
		 */
		public Helicopter(String brand,double price,int HorsePower,int NumberOfCylinders,int CreationYear,int PassengerCapacity)
		{
		  super(brand,price,HorsePower);
		  this.NumberOfCylinders = NumberOfCylinders;
		  this.CreationYear = CreationYear;
		  this.PassengerCapacity = PassengerCapacity;
		  
		}
		
		//Copy Constructor
		/**
		 * Creates an helicopter with the same cylinder, year and capacity as another helicopter
		 * @param h object to create our copy constructor
		 * 
		 */
		public Helicopter(Helicopter h) { 
			super(h);
	        System.out.println("Copy constructor called"); 
	        NumberOfCylinders = h.NumberOfCylinders; 
	        CreationYear = h.CreationYear; 
	        PassengerCapacity = h.PassengerCapacity;

	    } 
		

		//Default Constructor
		/**
		 * to create a Helicopter with no cylinder,no creation year and no capacity
		 */
		public Helicopter()
		{
		  super();
		  this.NumberOfCylinders=0;
		  this.CreationYear=0;
		  this.PassengerCapacity=0;
		}
		
		//Getters and Setters
		/**
		 * 
		 * @return gets our number of cylinders
		 */
		public int getNumberOfCylinders() {
			return NumberOfCylinders;
		}
		/**
		 * 
		 * @param numberOfCylinders returns our "NumberOfCylinders"
		 */
		public void setNumberOfCylinders(int numberOfCylinders) {
			this.NumberOfCylinders = numberOfCylinders;
		}
		/**
		 * 
		 * @return the year when it was created 
		 */
		public int getCreationYear() {
			return CreationYear;
		}
		
		/**
		 * 
		 * @param creationYear sets the year when it was created 
		 */
		public void setCreationYear(int creationYear) {
			this.CreationYear = creationYear;
		}
		/**
		 * 
		 * @return the number of people who can ride it
		 */
		public int getPassengerCapacity() {
			return PassengerCapacity;
		}
		/**
		 * 
		 * @param passengerCapacity sets the number of people who can ride it
		 */
		public void setPassengerCapacity(int passengerCapacity) {
			this.PassengerCapacity = passengerCapacity;
		}

		@Override
		/**
		 * to show the inherited attributes and helicopter's own attribute printed out
		 * since airplane attributes became private we need to use get method to print out
		 */
		public String toString() {
			return "This Helicopter is manifactured by " + getBrand() + ", it costs " +getPrice() + "$, has HorsePower=" + getHorsePower() + " ,has "+NumberOfCylinders+" clinders"+ ", created in "+CreationYear+" ,and has "+PassengerCapacity+" passender capacity.";
		}
		
		
		
		
		
		
		//equals Method
		/**
		 * to check if we have the object and compare it with the given object
		 */
		public boolean equals(Object obj) {
			if (obj == null) {
				return false;
			}
			/**
			 * since Airplane attributes now private we need to use get method to continue our equals method
			 */
			if (getClass() != obj.getClass())
				return false;
			
			Helicopter h=(Helicopter)obj;
			
			//Airplane Attributes
			if (!getBrand().equals(h.getBrand())) {
				
				return false;
			}
			
			if(getPrice()!=h.getPrice()) {
				
				return false;
			}
			
			
			if(getHorsePower()!=h.getHorsePower()) {
				return false;
			}
			
			//Helicopter Attributes
			if(NumberOfCylinders!=h.NumberOfCylinders) {
				return false;
			}
			
			if(CreationYear!=h.CreationYear) {
				return false;
			}
			if(PassengerCapacity!=h.PassengerCapacity) {
				return false;
			}
			
			
			return true;
			
		}
}
