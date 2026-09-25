public class Item {

    private String name;
    private int value;
    private String type;
    private static int itemsCreated = 0;

    public Item(String name, int value, String type){
        this.name = name;
        this.value = value;
        this.type = type;
        itemsCreated++;
    }

    public String toString(){
        return "Item: " + name + " Value: " + value + " Category: " + type;
    }

    public static int getTotalItemsCreated(){
        return itemsCreated;
    }

    public String getName(){
        return name;
    }
    public int getValue(){
        return value;
    }
    public String getType(){
        return type;
    }

}
