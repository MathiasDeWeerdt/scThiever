package com.singlecore.scripts.thieving.strategies;

import com.singlecore.functions.GlobalFunctions;
import com.singlecore.scripts.thieving.variables.Variables;
import com.singlecore.variables.NPCS;
import org.parabot.environment.api.utils.Time;
import org.parabot.environment.api.utils.Timer;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.min.api.methods.*;
import org.rev317.min.api.wrappers.Item;
import org.rev317.min.api.wrappers.Npc;

/**
 * Created by Single Core on 21/04/2015.
 */
public class Sell implements Strategy {

    Timer time = new Timer(1800);

    @Override
    public boolean activate() {
        if (Inventory.getCount() == 27 || Game.getOpenInterfaceId() == 3824) {
            return Players.getMyPlayer().getAnimation() == -1 && Game.isLoggedIn() && !Variables.canReset;
        }
        return false;
    }

    @Override
    public void execute() {
        Variables.status = "Sell";
        if (Game.getOpenInterfaceId() != 3824) {
            try {
                Npc[] store = Npcs.getNearest(NPCS.Shops.BANDIT_LEADER.getId());
                if (GlobalFunctions.isInteractableValid(store)) {
                    store[0].interact(Npcs.Option.TALK_TO);
                    time.restart();
                    while (time.getRemaining() > 0 && Game.getOpenInterfaceId() != 3824) {
                        Time.sleep(200);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Item[] items;
            int index  = 0;
            while (Inventory.getCount() > 1) {
                items = Inventory.getItems();

                if (items[index].getId() == 996)
                    index++;

                Menu.sendAction(431, items[index].getId(), items[index].getSlot(), 3823, 0);
                Time.sleep(500);
            }

            if (Inventory.getCount() == 1) {
                Menu.sendAction(200, 1797, 373, 3902, 0);
                Time.sleep(600);
            }
        }

        Time.sleep(250);
    }
}
