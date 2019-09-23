import java.util.HashMap;

public class Player {

    private String name;
    private int money;
    private HashMap<String, Property> ownedProperties;

    public int getPropertyCountOfType(PropertyType type) {
        //TODO
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}
