package com.johnjohn21121.COLORS360Studio.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class User {

    @NonNull
    String id;
    @NonNull
    String name;
    @NonNull
    String userName;
    @NonNull
    String password;

}
