package com.singlecore.scripts.thieving.objectinstances;

/**
 * Created by Single Core on 4/23/2015.
 */
public enum Stalls {

    FOOD_STALL(1, 4875),
    CRAFTING_STALL(30, 4874),
    GENERAL_STALL(60, 4876),
    MAGIC_STALL(65, 4877),
    SCIMITAR_STALL(80, 4878);

    Stalls(int requiredlevel, int id) {
        this.requiredlevel = requiredlevel;
        this.id = id;
    }

    public int getRequiredLevel() {
        return requiredlevel;
    }

    public int getId() {
        return id;
    }

    private final int requiredlevel;
    private final int id;
}
