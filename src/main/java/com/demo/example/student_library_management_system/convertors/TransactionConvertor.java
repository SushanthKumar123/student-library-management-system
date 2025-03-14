package com.demo.example.student_library_management_system.convertors;


import com.demo.example.student_library_management_system.Enums.TransactionType;
import com.demo.example.student_library_management_system.model.Transaction;
import com.demo.example.student_library_management_system.requestdto.TransactionRequestDto;

public class TransactionConvertor {

    public static Transaction convertTransactionDtotoTransaction(TransactionRequestDto transactionRequestDto){
        Transaction transaction = new Transaction();
        transaction.setTransactionType(transactionRequestDto.getTransactionType());
        transaction.setDueDate(transactionRequestDto.getDueDate());
        transaction.setFine(transactionRequestDto.getFine());
        return transaction;
    }
}
