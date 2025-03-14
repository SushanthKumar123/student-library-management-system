package com.demo.example.student_library_management_system.convertors;


import com.demo.example.student_library_management_system.model.Card;
import com.demo.example.student_library_management_system.requestdto.CardRequestDto;

public class CardConvertor {
    public static Card convertCardDtotoCard(CardRequestDto cardRequestDto){
        Card card = new Card();
        card.setCardStatus(cardRequestDto.getCardStatus());
        return card;
    }
}
