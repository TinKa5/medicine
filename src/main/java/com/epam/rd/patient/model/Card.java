package com.epam.rd.patient.model;

import com.epam.rd.patient.model.users.Patient;
import com.epam.rd.patient.model.users.User;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
@Data
@Document(collection = "cars")
public class Card {
    @Id
    private String id;
    private User patient;
    private List<Appointment> appointments=new ArrayList<>();
}
