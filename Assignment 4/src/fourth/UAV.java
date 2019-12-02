// -----------------------------------------------------
// Part: 2
// Written by: Berk BOZOK 40038674
// -----------------------------------------------------
package fourth;

import driver.FlyingObject;
import third.Multirotor;
/**
 * 
 * @author Berk BOZOK 40038674
 *weight to show how heavy it is
 *price to show how much does it costs
 */
public class UAV extends FlyingObject {
	private double weight;
	private double price;
	
	
	
		//Parameterized Constructor
		/**
		 * 
		 * @param weight its own attribute
		 * @param price its own attribute
		 * Since this is the father class he won't be inheriting from others
		 */
		public UAV(double weight,double price)
		{
		  
		  this.weight = weight;
		  this.price  =price;
		  
		}
		
		
		//Copy Constructor
		/**
		 * Creates an UAV with weight and price as another UAV
		 * @param m object to make copy constructor
		 */
		public UAV(UAV m) { 
	        System.out.println("Copy constructor called"); 
	        weight = m.weight; 
	        price  = m.price;

	    } 
		
		//Default Constructor
		/**
		 * to create a UAV with weight and price of UAV
		 */
		public UAV()
		{
			
		  this.weight=0;
		  this.price =0;
		  
		}

		//Getters and Setters
		/**
		 * 
		 * @return the weight of UAV 
		 */
		public double getWeight() {
			return weight;
		}

		/**
		 * 
		 * @param weight sets the weight
		 */
		public void setWeight(double weight) {
			this.weight = weight;
		}

		/**
		 * 
		 * @return the price of UAV
		 * we made it public to see its price when we need to compare
		 */
		public double getPrice() {
			return price;
		}

		/**
		 * 
		 * @param price sets the price
		 */
		public void setPrice(double price) {
			this.price = price;
		}


		
		//toString Method
		@Override
		/**
		 * displays the information of its own
		 */
		public String toString() {
			return "This UAV weights " + weight + " kg, and costs " + price + "$";
		}


		//Equals Method
		@Override
		/**
		 * compares the two objects with each other and returns true of false
		 */
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			UAV other = (UAV) obj;
			if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
				return false;
			if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
				return false;
			return true;
		}
		
		
		
}
