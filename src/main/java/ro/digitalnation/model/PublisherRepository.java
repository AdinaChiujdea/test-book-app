package ro.digitalnation.model;

import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
    Publisher findAllById(Long id);
    void delete(Long id);
}
