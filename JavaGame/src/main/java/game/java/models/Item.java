package game.java.models;

public class Item {
    private String name;
    private String category;
    private String description;
    private int column = -1;
    private int row = -1;

    public Item(String name, String category, String description) {
        this.name = name;
        this.category = category;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setPosition(int column, int row) {
        this.column = column;
        this.row = row;
    }

    public int getColumn(){
        return this.column;
    }

    public int getRow(){
        return this.row;
    }

    public void clearPosition() {
        this.column = -1;
        this.row = -1;
    }
}
