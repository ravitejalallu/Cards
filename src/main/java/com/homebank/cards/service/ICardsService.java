package com.homebank.cards.service;

import com.homebank.cards.dto.CardsDto;

public interface ICardsService {

    void createCard(String mobileNumber);


    CardsDto fetchCard(String mobileNumber);

    boolean updateCard(CardsDto cardsDto);

}
