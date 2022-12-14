package com.example.Study.service;

import com.example.Study.domain.Book;
import com.example.Study.domain.Study;
import com.example.Study.dto.BookDto;
import com.example.Study.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void save(BookDto bookDto) {
        Book b1 = new Book();
        b1.setBookName(bookDto.getBookName());
        b1.setBookPage(bookDto.getBookPage());
        b1.setBookAuthor(bookDto.getBookAuthor());
        b1.setBookPublisher(bookDto.getBookPublisher());
        b1.setBookUrl(bookDto.getBookUrl());
        bookRepository.save(b1);
    }

    public Optional<Book> findByid(Long studyId) {
        return bookRepository.findById(studyId);
    }

    public void modify(Long studyId, BookDto bookDto) {
        Book b1 = new Book();
        b1.setId(studyId);
        b1.setBookName(bookDto.getBookName());
        b1.setBookPage(bookDto.getBookPage());
        b1.setBookAuthor(bookDto.getBookAuthor());
        b1.setBookPublisher(bookDto.getBookPublisher());
        b1.setBookUrl(bookDto.getBookUrl());
        bookRepository.save(b1);
    }

    public void delete(Book books) {
        bookRepository.delete(books);
    }
}
