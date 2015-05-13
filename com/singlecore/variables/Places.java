package com.singlecore.variables;

import com.singlecore.api.Teleport;

/**
 * Created by azerty on 25-Apr-15.
 */
public class Places {

    public enum FishingPlaces {
        Draynor(5552, Teleport.SKILLING_DRAYNOR_FISHING),
        BarbarianVillage(0, Teleport.SKILLING_BARBARIAN_VILLAGE),
        FishingGuild(0, Teleport.SKILLING_FISHING_GUILD),
        ShiloVillage(0, Teleport.SKILLING_SHILO_VILLAGE),
        Catherby(324, Teleport.SKILLING_CATERBY),
        PiscatorisFishingColoney(0, Teleport.SKILLING_PISCATORIS_FISHING_COLONEY);

        FishingPlaces(int fishingSpotId, Teleport teleport) {
            this.fishingSpotId = fishingSpotId;
            this.teleport = teleport;
        }

        public int getFishingSpotId() {
            return fishingSpotId;
        }

        public Teleport getTeleportLocation() {
            return teleport;
        }

        private final int fishingSpotId;
        private final Teleport teleport;
    }


}
