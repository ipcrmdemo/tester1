package tester1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@Autowired
@RestController
class Tester1Controller {

    @GetMapping("/hello/{name}")
    public String person(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/")
    public String root() {
        return "Hello, world! Add /hello/there to the URL to get a friendly reply.";
    }

}
