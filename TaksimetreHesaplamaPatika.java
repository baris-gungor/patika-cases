import java.util.Scanner;

public class TaksimetreHesaplamaPatika {
    public static void main(String[] args) {
        // Değişken Atamaları
        double km, minfee = 20, openfee = 10, fee = 2.20, total, payment;
        // scanner
        Scanner inp = new Scanner(System.in);
        // km giriş
        System.out.println("KM Giriniz: ");
        km = inp.nextDouble();
        total = km * fee + openfee;
        // hesaplamalar ve sonuç
        if (total > minfee) {
            payment = total;
            System.out.println("Yol ücreti: " + payment + "tl");
        } else if (minfee > total) {
            payment = minfee;
            System.out.println("Yol ücreti: " + payment + "tl");
        } else {
            System.out.println("Hata");
        }

        inp.close();

    }

}