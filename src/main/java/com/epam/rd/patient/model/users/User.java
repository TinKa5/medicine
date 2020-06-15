package com.epam.rd.patient.model.users;


import com.epam.rd.patient.model.Visit;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "users")
public  class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String address;

    @Indexed(unique = true)
    private String email;
    private String password;
}
