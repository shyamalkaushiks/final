package in.ineuron.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.entity.Ordersdata;
import in.ineuron.repository.OrderRepository;
@Service
public class Iserviceimpl implements Iservice {

	@Autowired
	private OrderRepository service;
	@Override
	public List<Ordersdata> getOrdersByUserId(Long userId) {
		// TODO Auto-generated method stub
		return service.findByUserId(userId);
		
	}

}
