package Java.arrays;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbersSet=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(numbersSet.contains(num)){
                return true;
            }
            numbersSet.add(num);
        }
        return false;
    }
}