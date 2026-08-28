package game.java.menus;

import game.java.models.LifePotion;
import game.java.models.Player;

import java.util.Scanner;

public class MainMenu {
    private Player player;
    private Scanner scanner;
    private int option;

    public MainMenu() {
        this.scanner = new Scanner(System.in);
    }

    public int beginGame() {
        System.out.println("\n╔════════════════════════════════════════════════════════╗");
        System.out.println("║                    WELCOME!                            ║");
        System.out.println("╚════════════════════════════════════════════════════════╝");

        System.out.println("You want to begin the game?");
        System.out.println("1 - YES!");
        System.out.println("2 - No.");
        option = scanner.nextInt();

        if (option == 1) {
            return 1;
        } else {
            return 0;
        }

    }

    public void introduction(Player player) {
        System.out.println("You are a mage apprentice");
        System.out.println("You begin you journey with a life potion and nothing more");
        LifePotion lifePotion = new LifePotion();
        player.getInventory().addItem(lifePotion, 0, 0);
    }

    public void mainMenu(Player player) {
        do {
            System.out.println("\n╔════════════════════════════════════════════════════════╗");
            System.out.println("║                    M A I N   M E N U                   ║");
            System.out.println("╠════════════════════════════════════════════════════════╣");
            System.out.println("║  1. View Inventory                                     ║");
            System.out.println("║  2. Use Item                                           ║");
            System.out.println("║  3. View Player Stats                                  ║");
            System.out.println("║  4. Leave Game                                         ║");
            System.out.println("╚════════════════════════════════════════════════════════╝");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    player.getInventory().display();
                    break;
                case 2:
                    //;
                    break;
                case 3:
                    //;
                    break;
                case 4:
                    leave();
                    break;
                default:
                    System.out.println("Invalid number, try again!");
            }
        } while (option != 4);
    }

    public void leave(){
        System.out.println("\n╔════════════════════════════════════════════════════════╗");
        System.out.println("  ║                    GAME OVER!                          ║");
        System.out.println("  ║                                                        ║");
        System.out.println("  ║                 THANK YOU FOR PLAY!                    ║");
        System.out.println("  ╚════════════════════════════════════════════════════════╝");
    }
}
