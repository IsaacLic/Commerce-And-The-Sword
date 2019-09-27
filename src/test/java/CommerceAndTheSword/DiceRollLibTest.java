package CommerceAndTheSword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DiceRollLibTest {

    @Test
    public void sixSideDieRollTest(){
        for(int i = 0; i < 100; i++) {
            int dieRoll = DiceRollLib.sixSideDieRollOnce();
            assertTrue(dieRoll >= 1);
            assertTrue(dieRoll <= 6);
        }
    }

    @Test
    public void eightSideDieRollTest(){
        for(int i = 0; i < 100; i++) {
            int dieRoll = DiceRollLib.eightSideDieRollOnce();
            assertTrue(dieRoll >= 1);
            assertTrue(dieRoll <= 8);
        }
    }

    @Test
    public void doubleSixSideDieRollTest(){
        for(int i = 0; i < 100; i++) {
            DicePairRoll roll = DiceRollLib.rollTwoDice();
            assertTrue(roll.getRoll() >= 2);
            assertTrue(roll.getRoll() <= 12);
        }
    }
}
