package io.luaprogrammer.libraryapi.api.resource;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
//anotação para testar um controller do Spring Boot - o Spring vai criar um minicontexto para aplicar esse teste
@ActiveProfiles("test")
@WebMvcTest //
@AutoConfigureMockMvc //o spring vai configurar um objeto para se fazer as requisições
public class BookControllerTest {

    @Autowired
    MockMvc mvc;

    @Test
    @DisplayName("Deve criar um livro com sucesso")
    public void createBookTest() {

    }

    @Test
    @DisplayName("Deve lançar erro de validação quando não houver dados suficiente para criação do livro")
    public void createInvalidBookTest() {

    }

}
