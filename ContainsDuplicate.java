import java.util.*;

public class ContainsDuplicate {
 public boolean containsDuplicate(int[] nums) {
    Set<Integer> numSet = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if(numSet.contains(nums[i])) {
        return true;
      }
      numSet.add(nums[i]);
    }
    return false;
  }

 public static void main(String[] args) {
    ContainsDuplicate solution = new ContainsDuplicate();

    int[] nums1 = {1, 2, 3, 1};
    System.out.println(solution.containsDuplicate(nums1));

    int[] nums2 = {1, 2, 3, 4};
    System.out.println(solution.containsDuplicate(nums2));
  }
}
