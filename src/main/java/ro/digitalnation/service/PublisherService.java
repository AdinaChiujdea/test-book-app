package ro.digitalnation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.digitalnation.model.Publisher;
import ro.digitalnation.model.PublisherRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PublisherService {

    @Autowired
    private PublisherRepository publisherRepo;

    public List<Publisher> getAllPublishers() {
        List<Publisher> list = new ArrayList<>();
        for (Publisher publisher : publisherRepo.findAll()) {
            list.add(publisher);
        }
        return list;
    }
    public Publisher getPublisher(Long id){
       return  publisherRepo.findAllById(id);
    }
    public void addPublisher(Publisher publisher){
        publisherRepo.save(publisher);
    }

    public void upgradePublisher(Long id, Publisher publisher){
        publisherRepo.save(publisher);
    }

    public void deletePublisher(Long id){
        publisherRepo.delete(id);
    }
}
