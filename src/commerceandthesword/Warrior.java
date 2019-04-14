//Isaac Lichter
package commerceandthesword;

public class Warrior implements Troop{
    
    final static int COST = 100;

    @Override
    public int doAttack() {
        
        return (int)Math.random() % 6 + 1;
        
    }
    
}
