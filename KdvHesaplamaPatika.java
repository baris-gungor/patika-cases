import java.util.Scanner;

public class KdvHesaplamaPatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inputVal, kdvVal, inputkdvVal, totalVal;
        System.out.println("Tutarı girin: ");
        inputVal = input.nextDouble();
        if (inputVal >= 0 && inputVal <= 1000) {
            kdvVal = 0.18;
            inputkdvVal = inputVal * kdvVal;
            totalVal = inputVal + inputkdvVal;
            System.out.println("Tutar: " + inputVal + " tl");
            System.out.println("KDV oranı: " + kdvVal + "%");
            System.out.println("KDV tutarı: " + inputkdvVal + " tl");
            System.out.println("Toplam tutar: " + totalVal + " tl");
        } else if (inputVal > 1000) {
            kdvVal = 0.08;
            inputkdvVal = inputVal * kdvVal;
            totalVal = inputVal + inputkdvVal;
            System.out.println("Tutar: " + inputVal + " tl");
            System.out.println("KDV oranı: " + kdvVal + "%");
            System.out.println("KDV tutarı: " + inputkdvVal + " tl");
            System.out.println("Toplam tutar: " + totalVal + " tl");
        } else {
            System.out.println("Hata");
        }

        input.close();
    }

}