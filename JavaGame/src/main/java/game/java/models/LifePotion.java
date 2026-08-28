package game.java.models;

public class LifePotion extends Item{
    private int healAmount;

    public LifePotion(){
        super("Life Potion", "Consumable", "A potion that heals when consumed");
        this.healAmount = 60;
    }

    public void healPlayer(Player player) {
        player.receiveHeal(healAmount);

        Inventory inv = player.getInventory();
        inv.removeItem(this.getColumn(), this.getRow());

    }


}
