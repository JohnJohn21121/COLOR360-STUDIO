package com.johnjohn21121.COLORS360Studio.constants;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public enum ShirtMaterial {

    COTTON("ALGODON"), VINIL_TEXTIL("VINIL_TEXTIL"), DTF("DTF");

    private final String shirtMaterialType;

    private static final Map<String, ShirtMaterial> BY_MATERIAL = new HashMap<>();

    static {
        for (ShirtMaterial e: values()){
            BY_MATERIAL.put(e.shirtMaterialType, e);
        }
    }

    private ShirtMaterial(String shirtMaterialType){
        this.shirtMaterialType = shirtMaterialType;
    }

    public static ShirtMaterial valueOfShirtMaterial(String shirtMaterialType){
        return BY_MATERIAL.get(shirtMaterialType);
    }

}
