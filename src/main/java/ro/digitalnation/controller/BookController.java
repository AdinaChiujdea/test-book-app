package ro.digitalnation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.digitalnation.model.Book;
import ro.digitalnation.model.BookRepository;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    public BookRepository bookRepo;

/*    @GetMapping("{id}")
    public Book getBookById(@PathVariable Long id) {
        bookRepo.findById(id);
    }*/

}
