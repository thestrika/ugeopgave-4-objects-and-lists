public class Main {

    //Globale
    Student[] students = new Student[3];
    String studentId;


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







    }



}
