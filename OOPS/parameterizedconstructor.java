class human{
    String name;
    int age;
    int rollno;

    public void rollno() {
        System.out.println(this.rollno);
    }

    public void name(){
        System.out.println(this.name);
    }

    public void age(){
        System.out.println(this.name);
    }

    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.rollno);
        
    }

    human(String name,int age,int rollno){
        this.name = name;
        this.age= age ;
        this.rollno=rollno;
    }
    
}

public class parameterizedconstructor{
    public static void main(String[] args) {
        human s1=new human("mohan",19,21);
        human s2=new human("janv",14,19);
        

        

        s1.info();
        s2.info();

    }
}