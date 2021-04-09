package ru.mirea.pr14.controllers;


import org.springframework.web.bind.annotation.*;
import ru.mirea.pr14.entity.Author;

import java.util.ArrayList;

@RestController
public class AuthorController {
    ArrayList<Author> authors = new ArrayList<>();
    @PostMapping("/authors/create")
    public String createAuthor(@RequestBody Author author){
        authors.add(author);
        author.setId(authors.size());
        return authors.toString();
    }

    @GetMapping("/authors")
    public String allOrders(){
        return authors.toString();
    }

    @DeleteMapping("/authors/{author_id}")
    public String deleteOrder(@PathVariable("author_id") int author_id){
        authors.removeIf(o -> o.getId() == author_id);
        return authors.toString();
    }
}
