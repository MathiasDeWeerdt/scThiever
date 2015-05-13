package com.singlecore.scripts.thieving.functions;

import com.singlecore.scripts.thieving.objectinstances.Stall;
import com.singlecore.scripts.thieving.objectinstances.Stalls;
import com.singlecore.scripts.thieving.variables.Variables;
import org.rev317.min.api.methods.SceneObjects;
import org.rev317.min.api.methods.Skill;

/**
 * Created by azerty on 24-Apr-15.
 */
public class Functions {

    public static Stalls getStallForLevel() {
        Stall s = new Stall(Skill.getCurrentLevel(Skill.THIEVING.getIndex()));
        Stalls stall = s.getStallForMyLevel();
        System.out.println("A stall is chosen");
        return stall;
    }

    public static void updateObjects() {
        Variables.stall = Functions.getStallForLevel();
        Variables.stallObject = SceneObjects.getNearest(Variables.stall.getId());
        Variables.isPlayerLeveled = false;
    }
}