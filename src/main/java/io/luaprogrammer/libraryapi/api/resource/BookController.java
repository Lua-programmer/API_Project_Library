package io.luaprogrammer.libraryapi.api.resource;

import io.luaprogrammer.libraryapi.api.dto.BookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookDTO create( @RequestBody BookDTO bookDTO) {
        return  bookDTO;
    }

}
