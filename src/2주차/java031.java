import java.io.*;
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];

        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    output[0] = i;
                    output[1] = j;
                    break;
                }
            }
        }
        System.out.println(output[0] + " " + output[1]);
        return output;
    }
}

public class java031{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Solution solution = new Solution();
        String nums = br.readLine();
        String[] numsArray = nums.split(", ");

        int[] array = Arrays.stream(numsArray).mapToInt(Integer::parseInt).toArray();

        int target = Integer.parseInt(br.readLine());
        solution.twoSum(array, target);

        br.close();
    }
}