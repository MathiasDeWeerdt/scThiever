package com.singlecore.scripts.thieving.objectinstances;

/**
 * Created by Single Core on 4/23/2015.
 */
public class Stall {

    private final int level;

    public Stall(int level) {
        this.level = level;
    }

    public Stalls getStallForMyLevel() {
        Stalls tmp = null;
        for (Stalls stall : Stalls.values()) {
            if (stall.getRequiredLevel() <= level) {
                tmp = stall;
            }
        }
        return tmp;
    }

}
