package in.ineuron.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@EnableCircuitBreaker
public class MyApiController {
    private final RestTemplate restTemplate;

    @Autowired
    public MyApiController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "handleFallback")
    public String getRemoteData() {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://api.example.com/data", String.class);
        return responseEntity.getBody();
    }

    private String handleFallback() {
        // Fallback logic when the circuit is open or an exception occurs
        return "Fallback data";
    }
}


