interface A{
    public int show(int a, int b);
}
public class Lamexp {
    public static void main(String[] args) 
    {
       A obj= (a,b) -> a+b;
        
       int result=obj.show(5, 7);
       System.out.println(result);
    }
    
}
