package com.singlecore.scripts.thieving.strategies;

import com.singlecore.scripts.thieving.variables.Variables;
import org.parabot.core.ui.Logger;
import org.parabot.environment.api.utils.Time;
import org.parabot.environment.api.utils.Timer;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.min.api.methods.Inventory;
import org.rev317.min.api.methods.Items;
import org.rev317.min.api.methods.Menu;
import org.rev317.min.api.wrappers.Item;

/**
 * Created by Single Core on 21/04/2015.
 */
public class AddToPouch implements Strategy {

    Timer time = new Timer(1800);

    @Override
    public boolean activate() {
        return Inventory.contains(996) || Inventory.isFull();
    }

    @Override
    public void execute() {
        Variables.status = "pouch";
        Item coins = Inventory.getItem(996);
        if (coins != null) {
            Logger.addMessage("Added money to your pouch!", true);
            Variables.moneyMade += coins.getStackSize() / 1000;
            Logger.addMessage("We have collected: " + Variables.moneyMade + "K so far.", true);
            coins.interact(Items.Option.FOURTH);
        } else {
            if (Inventory.isFull())
                Inventory.getItems()[0].drop();
        }
        Time.sleep(1000);
    }
}
