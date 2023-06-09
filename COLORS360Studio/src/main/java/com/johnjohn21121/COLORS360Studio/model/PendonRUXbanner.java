package com.johnjohn21121.COLORS360Studio.model;

import com.johnjohn21121.COLORS360Studio.constants.PendonSize;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@Entity
public class PendonRUXbanner {

    enum Material{
        BANNER,
        LONA
    }

    @Id
    int id;
    PendonSize pendonSize;
    Material material;

}
