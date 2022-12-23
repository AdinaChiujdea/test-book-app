package ro.digitalnation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoController {
    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello World!";
    }
}
