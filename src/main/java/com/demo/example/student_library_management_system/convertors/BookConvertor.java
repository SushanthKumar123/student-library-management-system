package com.demo.example.student_library_management_system.convertors;

import com.demo.example.student_library_management_system.model.Book;
import com.demo.example.student_library_management_system.requestdto.BookRequestDto;


public class BookConvertor {

    public static Book convertBookDtotoBook(BookRequestDto bookRequestDto){
        Book book = new Book();
        book.setTitle(bookRequestDto.getTitle());
        book.setPages(bookRequestDto.getPages());
        book.setPublisherName(bookRequestDto.getPublisherName());
        book.setPublishedDate(bookRequestDto.getPublishedDate());
        book.setCategory(bookRequestDto.getCategory());
        book.setRackNo(bookRequestDto.getRackNo());
        book.setAvailability(bookRequestDto.getAvailability());
        return book;
    }
}
