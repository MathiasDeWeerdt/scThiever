package com.singlecore.api;

import org.parabot.environment.api.utils.Time;
import org.rev317.min.api.methods.Menu;

/**
 * Created by Single Core on 25/04/2015.
 */
public enum Teleport {
    /*HOME TELEPORT*/
    HOME_HOME(646, 1195, 315, 2461, 0, 0, 0),
    HOME_MARKETPLACE(646, 1195, 315, 2462, 0, 0, 0),

    /*TRAINING TELEPORT*/
    TRAINING_ROCK_CRABS(315, 1164, 315, 2494, 0, 0, 0),
    TRAINING_EXPERIMENTS(315, 1164, 315, 2495, 0, 0, 0),
    TRAINING_YAKS(315, 1164, 315, 2496, 0, 0, 0),
    TRAINING_BANDITS(315, 1164, 315, 2497, 0, 0, 0),
    TRAINING_GHOULS(315, 1164, 315, 2494, 2498, 0, 0),
    TRAINING_CHOAS_DRUIDS(315, 1164, 315, 2495, 2498, 0, 0),
    TRAINING_TZHAAR(315, 1164, 315, 2496, 2498, 0, 0),
    TRAINING_DUST_DEVILS(315, 1164, 315, 2497, 2498, 0, 0),
    TRAINING_CHICKENS(315, 1164, 315, 2494, 2498, 2498, 0),
    TRAINING_MONKEY_SKELETONS(315, 1164, 315, 2495, 2498, 2498, 0),
    TRAINING_APE_ATOLL_GUARDS(315, 1164, 315, 2496, 2498, 2498, 0),
    TRAINING_ARMOURED_ZOMBIES(315, 1164, 315, 2497, 2498, 2498, 0),

    /*Skilling Woodcutting*/
    SKILLING_VARROCK_EAST(315, 1541, 315, 2494, 2494, 0, 0),
    SKILLING_DRAYNOR_WOODCUTTING(315, 1541, 315, 2495, 2494, 0, 0),
    SKILLING_SEERS_VILLAGE(315, 1541, 315, 2496, 2494, 0, 0),
    SKILLING_TREE_GNOME_STRONGHOLD(315, 1541, 315, 2497, 2494, 0, 0),
    SKILLING_ISAFDAR(315, 1541, 315, 2498, 2494, 0, 0),

    /*SKILLING FISHING*/
    SKILLING_DRAYNOR_FISHING(315, 1541, 315, 2494, 2495, 0, 0),
    SKILLING_BARBARIAN_VILLAGE(315, 1541, 315, 2495, 2495, 0, 0),
    SKILLING_FISHING_GUILD(315, 1541, 315, 2496, 2495, 0, 0),
    SKILLING_SHILO_VILLAGE(315, 1541, 315, 2497, 2495, 0, 0),
    SKILLING_CATERBY(315, 1541, 315, 2494, 2494, 2498, 0),
    SKILLING_PISCATORIS_FISHING_COLONEY(315, 1541, 315, 2495, 2495, 2498, 0),
    SKILLING_CAVERENS(315, 1541, 315, 2496, 2495, 2498, 0),

    /*Skilling Farming*/
    SKILLING_CATHERBY(315, 1541, 315, 2494, 2496, 0, 0),
    SKILLING_ARDOUGNE(315, 1541, 315, 2495, 2496, 0, 0),
    SKILLING_CANIFIS(315, 1541, 315, 2496, 2496, 0, 0),
    SKILLING_FALADOR(315, 1541, 315, 2497, 2496, 0, 0),

    /*Skilling Summoning*/
    SKILLING_UNICORNS(315, 1541, 315, 2494, 2497, 0, 0),
    SKILLING_WATERFIENDS(315, 1541, 315, 2495, 2497, 0, 0),
    SKILLING_ROCK_LOBSTERS(315, 1541, 315, 2496, 2497, 0, 0),
    SKILLING_GIANT_ROCK_CRABS(315, 1541, 315, 2497, 2497, 0, 0),
    SKILLING_WALLASALKI(315, 1541, 315, 2498, 2497, 0, 0),

    /*Skilling Mining*/
    SKILLING_VARROCK_EAST_MINING(315, 1541, 315, 2494, 2498, 2494, 0),
    SKILLING_AL_KHARID(315, 1541, 315, 2495, 2498, 2494, 0),
    SKILLING_DWARVEN_MINE(315, 1541, 315, 2496, 2498, 2494, 0),
    SKILLING_LUMBRIDGE_EAST(315, 1541, 315, 2497, 2498, 2494, 0),
    SKILLING_TODO_RUNITE(315, 1541, 315, 2498, 2498, 2494, 0),

    /*Skilling Smithing*/
    SKILLING_ANVIL(315, 1541, 315, 2494, 2498, 2495, 0),
    SKILLING_FURNACE(315, 1541, 315, 2495, 2498, 2495, 0),

