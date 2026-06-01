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

    
    
}

public class DefaultConst{
    public static void main(String[] args) {
        human s1 =new human();
        s1.name="mohan";
        s1.age=19;
        s1.rollno=21;

        

        s1.info();
        

    }
}