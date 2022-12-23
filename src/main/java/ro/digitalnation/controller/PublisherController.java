package ro.digitalnation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.digitalnation.model.Publisher;
import ro.digitalnation.service.PublisherService;

import java.util.List;


@RestController
public class PublisherController {
    @Autowired
    private PublisherService publisherService;

    @GetMapping("/publishers")
     public List<Publisher> getAllPublishers() {
        return  publisherService.getAllPublishers();
    }
    @RequestMapping("/publishers/{id}")
    public Publisher getPublisher(@PathVariable Long id){
        return  publisherService.getPublisher(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/publishers")
    public void addPublisher(@RequestBody Publisher publisher){
       publisherService.addPublisher(publisher);
    }
}
