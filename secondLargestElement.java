package InfosysExam;

public class secondLargestElement {
	public static void main (String args[]) {
		int[] arr = {10, 5, 20, 8, 20};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest");
        } else {
            System.out.println(second);
        }
	}

}
