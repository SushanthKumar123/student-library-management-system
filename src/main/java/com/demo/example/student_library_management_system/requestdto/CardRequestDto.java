package com.demo.example.student_library_management_system.requestdto;

import com.demo.example.student_library_management_system.Enums.CardStatus;
import com.demo.example.student_library_management_system.model.Student;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class CardRequestDto {

    private CardStatus cardStatus;
    private int studentId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

}
