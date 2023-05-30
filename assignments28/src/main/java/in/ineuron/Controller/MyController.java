package in.ineuron.Controller;







import java.util.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

   @Value("${myapp.setting1}")
   private String setting1;

   @GetMapping("/setting1")
   public String getSetting1() {
      return setting1;
   }
}