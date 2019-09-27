package CommerceAndTheSword.Monopoly;

import CommerceAndTheSword.Player;

public interface Tile {

    public String getName();

    public void executeLandingEvent(Player player);
}
