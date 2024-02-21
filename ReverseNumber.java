import java.util.Scanner;

public class ReverseNumber {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, ans=0, rem;
        
        n = scanner.nextInt();

        while (n > 0) {
            rem = n % 10;
            // (ans * 10) + rem;
            ans = (ans * 10) + rem;

            n /= 10;
        }

        System.out.println(ans);
        
        scanner.close();
    }
}
