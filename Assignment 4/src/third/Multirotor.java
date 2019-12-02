// -----------------------------------------------------
// Part: 2
// Written by: Berk BOZOK 40038674
// -----------------------------------------------------
package third;
import second.Helicopter;
import second.Quadcopter;
/**
 * 
 * @author Berk BOZOK 40038674
 *NumberOfRotors to show how many rotors does it have 
 *
 *
 */
public class Multirotor extends Helicopter {
	private int NumberOfRotors;


		//Parameterized Constructor
		/**
		 * 
		 * @param brand inherited from airplane
		 * @param price inherited from airplane
		 * @param HorsePower inherited from airplane
		 * @param NumberOfCylinders inherited from Helicopter
		 * @param CreationYear inherited from Helicopter
		 * @param PassengerCapacity inherited from Helicopter
		 * @param NumberOfRotors Multirotors own attributes to show number of Multirotors
		 * Multirotor has only 1 attribute he inherits the rest from parents
		 */
		public Multirotor(String brand,double price,int HorsePower,int NumberOfCylinders,int CreationYear,	 int PassengerCapacity,int NumberOfRotors)
		{
		  super(brand,price,HorsePower,NumberOfCylinders,CreationYear,PassengerCapacity);
		  this.NumberOfRotors = NumberOfRotors;
		  
		}
		
		//Copy Constructor
		/**
		 *  Creates an multirotor with the number of rotors speed as another multirotor
		 * @param m object to make a copy constructor
		 */
		public	Multirotor(Multirotor m) { 
			super(m);
			        System.out.println("Copy constructor called"); 
			        NumberOfRotors = m.NumberOfRotors; 
			      

			    } 
		
		//Default Constructor
		/**
		 * to create a multirotor with number of rotors
		 */
		public Multirotor()
		{
		  super();
		  this.NumberOfRotors=0;
		
		}
		//Getters and Setters 
		/**
		 * 
		 * @return number of Rotors
		 */
		public int getNumberOfRotors() {
			return NumberOfRotors;
		}
		/**
		 * 
		 * @param numberOfRotors sets the number of Rotors
		 */
		public void setNumberOfRotors(int numberOfRotors) {
			this.NumberOfRotors = numberOfRotors;
		}
		
		@Override
		/**
		 * display the information of its own attribute and inherited attributes
		 * since all of the above classes became private, we need to use get method to print out our toString method
		 */
		public String toString() {
			return "This Multirotor is manifactured by " + getBrand() + ", it costs " + getPrice() + "$, has HorsePower=" + getHorsePower() + " ,has "+getNumberOfCylinders()+" clinders"+ ", created in "+getCreationYear()+", has "+getPassengerCapacity()+" passender capacity"+" ,and  has "+NumberOfRotors+" rotors";
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
					
					Multirotor m=(Multirotor)obj;
					
					//Airplane Attributes
					/**
					 * All above classes are private now and in order to execute  equals method we need to use get method to do our if statements
					 */
					if (!getBrand().equals(m.getBrand())) {
						
						return false;
					}
					
					if(getPrice()!=m.getPrice()) {
						
						return false;
					}
					
					
					if(getHorsePower()!=m.getHorsePower()) {
						return false;
					}
					
					//Helicopter Attributes
					if(getNumberOfCylinders()!=m.getNumberOfCylinders()) {
						return false;
					}
					
					if(getCreationYear()!=m.getCreationYear()) {
						return false;
					}
					if(getPassengerCapacity()!=m.getPassengerCapacity()) {
						return false;
					}
					
					//Multirotor Attributes
					if(NumberOfRotors!=m.NumberOfRotors) {
						return false;
					}
					
					
					return true;
					
				}
}
