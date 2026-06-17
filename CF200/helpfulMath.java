import java.util.*;
public class helpfulMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\+");
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(nums);
        System.out.print(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            System.out.print("+" + nums[i]);
        }
    }
}