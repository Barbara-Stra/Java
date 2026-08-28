import game.java.menus.MainMenu;
import game.java.models.Inventory;
import game.java.models.Item;
import game.java.models.LifePotion;
import game.java.models.Player;

public class Main {
    static void main() {

        MainMenu mainMenu = new MainMenu();

        int option = mainMenu.beginGame();
        if (option == 1) {
            Player player = new Player(2, 2);
            mainMenu.introduction(player);
            mainMenu.mainMenu(player);
        }

    }
}
