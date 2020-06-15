package com.epam.rd.patient.model.users;


import com.epam.rd.patient.model.Visit;
import lombok.Data;

import java.util.List;
@Data
public class Patient extends User {
    private List<Visit> visits;

}
