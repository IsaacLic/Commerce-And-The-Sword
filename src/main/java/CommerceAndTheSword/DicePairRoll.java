package CommerceAndTheSword;

public class DicePairRoll {

    private boolean isDouble;
    private int roll;

    public DicePairRoll(int roll1, int roll2) {
        if (roll1 == roll2) {
            isDouble = true;
        }

        roll = roll1 + roll2;
    }

    public boolean isDouble(){
        return isDouble;
    }

    public int getRoll(){
        return roll;
    }

}
