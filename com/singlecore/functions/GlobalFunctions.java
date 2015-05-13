package com.singlecore.functions;

import org.rev317.min.api.wrappers.*;

/**
 * Created by Single Core on 21/04/2015.
 */
public class GlobalFunctions {

    public static boolean isInteractableValid(Object interactable) {
        if (interactable instanceof SceneObject[]) {
            SceneObject[] sceneobject = (SceneObject[]) interactable;
            return sceneobject != null && sceneobject.length > 0 && sceneobject[0] != null;
        } else if (interactable instanceof Npc[]) {
            Npc[] npc = (Npc[]) interactable;
            return npc != null && npc.length > 0 && npc[0] != null;
        } else if (interactable instanceof Player[]) {
            Player[] player = (Player[]) interactable;
            return player != null && player.length > 0 && player[0] != null;
        } else if (interactable instanceof GroundItem[]) {
            GroundItem[] grounditem = (GroundItem[]) interactable;
            return grounditem != null && grounditem.length > 0 && grounditem[0] != null;
        } else if (interactable instanceof Item[]) {
            Item[] items = (Item[]) interactable;
            return items != null && items.length > 0 && items[0] != null;
        }
        return false;
    }

    public static boolean isLeveled(int previousLevel, int currentLevel) {
        return previousLevel == currentLevel;
    }

    }


