package ro.digitalnation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.digitalnation.model.Publisher;
import ro.digitalnation.model.PublisherRepository;
import ro.digitalnation.service.PublisherService;

import java.util.List;


@RestController
public class PublisherController {
    @Autowired
    private PublisherService publisherService;

    @GetMapping("/publishers")
    List<Publisher> getAllPublishers() {
        return  publisherService.getAllPublishers();
    }
}
