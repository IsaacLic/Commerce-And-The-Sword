//Isaac Lichter
package commerceandthesword;

public class MythicWarrior implements Troop {
    
    final static int COST = 200;

    @Override
    public int doAttack() {
        
        return (int)Math.random() % 8 + 1;
    
    }
    
}
