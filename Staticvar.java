class Mobile{
    String brand;
    String color;
    static int price;

    public void display(){
        System.out.println(brand+":"+color+":"+price);
    }
    public Mobile(){
        brand="";
        price=200;
        System.out.println("I am in constructor");

    }
    static{
        price=200;
        System.out.println("this is static block");
    }
}

public class Staticvar {
    public static void main(String a[]) throws ClassNotFoundException{
        Class.forName("Mobile");
        Mobile obj= new Mobile();
        obj.brand="Apple";
        obj.color="Black";
        Mobile.price=1500;

        Mobile obj1= new Mobile();
        obj1.brand="Apple";
        obj1.color="Black";
        Mobile.price=1200;
        obj.display();
        obj1.display();


    }
}
