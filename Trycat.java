public class Trycat {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        String str=null;
        try{
            j=18/i;
            System.out.println(str.length());
        }
        catch(ArithmeticException e){
            System.out.println("Arethmatic error. "+ e);
        }
        catch(Exception e){
            System.out.println("Something went wrong...");
        }
        
        System.out.println(j);
    }
}
