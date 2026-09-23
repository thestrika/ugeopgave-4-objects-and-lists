public class Product {
    private String name;
    private double price;
    private String[] tags;

    public Product(String name, double price, String[] tags){
        this.name = name;
        this.price = price;
        this.tags = tags;
    }

    public void printInfo(){
        System.out.print("Name: " + name + " | Price: " + price + " | tags: ");
        for(int i = 0; i < tags.length; i++){
            System.out.print(tags[i] + ", ");
        }
    }

    public boolean hasTag(String query){
        for(int i = 0; i < tags.length; i++){
            if(tags[i] != null){
                if(tags[i].equals(query)){
                    return true;
                }
            }
        }
        return false;
    }

}
