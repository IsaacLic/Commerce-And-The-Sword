package CommerceAndTheSword;

import CommerceAndTheSword.Monopoly.Property;
import CommerceAndTheSword.Monopoly.PropertyType;

import java.util.HashMap;

public class Player {

    private String name;
    private int money;
    private HashMap<String, Property> ownedProperties;

    public int getPropertyCountOfType(PropertyType type) {
        //TODO
        return 0;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}
