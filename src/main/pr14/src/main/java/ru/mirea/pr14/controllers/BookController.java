package ru.mirea.pr14.controllers;


import org.springframework.web.bind.annotation.*;
import ru.mirea.pr14.entity.Book;
import ru.mirea.pr14.models.Item;

import java.util.ArrayList;

@RestController
public class BookController {
    ArrayList<Book> books = new ArrayList<>();
    @PostMapping("/books/create")
    public String createBook(@RequestBody Book book){
        books.add(book);
        book.setId(books.size());
        return books.toString();
    }

    @GetMapping("/books")
    public String allBooks(){
        return books.toString();
    }

    @DeleteMapping("/items/{item_id}")
    public String deleteBook(@PathVariable("item_id") int book_id){
        books.removeIf(o -> o.getId() == book_id);
        return books.toString();
    }
}
