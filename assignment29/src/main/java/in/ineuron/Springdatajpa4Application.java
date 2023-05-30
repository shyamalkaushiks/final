package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import in.ineuron.comp.Company3;
import in.ineuron.service.IService;
import in.ineuron.bo.CoronaVacine;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;




@SpringBootApplication
public class Springdatajpa4Application {

	public static void main(String[] args) {
		ApplicationContext factory=SpringApplication.run(Springdatajpa4Application.class, args);
		//Company3 comp1 =factory.getBean(Company3.class);
	   IService service=factory.getBean(IService.class);
	    // Iterable<CoronaVacine> sortedvalue=  service.fetchDetails(true, "name","price");
	     //sortedvalue.forEach(System.out::println);
	     
	      //  Iterable<CoronaVacine> data=service.fetchDetailsByPageNo(2, 3, false, "name","price");
	       // data.forEach(System.out::println);
	   
		/*  service.fetchDetailsByPageNo(2, 3, true, "price", "name") .forEach((vaccine)
				  -> System.out.println(vaccine.getName()+" "+vaccine.getPrice() + " " +
				  vaccine.getCountry()));  */
	   
	   service.fetchDetailsByPagination(3);
				 
	
	}

}
