package com.example.onetoone.Service;

import com.example.onetoone.Entity.Card;
import com.example.onetoone.Entity.Student;
import org.springframework.stereotype.Service;

@Service
public interface CardService {

    Card addCard(Card card);

    Card getCard(int id);
}
