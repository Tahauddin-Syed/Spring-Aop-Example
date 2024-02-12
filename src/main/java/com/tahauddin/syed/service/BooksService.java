package com.tahauddin.syed.service;

import com.tahauddin.syed.domain.entity.BooksEntity;

import java.util.List;

public interface BooksService {

    BooksEntity saveBook(BooksEntity booksEntity);

    List<BooksEntity> getAllBooks();

    List<BooksEntity> getAllEnabledBooks();

    BooksEntity getBookById(Long id);

    BooksEntity getBookByIsbn(String isbn);
}
