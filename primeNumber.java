package InfosysExam;

public class primeNumber {
	public static void main (String args[]) {
	    int n = 7;
        boolean prime = n > 1;

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        System.out.println(prime ? "Prime" : "Not Prime");
	}

}
