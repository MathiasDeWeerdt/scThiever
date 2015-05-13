package com.singlecore.scripts.thieving.strategies;

import com.singlecore.scripts.thieving.functions.Functions;
import com.singlecore.scripts.thieving.variables.Variables;
import org.parabot.core.ui.Logger;
import org.parabot.environment.api.utils.Time;
import org.parabot.environment.input.Keyboard;
import org.parabot.environment.input.Mouse;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.min.api.methods.*;
import org.rev317.min.api.methods.Menu;

import java.awt.*;

/**
 * Created by Single Core on 13/05/2015.
 */
public class ResetScript implements Strategy {

    @Override
    public boolean activate() {
        return Variables.canReset || !Game.isLoggedIn() || Game.getOpenBackDialogId() == 4900 || Game.getOpenBackDialogId() == 363;
    }

    @Override
    public void execute() {
        Variables.status = "reset";
        if(Game.isLoggedIn() || Game.getOpenBackDialogId() == 363) {
            Logger.addMessage("Script got stuck[Packets] Attempting to reset.", true);
            for(int i = 0; i < 100; i++)
                Menu.sendAction(200, 1797, 373, 3902, 0);
        } else {
            Logger.addMessage("Logging back in.", true);
            Mouse.getInstance().click(375, 318, true);
            Time.sleep(10000);
            Variables.canReset = false;
        }

        if(Game.isLoggedIn()) {
            Functions.updateObjects();
        }

        if(Game.getOpenBackDialogId() == 4900) {
            Menu.sendAction(679, 1797, 395, 4907, 0);
            Time.sleep(1200);
        }
    }
}
