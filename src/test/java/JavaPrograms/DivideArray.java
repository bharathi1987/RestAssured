import java.util.Arrays;

public class DivideArray {

    public static int[] divideArray(int[] nums) {
        Arrays.sort(nums);

        int sumA = 0;
        int sumB = 0;
        int[] subsetA;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (sumA <= sumB) {
                sumA += nums[i];
            } else {
                break;
            }
        }

        int intersectionIndex = nums.length - (nums.length - sumA);

        if (intersectionIndex < nums.length - 1 && nums[intersectionIndex] == nums[nums.length - 1]) {
            // Move the intersection index to the last occurrence of the maximum element
            while (intersectionIndex < nums.length - 1 && nums[intersectionIndex] == nums[intersectionIndex + 1]) {
                intersectionIndex++;
            }
        }

        subsetA = Arrays.copyOfRange(nums, intersectionIndex, nums.length);
        Arrays.sort(subsetA);

        return subsetA;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 6, 6, 7, 7, 7, 7, 8, 7, 7};
        int[] result = divideArray(arr);

        System.out.println("Subset A: " + Arrays.toString(result));
    }
}
