package in.ineuron.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class MyApiClient {
    private final MyApiClient myApiClient;

    @Autowired
    public MyApiClient(MyApiClient myApiClient) {
        this.myApiClient = myApiClient;
    }

    @GetMapping("/data")
    public String getData() {
        return myApiClient.getRemoteData();
    }

	
}