    /*Skilling Agility*/
    SKILLING_GNOME_AGILITY_COURSE(315, 1541, 315, 2494, 2498, 2496, 0),
    SKILLING_BARBARIAN_AGILITY_COURSE(315, 1541, 315, 2495, 2498, 2496, 0),
    SKILLING_APE_ATOLL_AGILITY_COURSE(315, 1541, 315, 2496, 2498, 2496, 0),
    SKILLING_WILDERNESS_AGILITY_COURSE(315, 1541, 315, 2497, 2498, 2496, 0),

    /*Skilling Thieving*/
    SKILLING_EDGEVILLE_THIEVING(315, 1541, 315, 2494, 2498, 2497, 0),
    SKILLING_APE_ATOLL_THIEVING(315, 1541, 315, 2495, 2498, 2497, 0),
    SKILLING_DRAYNOR_THIEVING(315, 1541, 315, 2496, 2498, 2497, 0),
    SKILLING_ARDOUGNE_THIEVING(315, 1541, 315, 2497, 2498, 2497, 0),

    /*Skilling Hunter*/
    HUNTER_WOODLAND(315, 1541, 315, 2494, 2498, 2498, 0),
    HUNTER_JUNGLE(315, 1541, 315, 2495, 2498, 2498, 0),
    HUNTER_DESERT(315, 1541, 315, 2496, 2498, 2498, 0),
    HUNTER_POLAR(315, 1541, 315, 2497, 2498, 2498, 0),
    HUNTER_GRENWALL_AND_PAWYA(315, 1541, 315, 2498, 2498, 2498, 0),

    /*Minigames*/
    MINIGAMES_BARROWS(315, 1167, 315, 2494, 0, 0, 0),
    MINIGAMES_DUEL_ARENA(315, 1167, 315, 2495, 0, 0, 0),
    MINIGAMES_PEST_CONTROL(315, 1167, 315, 2496, 0, 0, 0),
    MINIGAMES_WARRIORS_GUILD(315, 1167, 315, 2497, 0, 0, 0),
    MINIGAMES_FIGHT_CAVES(315, 1167, 315, 2494, 2498, 0, 0),
    MINIGAMES_CASTLE_WARS(315, 1167, 315, 2495, 2498, 0, 0),
    MINIGAMES_FIGHT_PITS(315, 1167, 315, 2496, 2498, 0, 0),
    MINIGAMES_CHAMPIONS_CHALLENGE(315, 1167, 315, 2497, 2498, 0, 0),
    MINIGAMES_CLAN_WARS(315, 1167, 315, 2494, 2498, 2498, 0),
    MINIGAMES_RIOT_WARS(315, 1167, 315, 2495, 2498, 2498, 0),

    /*Slayer*/
    SLAYER_FREMENNIK_SLAYER_DUNGEON(315, 1174, 315, 2494, 0, 0, 0),
    SLAYER_SLAYER_TOWER(315, 1174, 315, 2495, 0, 0, 0),
    SLAYER_FROST_DRAGONS_TODO(315, 1174, 315, 2496, 0, 0, 0),
    SLAYER_BRIMHAVEN_DUNGEON(315, 1174, 315, 2497, 0, 0, 0),
    SLAYER_ASGARNIAN_ICE_DUNGEON(315, 1174, 315, 2494, 2498, 0, 0),
    SLAYER_TAVERLEY_DUNGEON(315, 1174, 315, 2495, 2498, 0, 0),
    SLAYER_LIGHT_HOUSE(315, 1174, 315, 2496, 2498, 0, 0),
    SLAYER_CHAOS_TUNNELS(315, 1174, 315, 2497, 2498, 0, 0),
    SLAYER_ANCIENT_CAVERN_TODO(315, 1174, 315, 2498, 2498, 0, 0),

    /*City*/
    CITY_VARROCK(315, 1540, 315, 2494, 0, 0, 0),
    CITY_FALADOR(315, 1540, 315, 2495, 0, 0, 0),
    CITY_CAMELOT(315, 1540, 315, 2496, 0, 0, 0),
    CITY_ARDOUGNE(315, 1540, 315, 2497, 0, 0, 0),
    CITY_LUMBRIDGE(315, 1540, 315, 2498, 0, 0, 0),

    //TODO PKING Teleports
    //TODO BOSS Teleports
    ;

    Teleport(int spellId, int spellAction3, int destId, int destAction3, int list2, int list3, int list4) {
        this.spellId = spellId;
        this.spellAction3 = spellAction3;
        this.destId = destId;
        this.destAction3 = destAction3;
        this.list2 = list2;
        this.list3 = list3;
        this.list4 = list4;
    }

    public void Teleport() {
        sendAction(spellId, spellAction3);
        Time.sleep(250);
        if (list2 != 0) {
            sendAction(destId, list2);
            Time.sleep(800);
        }
        if (list3 != 0) {
            sendAction(destId, list3);
            Time.sleep(800);
        }
        if (list4 != 0) {
            sendAction(destId, list4);
            Time.sleep(800);
        }
        sendAction(destId, destAction3);
        Time.sleep(250);
    }

    public void sendAction(int id, int action) {
        // System.out.println("Sending Packet: " + id + ", " + action);
        Menu.sendAction(id, 0, 0, action, 0);
    }

    private final int spellId;
    private final int spellAction3;
    private final int destId;
    private final int destAction3;
    private final int list2;
    private final int list3;
    private final int list4;
}