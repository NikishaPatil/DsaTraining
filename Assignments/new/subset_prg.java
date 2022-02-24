import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset_prg {
    public static void main(String[] args) {
        subset_prg s = new subset_prg();
        int[] nums = {1, 2,3,4};
        List<List<Integer>> subsets = s.subsets(nums);

        for (List<Integer> subset: subsets) {
            System.out.println(subset);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        subsetsgenerator(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void subsetsgenerator(List<List<Integer>> list , List<Integer> resultList, int [] nums, int start){
        list.add(new ArrayList<>(resultList));
        for(int i = start; i < nums.length; i++){
            resultList.add(nums[i]);
            subsetsgenerator(list, resultList, nums, i + 1);
            resultList.remove(resultList.size() - 1);
        }
    }

}
