package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.ineuron.bo.CollegeData;

import in.ineuron.service.IService;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;




@SpringBootApplication
public class Springdatajpa3Application {

	public static void main(String[] args) {
		ApplicationContext factory=SpringApplication.run(Springdatajpa3Application.class, args);
		//Company3 comp1 =factory.getBean(Company3.class);
	   IService service=factory.getBean(IService.class);
	   System.out.print("hi");
	   CollegeData college=new CollegeData(null,"shyanal",34);
	   String hellos=service.SaveApp(college);
	   System.out.println(hellos);
	       

}
}