package com.singlecore.scripts.thieving.strategies;

import org.parabot.environment.api.utils.Time;
import org.parabot.environment.scripts.framework.Strategy;

/**
 * Created by Single Core on 24/04/2015.
 */
public class CpuOptimisation implements Strategy {

    @Override
    public boolean activate() {
        return true;
    }

    @Override
    public void execute() {
        Time.sleep(350);
    }
}