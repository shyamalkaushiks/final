package in.ineuron.comp;

import org.springframework.stereotype.Component;


@Component("Comp3")

public class Company3 {

	static {
		System.out.println("Company1.class file is loading...");
	}

	public Company3() {
		System.out.println("Company1:: Zero param constructor...");
	}
	
	

	
	
	
}
