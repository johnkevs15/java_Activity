public class Vehicle implements Motor {
     String brand;
     public void model(){
        System.out.println("CBR1000RR-R FIREBLADE");
     }
    public void price(){
        System.out.print("Price in the Philippines starts at");
        System.out.println(" P1,500,000.00.");
    }
   
  public void sound(){
    System.out.println("With a deep, sporty sound ");
    System.out.println("Vroom vroom");
  }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
}
