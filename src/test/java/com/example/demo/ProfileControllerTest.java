package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class ProfileControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testProfileMessage() {
        ResponseEntity<String> response = restTemplate.getForEntity("/profile", String.class);
        assertThat(response.getBody()).isEqualTo("Welcome to the Testing Environment!");
    }
}
