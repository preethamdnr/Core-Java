interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("Coding in Laptop");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Coding in Desktop");
    }
}
class Developer{
    public void devApps(Computer desk){
        desk.code();

    }
}
public class Inter {
    public static void main(String[] args) {
        Laptop lap= new Laptop();
        Desktop desk= new Desktop();
        Developer dev= new Developer();
     dev.devApps(desk);   
    }
}
