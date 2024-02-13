package com.tahauddin.syed.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
@Order(3)
public class BooksAsyncCloudLoggincAspect {

    @Before("execution(com.tahauddin.syed.domain.entity.BooksEntity saveBook(com.tahauddin.syed.domain.entity.BooksEntity))")
    public void beforeAddBooksEntity() {
      log.info("In Books Async Cloud Logging Aspect -- Before Adding Books");
    }



}
