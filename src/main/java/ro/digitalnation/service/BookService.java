package ro.digitalnation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.digitalnation.model.Book;
import ro.digitalnation.model.BookRepository;
import ro.digitalnation.model.Publisher;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepo;
    public List<Book> getAllBooks() {
        List<Book> list = new ArrayList<>();
        for (Book book : bookRepo.findAll()) {
            list.add(book);
        }
        return list;
    }
    public Book getBook(Long id){
        return  bookRepo.findAllById(id);
    }

    public void addBook(Book book){
        bookRepo.save(book);
    }

    public void upgradeBook(Long id, Book book){
        bookRepo.save(book);
    }

    public void deleteBook(Long id){
        bookRepo.delete(id);
    }
}
