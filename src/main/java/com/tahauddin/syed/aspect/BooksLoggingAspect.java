package com.tahauddin.syed.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class BooksLoggingAspect {


    @Pointcut("execution(com.tahauddin.syed.domain.entity.BooksEntity saveBook(com.tahauddin.syed.domain.entity.BooksEntity))")
    public void pointCutExpression() { }

    @Before("pointCutExpression()")
    public void beforeAddBooksEntityOne() {
        log.info("In Aspect Before Adding Books One");
    }

    @Before("pointCutExpression()")
    public void beforeAddBooksEntityTwo() {
        log.info("In Aspect Before Adding Books Two");
    }


}
