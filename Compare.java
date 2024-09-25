import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
public class Compare {
    public static void main(String[] args) {
        Comparator<Integer>com= new Comparator<Integer>() 
        {
            public int compare(Integer i, Integer j){
                if(i%10>j%10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
        List<Integer>n = new ArrayList<>();
        n.add(21);
        n.add(79);
        n.add(54);
        n.add(27);

        Collections.sort(n,com);
        System.out.println(n);
    }
}
