package com.singlecore.scripts.thieving;

import com.singlecore.globalstrategies.CpuOptimisation;
import com.singlecore.scripts.thieving.functions.Functions;
import com.singlecore.scripts.thieving.strategies.AddToPouch;
import com.singlecore.scripts.thieving.strategies.ResetScript;
import com.singlecore.scripts.thieving.strategies.Sell;
import com.singlecore.scripts.thieving.strategies.Steal;
import com.singlecore.scripts.thieving.variables.Variables;
import org.parabot.core.asm.wrappers.Interface;
import org.parabot.core.ui.Logger;
import org.parabot.environment.api.interfaces.Paintable;
import org.parabot.environment.api.utils.Timer;
import org.parabot.environment.scripts.Category;
import org.parabot.environment.scripts.Script;
import org.parabot.environment.scripts.ScriptManifest;
import org.parabot.environment.scripts.framework.Strategy;
import org.rev317.min.api.events.MessageEvent;
import org.rev317.min.api.events.listeners.MessageListener;
import org.rev317.min.api.methods.Game;
import org.rev317.min.api.methods.Inventory;
import org.rev317.min.api.methods.SceneObjects;
import org.rev317.min.api.methods.Skill;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Single Core on 21/04/2015.
 */

@ScriptManifest(author = "SingleCore", name = "scThiever", category = Category.THIEVING, version = 1.00, description = "Thieves all the stalls dynamicly", servers = "Ikov")
/* implements vergeten */
public class scThiever extends Script implements MessageListener, Paintable {

    public List<Strategy> strategies;
    Timer timer;
    int leveled;

    @Override
    public boolean onExecute() {

        if(!Game.isLoggedIn()) {
            Logger.addMessage("Please start your script when you're logged in!", true);
            return false;
        }

        strategies = new ArrayList<Strategy>();
        strategies.add(new Steal());
        strategies.add(new Sell());
        strategies.add(new AddToPouch());
        strategies.add(new ResetScript());

        /*Should decrease CPU usage!*/
        strategies.add(new CpuOptimisation());

        provide(strategies);
        Functions.updateObjects();

        timer = new Timer();
        leveled = 0;
        return true;
    }

    @Override
    public void messageReceived(MessageEvent messageEvent) {
        String msg = messageEvent.getMessage();
        if (msg.contains("advanced an Thieving")) {
            Variables.isPlayerLeveled = true;
            leveled++;
        }
        if(msg.contains("object does not exist")
                || msg.contains("your ignore list")
                || msg.contains("to receive input")
                || msg.contains("does not exist")) {
            Variables.canReset = true;
        }
    }

    @Override
    public void onFinish() {
        System.out.println("Script finished.");
    }

    private final RenderingHints antialiasing = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

    private final Color color1 = new Color(51, 51, 51, 200);
    private final Color color2 = new Color(102, 0, 102);
    private final Color color3 = new Color(255, 255, 255);
    private final Color color4 = new Color(255, 255, 255, 182);

    private final BasicStroke stroke1 = new BasicStroke(1);

    private final Font font1 = new Font("Arial", 0, 12);
    private final Font font2 = new Font("Arial", 3, 12);

    @Override
    public void paint(Graphics g1) {
        Graphics2D g = (Graphics2D)g1;
        g.setRenderingHints(antialiasing);

        g.setColor(color1);
        g.fillRect(239, 249, 270, 79);
        g.setColor(color2);
        g.setStroke(stroke1);
        g.drawRect(239, 249, 270, 79);
        g.setFont(font1);
        g.setColor(color3);
        g.drawString("Runtime:  " + timer.toString(), 250, 270);
        g.drawString("Level: " + Skill.THIEVING.getLevel() + " (" + leveled + ")", 250, 290);
        g.drawString("Money made: " + Variables.moneyMade + "K" + " (" + timer.getPerHour(Variables.moneyMade) + "K )", 249, 310);
        g.setFont(font2);
        g.setColor(color4);
        g.drawString("Made by range_inc", 395, 324);

        g.drawString("logged: " + Game.isLoggedIn() + ", Status: " +  Variables.status, 10, 20);
    }
}
