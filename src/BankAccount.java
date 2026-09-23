import java.util.ArrayList;

public class BankAccount {
    private String owner;
    private double balance;
    private ArrayList<Transaction> transactions;

    BankAccount(String owner, double startBalance){
        this.owner = owner;
        this.balance = startBalance;
        this.transactions = new ArrayList<>();
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
        transactions.add(new Transaction("deposit", amount));
        System.out.println("_________________________________________________________________");
        System.out.println("+++ | Successfully deposited " + amount + "| new balance: " + balance);
    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            transactions.add(new Transaction("withdraw", amount));
            System.out.println("_________________________________________________________________");
            System.out.println("--- | Successfully withdrawed " + amount + " | new balance: " + balance);
        }
        else{
            System.out.println("Error: balance too low");
        }
    }

    public void printTransactionHistory(){
        System.out.println();
        System.out.println("=======TRANSACTION HISTORY=======");
        for(Transaction transaction : transactions){
            System.out.println(transaction);
        }
        System.out.println("=========END OF HISTORY=========");
    }

    public Transaction getLargestTransaction(){
        System.out.println("=========LARGEST TRANSACTION=========");
        int transactionSize = transactions.size();
        Transaction largest = transactions.get(0);
        for(int i = 0; i < transactionSize; i++){
            if(largest.getAmount() < transactions.get(i).getAmount()){
                largest = transactions.get(i);
            }
        }
        return largest;
    }


}
