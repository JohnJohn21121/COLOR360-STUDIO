package com.johnjohn21121.COLORS360Studio.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Cup {

    int id;
    byte[][] imageDesign;

}
