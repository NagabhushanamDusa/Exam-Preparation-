package InfosysExam;

public class TrappingRainWater {
	public static void main(String[] args) {
		int[] arr = {4, 2, 0, 3, 2, 5};
        int left = 0;
        int right = arr.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;
        while (left < right) {
            if (arr[left] < arr[right]) {
                leftMax = Math.max(leftMax, arr[left]);
                water += leftMax - arr[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, arr[right]);
                water += rightMax - arr[right];
                right--;
            }
        }
        System.out.println(water);
	}

}
