package ro.digitalnation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ro.digitalnation.model.Publisher;
import ro.digitalnation.model.PublisherRepository;

import java.util.List;

@Controller
public class PublisherController {
    @Autowired
    private PublisherRepository publisherRepo;

    @GetMapping("/publishers")
    List<Publisher> getAllPublishers() {
        return (List<Publisher>) publisherRepo.findAll();
    }
}
