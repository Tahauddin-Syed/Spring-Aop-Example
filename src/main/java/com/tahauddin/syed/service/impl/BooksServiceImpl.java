package com.tahauddin.syed.service.impl;

import com.tahauddin.syed.domain.entity.BooksEntity;
import com.tahauddin.syed.domain.repo.BooksRepo;
import com.tahauddin.syed.service.BooksService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class BooksServiceImpl implements BooksService {

    private final BooksRepo booksRepo;

    @Override
    public BooksEntity saveBook(BooksEntity booksEntity) {
        return booksRepo.save(booksEntity);
    }

    @Override
    public List<BooksEntity> getAllBooks() {
        return booksRepo.findAll();
    }

    @Override
    public List<BooksEntity> getAllEnabledBooks() {
        return booksRepo.findAllByIsEnabled(1);
    }

    @Override
    public BooksEntity getBookById(Long id) {
        return booksRepo.findById(id).get();
    }

    @Override
    public BooksEntity getBookByIsbn(String isbn) {
        return booksRepo.findByIsbn(isbn);
    }
}
