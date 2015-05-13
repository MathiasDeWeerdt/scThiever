package com.singlecore.variables;

/**
 * Created by Single Core on 21/04/2015.
 */
public class Items {

    public enum Woodcutting {
        LOGS(1512, "Logs"),
        WILLOWS(1520, "Willow logs");

        Woodcutting(int id, String name) {
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
        RAW_SHRIMP(318, "Raw Shrimp"),
        RAW_ANCHOVIES(322, "Raw Anchovies");

        Fishing (int id, String name){
            this.id = id;
            this.name = name;
        }

        public int getId(){return id;}

        private final int id;
        private final String name;
    }

}
