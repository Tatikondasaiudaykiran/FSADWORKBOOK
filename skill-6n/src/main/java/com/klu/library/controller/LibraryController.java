package com.klu.library.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klu.library.model.Book;

@RestController
public class LibraryController {

    private List<Book> bookList = new ArrayList<>();

    // 1. Welcome Message
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Online Library System";
    }

    // 2. Total Books Count
    @GetMapping("/count")
    public int totalBooks() {
        return 250;
    }

    // 3. Sample Book Price
    @GetMapping("/price")
    public double bookPrice() {
        return 499.99;
    }

    // 4. List of Book Titles
    @GetMapping("/books")
    public List<String> getBooks() {
        return Arrays.asList(
                "Java Programming",
                "Spring Boot",
                "Python Basics",
                "Cloud Computing"
        );
    }

    // 5. Book Details by ID
    @GetMapping("/books/{id}")
    public String getBookById(@PathVariable int id) {
        return "Details of Book ID: " + id;
    }

    // 6. Search Book using Request Parameter
    @GetMapping("/search")
    public String searchBook(@RequestParam String title) {
        return "Searching for book: " + title;
    }

    // 7. Author Name
    @GetMapping("/author/{name}")
    public String getAuthor(@PathVariable String name) {
        return "Books written by: " + name;
    }

    // 8. Add Book using POST
    @PostMapping("/addbook")
    public String addBook(@RequestBody Book book) {
        bookList.add(book);
        return "Book added successfully!";
    }

    // 9. View All Added Books
    @GetMapping("/viewbooks")
    public List<Book> viewBooks() {
        return bookList;
    }
}