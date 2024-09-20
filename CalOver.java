class Cal{
    public int add(int a, int b){
        return a+b;
    }
}
class AdvCal extends Cal{
    public int add(int a, int b){
        return a+b+10;
    }
}
public class CalOver {
    public static void main(String[] args) {
        AdvCal obj= new AdvCal();
        int r= obj.add(4,5);
        System.out.println(r);
    }
}
