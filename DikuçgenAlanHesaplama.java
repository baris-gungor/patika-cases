import java.util.Scanner;

public class DikuçgenAlanHesaplama {
    public static void main(String[] args) {

        // Değişken Atamaları
        double a, b;
        double c;

        Scanner inp = new Scanner(System.in);

        System.out.println("Yatay Kenari Giriniz: ");
        a = inp.nextDouble();

        System.out.println("Dikey Kenari Giriniz: ");
        b = inp.nextDouble();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenus Degeri: " + c);

        // Çevre Hesabı Formulu
        // Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        // 𝑢 = (a+b+c) / 2
        // Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

        double u, alan;

        u = (a + b + c);
        System.out.print("Ucgenin Cevresi: ");
        System.out.println(u);

        // Dik üçgen alan hesabı
        alan = (a * b) / 2;
        System.out.println("Ucgenin Alani: " + alan);
        inp.close();

    }

}