package io.luaprogrammer.libraryapi.api.resource;

import io.luaprogrammer.libraryapi.api.dto.BookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookDTO create() {
        BookDTO book = new BookDTO();
        book.setTitle("Meu Livro");
        book.setAuthor("Autor");
        book.setIsbn("123456");
        book.setId(11);
        return  book;
    }

}
