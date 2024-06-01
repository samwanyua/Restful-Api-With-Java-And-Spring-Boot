package com.wanyua.Restful.Api.Services.Impl;

import com.wanyua.Restful.Api.Domain.Book;
import com.wanyua.Restful.Api.Domain.BookEntity;
import com.wanyua.Restful.Api.Repository.BookRepository;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BookServiceImplTest {
    @Mock
    private BookRepository backRepository;
    @InjectMocks
    private BookServiceImplTest underTest;

    static BookServiceImplTest createBookServiceImplTest(bookRepository.save(eq(bookEntity) {
        return new BookServiceImplTest();
    }

    private static BookServiceImplTest newBookServiceImplTest(bookRepository.save(eq(bookEntity) {
        return new BookServiceImplTest();
    }

    public void testThatBookIsSaved(){}
    final Book book = Book.builder().isbn("0434532").author("Tim Keller").title("Meaning of Marriage").build();
    final BookEntity bookEntity = BookEntity.builder().isbn("0434532").author("Tim Keller").title("Meaning of Marriage").build();
    final Book result = underTest.create(book);

    when(bookRepository.save(eq(bookEntity))).thenReturn(bookEntity);
    asserEquals(book, null);
}
