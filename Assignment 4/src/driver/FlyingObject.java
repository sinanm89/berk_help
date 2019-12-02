// -----------------------------------------------------
// Part: 2
// Written by: Berk BOZOK 40038674
// -----------------------------------------------------
package driver;
/**
 * 
 * @author Berk BOZOK 40038674
 * just to create a flying objects in our driver class
 *
 */

public abstract class FlyingObject {
	public FlyingObject()
	{
		
	}
	
	public FlyingObject(FlyingObject fo)
	{
		System.out.println("\nCreating a flying object using copy constructor ....");
	}
	public abstract double getPrice();
	
    public FlyingObject deepCopy() {                        
        return new FlyingObject(this);
    }
}
