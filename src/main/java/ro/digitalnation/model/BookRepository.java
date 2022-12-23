package ro.digitalnation.model;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
    Book findAllById(Long id);

    void delete(Long id);
}
