import java.util.Scanner;

public class PratikTwoPowerPatika {
    public static void main(String[] args) {
        int n = 0, dortkat = 4, beskat = 5, ikikat = 2, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        n--;
        sc.close();
        for (i = 0; i < n; i++) {
            ikikat *= 2;
            dortkat *= 4;
            beskat *= 5;
        }
        System.out.println("Total: " + ikikat);
        System.out.println("Total: " + dortkat);
        System.out.println("Total: " + beskat);
    }
}