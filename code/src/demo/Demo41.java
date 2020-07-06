package demo;

import java.util.HashMap;
import java.util.Map;

public class Demo41 {

    public static void main(String[] args) {
        int[] nums={3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        int result=1;
        Map<Integer,Integer> map=new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(result)){
                result++;
            }else {
                return result;
            }
        }
        return result;
    }
}
