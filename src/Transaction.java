public class Transaction {
    private String type;
    private double amount;

    Transaction(String type, double amount){
        this.type = type;
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }

    public String toString(){
        return "| Type: " + type + " | Amount: " + amount + "|";
    }

}
