import java.util.Scanner;

public class CiftDortKatlariToplamPatika {
    public static void main(String[] args) {
        int n = 0, total = 0;
        Scanner sc = new Scanner(System.in);
        while (n % 2 == 0) {
            System.out.print("Enter a number: ");
            n = sc.nextInt();
            if (n % 4 == 0) {
                total += n;
            }
            if (n % 2 == 1) {
                total -= n;
            }
        }
        sc.close();
        System.out.println("Total: " + total);
    }
}