package CommerceAndTheSword;

import java.util.Random;

public class DiceRollLib {

    private DiceRollLib(){

    }


    public static int sixSideDieRollOnce() {
        Random random = new Random();
        return (Math.abs(random.nextInt()) % 6) + 1;
    }

    public static int eightSideDieRollOnce() {
        Random random = new Random();
        return (Math.abs(random.nextInt()) % 8) + 1;
    }

    public static DicePairRoll rollTwoDice() {
        return new DicePairRoll(sixSideDieRollOnce(), sixSideDieRollOnce());
    }
}
