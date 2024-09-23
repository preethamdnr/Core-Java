class X{
    public void show(){
        System.out.println("in show");
    }
}
public class Anony {
    public static void main(String[] args) {
        X obj=new X()
        {
            public void show(){
                System.out.println("in internal show");
            }  
        };
        obj.show();
    }
}
