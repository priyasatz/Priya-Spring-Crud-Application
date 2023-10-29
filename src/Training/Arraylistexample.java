package Training;

import java.util.ArrayList;

public class Arraylistexample {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.add("Cadillac");
	    cars.set(1, "Mercedes");
	    System.out.println(cars.get(1));
	    System.out.println(cars);
	    
	}

}
