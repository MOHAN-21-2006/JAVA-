class Pen {
    String type ;
    String colour;
    double thickness;
     public void write(){
        System.out.println("Writing Somthing");
     }

     public void printcolour(){
        System.out.println(this.colour);
     }

     public void printthickness(){
        System.out.println(this.thickness); 

     }
}


public class oops{
    public static void main( String args []){
        Pen pen1 = new Pen();
        pen1.type="ballpen";
        pen1.colour="black";
        pen1.thickness=1.25;

        Pen pen2 = new Pen();
        pen2.colour="blue";
        pen2.type="gel";
        pen2.thickness =1.50;

        pen1.printcolour();
        pen2.printcolour();

    }
    
}

