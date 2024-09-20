class Family{
    private String name;
    private int age;

    public Family(){
        name="Dongari";
        age=100; 
    }
    public Family(String name,int age){
        this.name=name;
        this.age=age; 
    }
    public void setname(String name){
        this.name=name;
    }
    public void setage(int age){
        this.age=age;
    }
    public String displayname(){
        return name;
    }
    public int displayage(){
        return age;
    }
}
public class construct {
    public static void main(String a[]){
       Family obj=new Family();
       Family obj1=new Family("Gowtham",29);
        // obj.setname("Preetham");
        // obj.setage(24);
        System.out.println(obj.displayname()+" "+obj.displayage());
        System.out.println(obj1.displayname()+" "+obj1.displayage());
    }
}
