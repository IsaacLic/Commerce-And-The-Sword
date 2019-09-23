import java.util.ArrayList;
import java.util.List;


public class TileListBuilder{
    
    static List TileListFactory() {
        ArrayList<Tile> list = new ArrayList<Tile>();
        list.add(new GenesisTile());
        list.add(new Property("Don Rafael", PropertyType.DIPLOMACY, 210));
        list.add(new Property("Trent Walker", PropertyType.DIPLOMACY, 210));
        list.add(new Property("Achilles", PropertyType.WAR, /*TODO sacrifice warriors*/));
        list.add(new Property("George Bailey", PropertyType.VOLUNTEERISM, 180));
        list.add(new CrystalBallTile());
        list.add(new Property("Artax", PropertyType.TRANSPORTATION, 200));
        list.add(new Property("Howard Roark", PropertyType.HOUSING, 200));
        list.add(new Property("John Milton", PropertyType.DARK_ARTS, 300));
        list.add(new Property("Wang-Lung", PropertyType.AGRICULTURE, 100));
        list.add(new RerollTile());
        list.add(new CrystalBallTile());
        list.add(new Property("Orwell", PropertyType.PROPAGANDA, 250));
        list.add(new Property("Captain", PropertyType.JUSTICE, 150));
        list.add(new Property("Sam Norton", PropertyType.JUSTICE, 150));
        list.add(new Property("Rocinante", PropertyType.TRANSPORTATION, 200));
        list.add(new Property("Lowry", PropertyType.PROPAGANDA, 250));
        list.add(new Property("Detective Marlowe", PropertyType.POLICE, 350));
        list.add(new Property("Detective Spade", PropertyType.POLICE, 350));
        list.add(new Property("Inspector Javert", PropertyType.POLICE, 350));
        list.add(new CrystalBallTile());
        list.add(new RerollTile());
        list.add(new Property("Jonathan Kent", PropertyType.AGRICULTURE, 100));
        list.add(new Property("Mr. Scratch", PropertyType.DARK_ARTS, 300));
        list.add(new Property("Hud", PropertyType.HOUSING, 200));
        list.add(new Property("Pegasus", PropertyType.TRANSPORTATION, 200));
        list.add(new CrystalBallTile());
        list.add(new Property("Gawain", PropertyType.VOLUNTEERISM, 180));
        list.add(new Property("Beowulf", PropertyType.WAR, /*TODO sacrifice warriors*/));
        list.add(new Property("Lewis", PropertyType.DIPLOMACY, 210));
        list.add(new Property("Vizzini", PropertyType.DIPLOMACY, 210));
        
        ExileTile exileTile = new ExileTile();
        exileTile.setAsLimbo();
        list.add(exileTile);
        
        list.add(new Property("Mr. Chips", PropertyType.EDUCATION, 350));
        list.add(new Property("Mr. Keating", PropertyType.EDUCATION, 350));
        list.add(new Property("Ivanhoe", PropertyType.VOLUNTEERISM, 180));
        list.add(new CrystalBallTile());
        list.add(new Property("Khartoum", PropertyType.TRANSPORTATION, 200));
        list.add(new Property("Ozymandious", PropertyType.HOUSING, 200));
        list.add(new Property("Kurz", PropertyType.DARK_ARTS, 300));
        list.add(new Property("John Chapman", PropertyType.AGRICULTURE, 100));
        list.add(new PowerOfChayneTile());
        list.add(new Property("Dr. Moreau", PropertyType.ALCHEMY, 250));
        list.add(new Property("Daedaulus", PropertyType.ALCHEMY, 250));
        list.add(new Property("Prometheus", PropertyType.ALCHEMY, 250));
        list.add(new Property("Lowry", PropertyType.PROPAGANDA, 250));
        list.add(new Property("Dr. Frankenstein", PropertyType.TECHNOLOGY, 350));
        list.add(new CrystalBallTile());
        list.add(new Property("Huxley", PropertyType.PROPAGANDA, 250));
        list.add(new Property("Major Warden", PropertyType.JUSTICE, 150));
        list.add(new Property("Q", PropertyType.TECHNOLOGY, 350));
        list.add(new Property("Professor Alymer", PropertyType.TECHNOLOGY, 350));
        list.add(new Property("Pa Joad", PropertyType.AGRICULTURE, 100));
        list.add(new Property("Dr. Faustus", PropertyType.DARK_ARTS, 300));
        list.add(new Property("Halvard Solness", PropertyType.HOUSING, 200));
        list.add(new Property("Shadowfax", PropertyType.TRANSPORTATION, 200));
        list.add(new CrystalBallTile());
        list.add(new Property("Man of La Mancha", PropertyType.VOLUNTEERISM, 180));
        list.add(new Property("Mr. Sullivan", PropertyType.EDUCATION, 350));
        list.add(new Property("Mr. McCallister", PropertyType.EDUCATION, 350));
        
        return list;
    }
    
}
