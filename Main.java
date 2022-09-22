public class Main{
    public static void main(String[] args) {
    
        Vehicle n = new Vehicle();
        n.setBrand("Honda");
        System.out.println(n.getBrand());
        n.model();
        n.price();
        n.sound();
    }
   }