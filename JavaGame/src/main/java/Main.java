import game.java.models.Inventory;
import game.java.models.Item;
import game.java.models.LifePotion;
import game.java.models.Player;

public class Main {
    static void main() {
        Player player = new Player(100, 3, 3);

        Inventory inv = player.getInventory();

        LifePotion lifePotion = new LifePotion();
        inv.addItem(lifePotion, 0, 0);

        inv.display();

        lifePotion.healPlayer(player);

        inv.display();
    }
}
