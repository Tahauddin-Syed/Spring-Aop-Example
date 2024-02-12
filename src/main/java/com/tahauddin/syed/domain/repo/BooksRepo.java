package com.tahauddin.syed.domain.repo;

import com.tahauddin.syed.domain.entity.BooksEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BooksRepo extends JpaRepository<BooksEntity, Long> {

    List<BooksEntity> findAllByIsEnabled(Integer isEnabled);

    BooksEntity findByIsbn(String isbn);

}
