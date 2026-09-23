public class Student {

    private String name;
    private int age;
    private String studentId;

    Student(String name, int age, String studentId){
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    public int getAge(){
        return age;
    }

    public String getId(){
        return studentId;
    }


    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
