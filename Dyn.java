class A{
    public  void show(){
        System.out.println("I am in A");
    }
}
class B extends A{
    public  void show(){
        System.out.println("I am in B");
    }
    
}
class C extends A{
    public  void show(){
        System.out.println("I am in C");
    }
}
public class Dyn {
 public static void main(String[] args) {
    A obj = new C();
    obj.show(); 
 }   
}
