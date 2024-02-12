package com.tahauddin.syed.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "Books")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BooksEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "BOOK_NAME")
    private String bookName;

    @Column(name = "IS_ENABLED")
    private Integer isEnabled;

    @Column(name = "BOOK_CATEGORY")
    private String bookCategory;

    @Column(name = "PRICE")
    private BigDecimal bookPrice;

    @Column(name = "ISBN")
    private String isbn;
}
