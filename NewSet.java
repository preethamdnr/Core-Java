import java.util.Set;
import java.util.TreeSet;
public class NewSet {
    public static void main(String[] args) {
       Set<Integer> nums= new TreeSet<Integer>();

       nums.add(11);
       nums.add(66);
       nums.add(67);
       nums.add(52);
       nums.add(60);
       nums.add(46);
       nums.add(2);
       nums.add(3);
       nums.add(4);

        for(int n:nums)
        {
            System.out.println(n);

        }            
    }
}
