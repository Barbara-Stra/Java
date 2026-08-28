package game.java.models;

public class Player {
    private int life;
    private Inventory inventory;

    public Player(int life, int inventoryColumns, int inventoryRows) {
        this.life = life;
        this.inventory = new Inventory(inventoryColumns, inventoryRows);
    }

    private void setLife(int life) {
        this.life = life;
    }

    protected void receiveHeal(int healAmount) {
        setLife(healAmount);
    }

    public int getLife() {
        return life;
    }

    public Inventory getInventory() {
        return inventory;
    }

}
