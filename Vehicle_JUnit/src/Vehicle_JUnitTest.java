import static org.junit.Assert.*;

import org.junit.Test;

import MainPackage.Car;
import MainPackage.Motorcycle;
import MainPackage.Person;
import MainPackage.Truck;



public class Vehicle_JUnitTest {

	@Test
	public void JUnit_Tst() {
		Person a = new Person();
		
   	 a.setFirstName("Jean-Claude");
   	 a.setLastName("Van-Damme");

   	 Car new_car= new Car();
   	 new_car.setOwner(a);
   	 new_car.setNumberOfDoors(4);
  	assertEquals("First name of the Person a","Jean-Claude",a.getFirstName());

  	
   	 Truck new_truck= new Truck();
   	 new_truck.setOwner(a);
   	 new_truck.setNumberOfAxels(2);
  	assertEquals("The new truck owned by person a","Jean-Claude",new_truck.getOwner().getFirstName());


   	 Person b= new Person();
   	 b.setFirstName("Robert");
   	 b.setLastName("Lewandowski");
   	 new_truck.setOwner(b);
   	assertEquals("The new truck owned by person b","Robert",new_truck.getOwner().getFirstName());


   	 
   	 
   	 Motorcycle new_motorcycle= new Motorcycle();
   	 new_motorcycle.setHasSideCar(false);
   
   	 
  	assertEquals("The car owned by person a has 4 doors",4,new_car.getNumberOfDoors());
  	assertEquals("The truck owned by person a has 2 axels",2,new_truck.getNumberOfAxels());

 	assertEquals("Motorcycle with a sidecar",false,new_motorcycle.isHasSideCar());

	}

}