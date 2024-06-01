package com.wanyua.Restful.Api.Services.Impl;

import com.wanyua.Restful.Api.Domain.BookEntity;
import com.wanyua.Restful.Api.Repository.BookRepository;
import com.wanyua.Restful.Api.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(final BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public Book create(final Book book) {
        final BookEntity bookEntity = bookToBookEntitity(book);
        final BookEntity savedBookEntity = bookRepository.save(bookEntity);
        return bookEntityToBook(savedBookEntity);
    }

    private BookEntity bookToBookEntitity(Book book){
        return BookEntity.builder()
                .isbn(book.getIsbn())
                .title(book.getTitle)
                .author(book.getAuthor)
                .build();
    }

    private BookEntity bookEntityToBook(BookEntity bookEntity){
        return BookEntity.builder()
                .isbn(bookEntity.getIsbn())
                .title(bookEntity.getTitle)
                .author(bookEntity.getAuthor)
                .build();
    }
}
