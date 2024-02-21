import java.util.Scanner;

public class CountingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            if (rem == k) {
                count = count + 1;

            }
            n /= 10;
        }
        System.out.println(count);
        scanner.close();
    }
}
