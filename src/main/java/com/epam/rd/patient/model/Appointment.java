package com.epam.rd.patient.model;

import com.epam.rd.patient.model.users.Doctor;
import lombok.Data;
import org.springframework.data.annotation.Id;
@Data
public class Appointment {
    @Id
    private String id;
    private Doctor doctor;
    private String diagnosis;
    private String prescription;
}
