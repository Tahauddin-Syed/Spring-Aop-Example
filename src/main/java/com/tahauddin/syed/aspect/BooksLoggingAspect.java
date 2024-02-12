package com.tahauddin.syed.aspect;

import com.tahauddin.syed.domain.entity.BooksEntity;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class BooksLoggingAspect {

    @Before("execution(com.tahauddin.syed.domain.entity.BooksEntity saveBook(com.tahauddin.syed.domain.entity.BooksEntity))")
    public void beforeAddBooksEntity() {
      log.info("In Aspect Before Adding Books");
    }



}
