import java.util.Scanner;

public class PratikUsluSayiPatika {
    public static void main(String[] args) {
        int n = 0, uslusayi = 0, i, sonuc = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        uslusayi = sc.nextInt();
        System.out.print("Üssünü girin: ");
        n = sc.nextInt();
        sc.close();
        for (i = 0; i < n; i++) {
            sonuc *= uslusayi;
        }
        System.out.println("Sonuc: " + sonuc);
    }
}