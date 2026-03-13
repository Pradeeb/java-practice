import java.util.HashSet;
import java.util.Set;
public class Test {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 5,7, 5};

        Set<Integer> set=new HashSet<>();

        for(int num:nums){

            if(!set.add(num)){

                System.out.println("duplicate");
            }
        }


    }
    
}
