import java.util.ArrayList;

public class Inventory {
    private String playerName;
    private ArrayList<Item> items;
    private int maxCapacity;

    public Inventory(String playerName){
        this.playerName = playerName;
        this.items = new ArrayList<>();
        this.maxCapacity = 3;
    }

    public void addItem(Item item){
        if(items.size() != maxCapacity){
            items.add(item);
        }
        else{
            System.out.println("Inventory full");
        }
    }

    public int getTotalValue(){
        int sum = 0;
        for(Item item : items){
            sum += item.getValue();
        }
        return sum;
    }

    public ArrayList<Item> findItemsByType(String query){
        ArrayList<Item> searchResults = new ArrayList<>();

        for(Item item : items){
            if(item.getType().equalsIgnoreCase(query)){
                searchResults.add(item);
            }
        }
        return searchResults;
    }

    public void printInventory(){
        for(Item item : items){
            System.out.println(item);
        }
    }



}
