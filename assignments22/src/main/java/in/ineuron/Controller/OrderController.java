package in.ineuron.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.Service.Iservice;
import in.ineuron.entity.Ordersdata;

import java.util.*;

@RestController
@RequestMapping("/users/{userId}/orders")
public class OrderController {
    @Autowired
    private Iservice service;


    

    @GetMapping
    public List<Ordersdata> getOrdersByUserId(@PathVariable Long userId) {
        return service.getOrdersByUserId(userId);
    }
}