package in.ineuron.Service;
import java.util.List;

import in.ineuron.entity.Ordersdata;
public interface Iservice {
	public List<Ordersdata> getOrdersByUserId(Long userId);
}
