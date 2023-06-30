package com.johnjohn21121.COLORS360Studio.model;

import com.johnjohn21121.COLORS360Studio.constants.ShirtMaterial;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.lang.NonNull;

@Entity
@Data
@NoArgsConstructor
public class CustomShirt {


    @Id
    int id;
    @NonNull
    byte[][] customDesign;
    ShirtMaterial shirtMaterial;

}
