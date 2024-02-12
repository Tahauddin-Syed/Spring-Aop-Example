package com.tahauddin.syed.runner;

import com.tahauddin.syed.domain.entity.BooksEntity;
import com.tahauddin.syed.domain.repo.BooksRepo;
import com.tahauddin.syed.service.BooksService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Slf4j
@RequiredArgsConstructor
public class BooksRunner implements CommandLineRunner {

    private final BooksService booksService;


    @Override
    public void run(String... args) throws Exception {
        log.info("Saving Book in DB");
        booksService.saveBook(BooksEntity.builder()
                        .bookCategory("Education")
                        .bookName("Spring Boot")
                        .bookPrice(BigDecimal.valueOf(1000))
                        .isbn("edu-spring")
                        .isEnabled(1)
                .build());

        log.info("Book Saved in DB");
    }
}
