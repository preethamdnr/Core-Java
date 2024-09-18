class Operations{
    public int add(int x, int y){
        int r=x+y;
        return r;
    }
    public int sub(int x,int y){
        int r=x-y;
        return r;
    }
}
public class CalcDevice {
    public static void main(String args[]){
        int num1=5;
        int num2=10;
        Operations obj=new Operations();
        int sum=obj.add(num1,num2);
        int diff=obj.sub(num1,num2);
        System.out.println(sum);
        System.out.println(diff);
    }
}
