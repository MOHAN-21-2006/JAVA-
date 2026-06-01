class human{
    String name;
    int age;
    int rollno;

    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.rollno);
        
    }

    human(human h2){
        this.name=h2.name;
        this.age=h2.age;
        this.rollno=h2.rollno;
        
    }
    
    human(){
        
    }
}

public class CopyConst{
    public static void main(String[] args) {
        human h1 = new human();
        h1.name="mohan";
        h1.age=19;
        h1.rollno=21;

        human h2=new human(h1);
        

        

        h2.info();
        

    }
}