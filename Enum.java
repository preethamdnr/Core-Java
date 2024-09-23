enum Status{
    Running, Failed, Pending, Success;
}
public class Enum {
    public static void main(String[] args) {
        Status s= Status.Failed;
        switch (s) {
            case Success:
                System.out.println("Done");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Running:
                System.out.println("It is working");
                break;
            default:
                System.out.println("Please wait");
                break;
        }
    }
}
