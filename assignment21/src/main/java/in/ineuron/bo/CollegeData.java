package in.ineuron.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
@Entity
@Data
@AllArgsConstructor
public class CollegeData {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long regNo;
	private String name;
	private Integer price;
	
	
	

	
}
