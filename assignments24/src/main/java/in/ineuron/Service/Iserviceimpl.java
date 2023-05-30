package in.ineuron.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.entity.Ordersdata;
import in.ineuron.repository.OrderRepository;
@Service
public class Iserviceimpl implements Iservice {

	@Autowired
	private OrderRepository repo;
	@Override
	public String savedata(Ordersdata order) {
		// TODO Auto-generated method stub
		Ordersdata data=repo.save(order);
		return "value is asaved"+data.getId();
		
	}

	

}
