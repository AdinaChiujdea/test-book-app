package ro.digitalnation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.digitalnation.model.Book;

import ro.digitalnation.model.Publisher;
import ro.digitalnation.service.BookService;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    List<Book> getAllBooks() {
    return bookService.getAllBooks();
}

    @RequestMapping("/books/{id}")
    public Book getBook(@PathVariable Long id){
        return  bookService.getBook(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/books")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }
}
