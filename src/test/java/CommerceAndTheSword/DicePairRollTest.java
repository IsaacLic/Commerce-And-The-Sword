package CommerceAndTheSword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DicePairRollTest {

    @Test
    void isDoubleTest() {
        DicePairRoll roll1 = new DicePairRoll(2, 2);
        DicePairRoll roll2 = new DicePairRoll(1, 3);

        assertTrue(roll1.isDouble());
        assertFalse(roll2.isDouble());
    }

    @Test
    void getRollTest() {
        DicePairRoll roll = new DicePairRoll(2, 2);

        assertEquals(4, roll.getRoll());
    }
}