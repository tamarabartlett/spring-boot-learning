package blah;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BlahController {

    @RequestMapping("/")
    public String index() {
        return "Blah from Spring Boot!";
    }

}