package com.example.bookmanager;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    private Long id;
    private String title;
    private String author;

    // Constructors, getters, setters
}

