/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commerceandthesword;

/**
 *
 * @author isaac
 */
public class PowerOfChayneTile implements Tile {

    public PowerOfChayneTile() {
    }

    @Override
    public String getName() {
        return "Power of Chayne";
    }

    @Override
    public void executeLandingEvent(Player player) {
        if(player.getMoney() < 500){
            player.setMoney(500);
        }
    }
    
}
