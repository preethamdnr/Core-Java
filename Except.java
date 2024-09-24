class PreethamException extends Exception{
    public PreethamException(String str){
        super(str);
    }
}
public class Except {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0){
                throw new PreethamException("This is my excpetion");
            }
        }
        catch(Exception e){
            System.out.println("This is original exception "+ e);
        }
    }
}
