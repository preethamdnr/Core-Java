enum Laptop{
    Macbook, Windows, Surface, Thinkpad;
    private int price;
    private Laptop(){
        price=1000;
    }    
    private Laptop(int price){
        this.price=price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
}
public class Enum {
    public static void main(String[] args) {
            for(Laptop lap: Laptop.values()){
                System.out.println(lap+":"+lap.getPrice());
            }
        }
    }
