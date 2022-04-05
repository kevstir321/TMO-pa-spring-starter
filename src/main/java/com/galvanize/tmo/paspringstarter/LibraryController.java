package com.galvanize.tmo.paspringstarter;

import com.galvanize.tmo.paspringstarter.model.Book;
import org.json.JSONObject;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LibraryController {

    Map<String, List<Book>> bookMap = new HashMap<>();
    List<Book> books = new ArrayList<>();
    private int bookCount = 0;

//    @GetMapping("/health")
//    public String health() {
//        return "foobar";
//    }

    @GetMapping(path = "/api/books", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity <Map<String,List<Book>>> getBooks() {
        return new ResponseEntity<Map<String,List<Book>>>(bookMap, HttpStatus.OK);
    }

    @PostMapping(path = "/api/books", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Book> createBook(@RequestBody Book requestUserDetails) {
        bookCount++;
        Book returnValue = new Book(bookCount,requestUserDetails.getAuthor(),requestUserDetails.getBookName(),requestUserDetails.getYearPublished());
        books.add(returnValue);
        bookMap.put("books",books);
        return new ResponseEntity<>(returnValue, HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/api/books")
    public ResponseEntity removeBooks() {
        books.clear();
        bookMap.put("books",books);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
