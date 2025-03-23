package com.example.belajar_spring_logging;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@Slf4j
@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
public class LoggingTest {

    @Test
    void testLog() {
        log.info("Belajar Java");
        log.warn("Belajar Spring");
        log.error("Belajar Programmer Zaman Now");
    }
}
