package in.ineuron.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UsersData {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;

	    // Other user properties

	    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	    private List<Ordersdata> orders;

}
