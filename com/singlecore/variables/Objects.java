package com.singlecore.variables;

/**
 * Created by Single Core on 21/04/2015.
 */
public class Objects {

    public enum Woodcutting {
        TREE(1278, "Tree"),
        WILLOW(1308, "Willow"),
        WILLOWS(new int[]{1308, 5551, 5553}, "Willows");

        Woodcutting(int id, String name) {
            this.id = id;
            this.name = name;
        }

        Woodcutting(int[] ids, String name) {
            this.ids = ids;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public int[] getIds() {
            return ids;
        }

        private final String name;

        private int id;
        private int[] ids;
    }

    public enum Mining {
        IRON_ROCK(2092, "Rocks"),
        IRON_ROCKS(new int[]{2092, 2093}, "Rocks");

        Mining(int id, String name) {
            this.id = id;
            this.name = name;
        }

        Mining(int[] ids, String name) {
            this.ids = ids;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public int[] getIds() {
            return ids;
        }

        private final String name;

        private int id;
        private int[] ids;
    }

    public enum Fishing {
        NET_FISHINGSPOT(5552, Tools.Fishing.SMALL_FISHING_NET),
        BAIT_FISHINGSPOT(5552, Tools.Fishing.BIG_FISHING_NET);

        Fishing(int id, Tools.Fishing tool) {
            this.id = id;
            this.tool = tool;
        }

        public int getId() {
            return id;
        }

        public Tools.Fishing getTool() {
            return tool;
        }

        private int id;
        private Tools.Fishing tool;
    }
}
