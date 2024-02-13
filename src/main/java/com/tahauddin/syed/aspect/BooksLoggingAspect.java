package com.tahauddin.syed.aspect;

import com.tahauddin.syed.domain.entity.BooksEntity;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Slf4j
@Order(1)
public class BooksLoggingAspect {

    @Before("execution(com.tahauddin.syed.domain.entity.BooksEntity saveBook(com.tahauddin.syed.domain.entity.BooksEntity))")
    public void beforeAddBooksEntity(JoinPoint joinPoint) {
        log.info("In Books Logging Aspect --  Before Adding Books");
        Signature signature = joinPoint.getSignature();
        log.info("Method Signature :: {}", signature);
        Arrays.stream(joinPoint.getArgs())
                .filter(BooksEntity.class :: isInstance)
                .forEach(l -> log.info("Books Entity :: {}", l));
    }


}
