package com.demo.example.student_library_management_system.requestdto;

import com.demo.example.student_library_management_system.Enums.TransactionType;
import com.demo.example.student_library_management_system.model.Book;
import com.demo.example.student_library_management_system.model.Card;

public class TransactionRequestDto {


    private TransactionType transactionType;
    private String dueDate;
    private double fine;
    private int bookId;
    private int cardId;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }


}
