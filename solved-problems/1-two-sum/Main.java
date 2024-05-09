// My code

import java.util.Arrays;

class Solution {
  public static int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (i != j && nums[i] + nums[j] == target) {
          result[0] = j;
          result[1] = i;
          break;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(twoSum(new int[] { 3, 2, 4 }, 6)));
  }
}
