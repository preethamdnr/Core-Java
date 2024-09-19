class Family{
    private String name;
    private int age;

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
public class encap {
    public static void main(String a[]){
       Family obj=new Family();
        obj.setname("Preetham");
        obj.setage(24);
        System.out.println(obj.displayname()+" "+obj.displayage());
    }
}
