package com.epam.rd.patient.repository;

import com.epam.rd.patient.model.Card;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CardRepository extends MongoRepository<Card, String> {



    Optional<Card> findCardByPatientId(String s);

}
