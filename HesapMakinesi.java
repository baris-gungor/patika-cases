import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        // Değişken Atamaları
        int select;
        double firstInput, secondInput;
        // scanner
        Scanner inp = new Scanner(System.in);
        // km giriş
        System.out.println("Birinci sayıyı giriniz: ");
        firstInput = inp.nextDouble();
        System.out.println("Ikinci sayıyı giriniz: ");
        secondInput = inp.nextDouble();
        System.out.println("\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("\nIslemi giriniz: ");
        select = inp.nextInt();
        // hesaplamalar ve sonuç
        switch (select) {
            case 1:
                System.out.println("Toplam sonucu: "+(firstInput+secondInput));
                break;
            case 2:
                System.out.println("Çıkarma sonucu: "+(firstInput-secondInput));
                break;
            case 3:
                System.out.println("Çarpma sonucu: "+(firstInput*secondInput));
                break;
            case 4:
                System.out.println("Bölme sonucu: "+(firstInput/secondInput));
                break;
            default:
            System.out.println("Hata");
        }
        inp.close();

    }

}