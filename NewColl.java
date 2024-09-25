import java.util.ArrayList;
import java.util.List;
public class NewColl {
    public static void main(String[] args) {
       List<Integer> nums= new ArrayList<Integer>();
       nums.add(1);
       nums.add(2);
       nums.add(3);
       nums.add(4);
       nums.add(5);
       nums.add(6);
       nums.add(6);
    //    System.out.println(nums.get(3));
        for(Object n:nums)
        {
            int nu=(Integer)n;
            System.out.println(nu);

        }            
    }
}
