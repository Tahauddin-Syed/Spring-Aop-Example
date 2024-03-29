package com.tahauddin.syed.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
@Order(1)
public class BooksLoggingAspect {

    @Before("execution(com.tahauddin.syed.domain.entity.BooksEntity saveBook(com.tahauddin.syed.domain.entity.BooksEntity))")
    public void beforeAddBooksEntity() {
      log.info("In Books Logging Aspect --  Before Adding Books");
    }



}
