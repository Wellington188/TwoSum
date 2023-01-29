import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TwoSum{


    public static List<Integer> twoSumList(int[] nums, int target){
        List<Integer> arrList = new ArrayList<>();
        for(int i=0; i < nums.length; i++){
            for(int j=0; j < nums.length; j++){
                if(nums[i] + nums[j] == target && i != j){
                    arrList.add(i,j);
                    System.out.println(arrList);
                }
            }
        }return arrList;


    }

    public static void hash(int[] nums, int target){
        HashMap<Integer,Integer> mapa=new HashMap<Integer, Integer>();
    

        for (int i=0; i<nums.length; i++) {
            mapa.put(i, nums[i]);
            int targetMinusValue = target - nums[i];

            if(mapa.containsValue(targetMinusValue)){
                mapa.put(i, nums[i]);
                System.out.println(mapa);
            } 
        }
    
    }
    public static void main(String[] args) {
        int[] list = {2,7,11,15};
        int[] list2 = {3,2,4};
        int[] list3 = {3,3};

        hash(list,26);
    }
}