package com.demo.example.student_library_management_system.convertors;


import com.demo.example.student_library_management_system.model.Author;
import com.demo.example.student_library_management_system.requestdto.AuthorRequestDto;

public class AuthorConvertor {

    public static Author convertAuthorDtotoAuthor(AuthorRequestDto authorRequestDto){
        Author author = new Author();
        author.setName(authorRequestDto.getName());
        author.setEmail(authorRequestDto.getEmail());
        author.setGender(authorRequestDto.getGender());
        author.setCountry(authorRequestDto.getCountry());
        author.setRating(authorRequestDto.getRating());
        return author;

    }
}
