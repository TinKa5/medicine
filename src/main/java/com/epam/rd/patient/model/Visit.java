package com.epam.rd.patient.model;

import com.epam.rd.patient.model.enums.StatusVisit;
import com.epam.rd.patient.model.users.User;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
@Data
public class Visit{
    @Id
    private String id;
    private User doctor;
    private StatusVisit statusVisit;
    private LocalDateTime dateTime;
    private Integer price;
}
