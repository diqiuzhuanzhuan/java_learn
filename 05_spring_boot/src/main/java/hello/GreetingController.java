package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping(path="/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "地球")String name,
                             @RequestParam(value = "value", defaultValue = "你好!")String value) {

        return new Greeting(name, value);
    }
}
