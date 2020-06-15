package com.epam.rd.patient.model.users;

import com.epam.rd.patient.model.enums.Specialization;
import lombok.Data;

@Data
public class Doctor extends User{
    private Specialization specialization;
}
