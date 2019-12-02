// -----------------------------------------------------
// Assignment 4
// Question: Part 2
// Written by: Berk BOZOK 40038674
// -----------------------------------------------------
import java.util.LinkedList;
import java.util.Scanner;


public class CellPhone {
	long serialNumber;
	String brand;
	int year;
	double price;
	LinkedList<CellPhone> data = new LinkedList<CellPhone>();
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CellPhone other = (CellPhone) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "This CellPhone's serialNumber is " + serialNumber + ", brand is " + brand + ", created in " + year + ", costs "+price ;
	}

	public CellPhone(long serialNumber,String brand,int year,double price ) {
		this.serialNumber=serialNumber;
		this.brand=brand;
		this.year=year;
		this.price=year;
	}
	CellPhone(CellPhone cell,long serialNumber) { 
        System.out.println("Copy constructor called"); 
   
       brand=cell.brand;
       year=cell.year;
       price=cell.price;
       
    } 
	public long getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public CellPhone clone() {
		
	    System.out.print("Enter an integer: ");
	    Scanner input = new Scanner(System.in);
        long serial_number = input.nextInt();
		

		CellPhone mycellp = new CellPhone(serial_number, null, 0 ,0);
		return mycellp;
//		return object
	}
	

}

