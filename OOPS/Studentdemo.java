class Student{
    String name;
    int age;
    int rollnumber;

    public void printname(){
        System.out.println(this.name);
    }

    public void printage(){
        System.out.println(this.age);
    }

    public void printrollnumner(){
        System.out.println(this.rollnumber);
    }

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.rollnumber);
    }
    Student(String name,int age,int rollnumber) {
        this.name=name;
        this.age=age;
        this.rollnumber=rollnumber;
    }
    

}

public class Studentdemo{
    public static void main(String[] args) {
        Student s1= new Student("mohan",19,21);
        Student s2 =new Student("janvi",14,19);

        s1.printinfo();
        s2.printinfo();
        
    }
}