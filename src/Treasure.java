public class Treasure {
    public static final String DIAMOND  = "Diamond";
    public static final String GOLD = "Gold";
    public static final String SILVER = "Silver";
    public static final String DUST = "specks of dust";
    private String treasure;
    private int random;

    public Treasure () {
        random = (int) (Math.random () * 4) + 1;
        if (random == 1) {
            treasure = DUST;
        }
        if (random == 2) {
            treasure = SILVER;
        }
        if (random == 3) {
            treasure = GOLD;
        }
        if (random == 4 ) {
            treasure = DIAMOND;
        }
    }

    public static boolean collectedAllTreasures(String collection){
        boolean hasDiamond = collection.indexOf(DIAMOND) != -1;
        boolean hasGold = collection.indexOf(GOLD) != -1;
        boolean hasSilver = collection.indexOf(SILVER) != -1;

        return (hasDiamond && hasGold && hasSilver);
    }

    public String getType() {
        return treasure;
    }
}
