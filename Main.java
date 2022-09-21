public class Main{
    public static void main(String[] args) {
    
        Vehicle n = new Vehicle();
        n.setBrand("Honda");
        System.out.println(n.getBrand());
        Vehicle motor=new Motor();
        motor.sound();
    }
   }