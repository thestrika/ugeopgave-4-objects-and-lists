public class Main {

    //Globale
    private Student[] students = new Student[3];
    private String studentId;


    //Metoder
    public Student findStudent(String query){
        System.out.println("===SEARCH===");
        for(int i = 0; i < students.length; i++){
            if(students[i] != null){
                if(students[i].getId().equals(query)){
                    System.out.println("Search query " + "'" + query + "'" + " returned a result!");
                    return students[i];
                }
            }
        }
        System.out.println("No results for query " + "'" + query + "'");
        return null;
    }


    public void main(String[] args){

        //Opgave 1
        students[0] = new Student("Jacob", 22, "ABC");
        students[1] = new Student("James", 25, "DEF");
        students[2] = new Student("Oliver", 21, "GHI");

        Student max = students[0];
        for(int i = 0; i < students.length; i++){
            students[i].printInfo();
            System.out.println("=========");
            if(max.getAge() < students[i].getAge()){
                max = students[i];
            }
        }
        System.out.println("===Oldest===");
        max.printInfo();

        Student search = findStudent("DEF");
        if(search != null){
            search.printInfo();
        }



        //Opgave 2
        Product pc = new Product("PC", 4000, new String[] {"sale", "electronics", "budget"});
        Product iphone = new Product("iPhone", 7000, new String[] {"latest", "apple", "hype"});
        Product macbook = new Product("MacBook", 9000, new String[] {"sale", "electronics", "apple"});
        Product ipad = new Product("iPad", 5000, new String[] {"sale", "apple", "budget"});
        Product[] products = new Product[]{pc, iphone, macbook, ipad};

        System.out.println();
        System.out.println("Products with search query:");
        for(Product product : products){
            if(product.hasTag("sale")){
                product.printInfo();
                System.out.println();
            }
        }

        //Opgave 3
        BankAccount account1 = new BankAccount("James", 300);
        account1.deposit(3000);
        account1.deposit(1400);
        account1.deposit(2000);
        account1.withdraw(750);
        account1.withdraw(800);
        account1.printTransactionHistory();

        System.out.println("FINAL BAL: " + account1.getBalance());
        System.out.println(account1.getLargestTransaction());

        //opgave 4
        Team team1 = new Team("Team 1");
        Player player1 = new Player("Harry Potter", 33);
        Player player2 = new Player("Logan Paul", 47);
        Player player3 = new Player("Jack Daniels", 76);
        team1.addPlayer(player1);
        team1.addPlayer(player2);
        team1.addPlayer(player3);


        Team team2 = new Team("Team 2");
        Player player4 = new Player("Jake Paul", 89);
        Player player5 = new Player("James Bond", 63);
        Player player6 = new Player("David Guetta", 68);
        team2.addPlayer(player4);
        team2.addPlayer(player5);
        team2.addPlayer(player6);


        team1.printTeam();
        team2.printTeam();

        team1.compete(team2);

        team1.printBestPlayer();
        team2.printBestPlayer();

        //Opgave 5




    }



}
