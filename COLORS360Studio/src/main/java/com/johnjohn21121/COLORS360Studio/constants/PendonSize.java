package com.johnjohn21121.COLORS360Studio.constants;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public enum PendonSize {

    FIRST_SIZE_TYPE("0.80 x 2 m"),
    SECOND_SIZE_TYPE("0.70 x 1.60 m");
    private final String sizeType;

    private static final Map<String, PendonSize> BY_SIZE = new HashMap<>();

    static {
        for (PendonSize e : values()) {
            BY_SIZE.put(e.sizeType, e);
        }
    }

    private PendonSize(String size) {
        this.sizeType = size;
    }

    public static PendonSize valueOfSizeType(String size) {
        return BY_SIZE.get(size);
    }
}
