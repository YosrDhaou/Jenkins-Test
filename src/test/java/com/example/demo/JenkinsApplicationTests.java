package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;  // Ajout de l'import pour assertEquals

@SpringBootTest
class JenkinsApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("it is a test class");
        assertEquals(true, true);  // Correction de la méthode ici
    }
}

