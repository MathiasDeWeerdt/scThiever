package com.singlecore.variables;

/**
 * Created by Single Core on 21/04/2015.
 */
public class Tools {

    public enum Woodcutting {
        BRONZE_HATCHET(0, "Bronze hatchet"),
        IRON_HATCHET(1350, "Iron hatchet"),
        STEEL_HATCHET(0, "Steel hatchet"),
        BLACK_HATCHET(0, "Black hatchet"),
        MITHRIL_HATCHET(0, "Mithril hatchet"),
        ADAMANT_HATCHET(0, "Adamant hatchet"),
        RUNE_HATCHET(0, "Rune hatchet"),
        DRAGON_HATCHET(0, "Dragon hatchet");

        Woodcutting(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public int[] getAllHatchets() {
            return new int[]{IRON_HATCHET.getId()};
        }

        private final String name;
        private final int id;
    }

    public enum Mining {
        BRONZE_PICKAXE(0, "Bronze pickaxe"),
        IRON_PICKAXE(1350, "Iron pickaxe"),
        STEEL_PICKAXE(0, "Steel pickaxe"),
        BLACK_PICKAXE(0, "Black pickaxe"),
        MITHRIL_PICKAXE(0, "Mithril pickaxe"),
        ADAMANT_PICKAXE(0, "Adamant pickaxe"),
        RUNE_PICKAXE(1276, "Rune pickaxe"),
        DRAGON_PICKAXE(0, "Dragon pickaxe");

        Mining(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        private final String name;
        private final int id;
    }

    public enum Fishing {
        SMALL_FISHING_NET(304, 1),
        BIG_FISHING_NET(306, 16),
        LOBSTER_POT(302, 40),
        HARPOON(312, 35);

        Fishing(int id, int requiredLevel) {
            this.id = id;
            this.requiredLevel = requiredLevel;
        }


        public int getRequiredLevel() {
            return requiredLevel;
        }

        public int getId() {
            return id;
        }

        private final int requiredLevel;
        private final int id;
    }

}
