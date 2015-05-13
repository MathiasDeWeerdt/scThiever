package com.singlecore.scripts.thieving.strategies;

import com.singlecore.functions.GlobalFunctions;
import com.singlecore.scripts.thieving.functions.Functions;
import com.singlecore.scripts.thieving.variables.Variables;
import org.parabot.core.ui.Logger;
import org.parabot.environment.api.utils.Time;
import org.parabot.environment.api.utils.Timer;
import org.parabot.environment.scripts.framework.SleepCondition;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.min.api.methods.*;
import org.rev317.min.api.wrappers.Player;

/**
 * Created by Single Core on 21/04/2015.
 */
public class Steal implements Strategy {

    @Override
    public boolean activate() {

        if (Game.getOpenInterfaceId() == -1 && !Inventory.contains(996) && Game.isLoggedIn() && !Variables.canReset) {
            return Players.getMyPlayer().getAnimation() == -1 && Inventory.getCount() <= 26;
        }
        return false;
    }

    @Override
    public void execute() {
        Variables.status = "Steal";
        if (Variables.isPlayerLeveled) {
            Logger.addMessage("You advanced a thieving level! Your thieving level is now: " + Skill.THIEVING.getLevel(), true);
            Functions.updateObjects();
        }

        if (GlobalFunctions.isInteractableValid(Variables.stallObject)) {
            Variables.stallObject[0].interact(SceneObjects.Option.STEAL_FROM);
            Time.sleep(new SleepCondition() {
                @Override
                public boolean isValid() {
                    return Players.getMyPlayer().getAnimation() != -1;
                }
            }, 1200);

        }
        Time.sleep(2250);
    }
}