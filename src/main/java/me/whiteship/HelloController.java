package me.whiteship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    /**
     * /hello/1?name=keesun&age=25
     * @param id
     * @param name
     * @return
     */
    @GetMapping("/hello/{id}")
    @ResponseBody
    public String hello(@PathVariable int id, @RequestParam String name) {
        return "Hello, " + helloService.getName();
    }

    @GetMapping("/sample")
    public void sample() {
    }
}
