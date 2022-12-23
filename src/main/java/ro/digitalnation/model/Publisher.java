package ro.digitalnation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;

    @Column
    private String location;

    @Column
    private String telephone;

    @Column
    private String email;

    @OneToMany(mappedBy = "publisher")
    private List<Book> books = new ArrayList<>();

    public Publisher() {
    }

    public Publisher(Long id, String name, String location, String telephone, String email, List<Book> books) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.telephone = telephone;
        this.email = email;
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void addBook(Book book) {
        books.add(book);
        book.setPublisher(this);
    }

    public void removeBook(Book book) {
        books.remove(book);
        book.setPublisher(null);
    }
}
