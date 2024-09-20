class A{
    public A(){
        super();
        System.out.println("I am in default A");
    }
    public A(int age){
        super();
        System.out.println("I am in Parameterized A");
    }
}
class B extends A{
    
    public B(){
        super();
        System.out.println("I am in B Default");
    }
    public B(int age){
        this();
        System.out.println("I am in B Parameterized");
    }
   

}
public class Superc {
    public static void main(String a[]){
        B obj= new B(12);
        
    }
}
