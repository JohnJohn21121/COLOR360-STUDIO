package com.johnjohn21121.COLORS360Studio.constants;

import java.util.HashMap;
import java.util.Map;

public enum Size {

    FIRST_SIZE_TYPE("0.80 x 2 m"),
    SECOND_SIZE_TYPE("0.70 x 1.60 m");
    private final String sizeType;

    private static final Map<String, Size> BY_SIZE = new HashMap<>();

    static {
        for (Size e : values()) {
            BY_SIZE.put(e.sizeType, e);
        }
    }

    public String getSizeType() {
        return sizeType;
    }

    private Size(String size) {
        this.sizeType = size;
    }

    public static Size valueOfSizeType(String size) {
        return BY_SIZE.get(size);
    }
}
