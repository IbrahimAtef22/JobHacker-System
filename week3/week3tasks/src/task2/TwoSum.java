package week3.week3tasks.src.task2;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array elements:");
        int size = input.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++){
            nums[i] = input.nextInt();
        }

        System.out.println("Enter target:");
        int target = input.nextInt();

        int[] indices = twoSum(nums, target);
        System.out.println(Arrays.toString(indices));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];

        for (int i = 0; i < nums.length; i++){
            for (int j = i +1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        return indices;
    }
}
