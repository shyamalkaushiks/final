package in.ineuron.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.entity.Ordersdata;
import in.ineuron.repository.OrderRepository;
@Service
public class MyService {

    public void operation1(String param) {
        // Perform operation 1
        System.out.println("Operation 1 called with parameter: " + param);
    }

    public int operation2(int param1, int param2) {
        // Perform operation 2
        int result = param1 + param2;
        System.out.println("Operation 2 called with parameters: " + param1 + ", " + param2 + ". Result: " + result);
        return result;
    }
}
