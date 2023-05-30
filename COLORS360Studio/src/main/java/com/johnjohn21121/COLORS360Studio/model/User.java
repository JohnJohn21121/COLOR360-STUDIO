package com.johnjohn21121.COLORS360Studio.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@Entity
public class User {

    @Id
    @NonNull
    String id;
    @NonNull
    String name;
    @NonNull
    String LastName;
    @NonNull
    String email;
    @NonNull
    String userName;
    @NonNull
    String password;
    String address;

}
