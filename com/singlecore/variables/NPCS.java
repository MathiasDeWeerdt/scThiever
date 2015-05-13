package com.singlecore.variables;

/**
 * Created by Single Core on 21/04/2015.
 */
public class NPCS {

    public enum Shops {
        BANDIT_LEADER(1878, "Bandit Leader");

        Shops(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        private final String name;
        private int id;
    }

    public enum Monsters {
        ROCK_CRAB(0, "Rock Crab");

        Monsters(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        private final String name;
        private int id;
    }

}
