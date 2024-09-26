import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class Streamm {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(4,5,6,7,8,9,0); 
        
        Stream<Integer>sv=num.stream()
                    .filter(n->n%2==0)
                    .sorted();
        sv.forEach(n->System.out.println(n));
       
    }
}
