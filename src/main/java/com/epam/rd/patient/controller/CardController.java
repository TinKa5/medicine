package com.epam.rd.patient.controller;

import com.epam.rd.patient.model.Card;
import com.epam.rd.patient.repository.CardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CardController {

    private final CardRepository cardRepository;

   @GetMapping(value = "/{id}/cards")
    public Card getAllFromPatientId(@PathVariable String patientId){
      return cardRepository.findCardByPatientId(patientId).get();
  }

    @GetMapping(value = "/cards")
    public List<Card> getAll(){
        return cardRepository.findAll();
    }

    @PostMapping(value = "/card/add")
    public Card add(@RequestBody Card card){
       return cardRepository.save(card);
    }

    @PostMapping(value = "/delete/{id}")
    public void delete(@PathVariable String id){
        cardRepository.deleteById(id);
    }

}
