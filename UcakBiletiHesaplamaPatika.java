import java.util.Scanner;

public class UcakBiletiHesaplamaPatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distance, age, journey;
        double price = 0;
        System.out.print("Mesafeyi km türünden giriniz :");
        distance = input.nextInt();
        System.out.println(distance%12);
        System.out.print("Yasınızı giriniz :");
        age = input.nextInt();
        System.out.print("(1 => Tek Yön , 2 => Gidis Dönüs )\nYolculuk tipini giriniz: ");
        journey = input.nextInt();
        input.close();

        if ((journey == 1 || journey == 2) && 0 < age && 0 < distance) {
            price = distance * 0.10;
            if (age < 12)
                price -= (price * 0.50);
            else if (12 <= age && age <= 24)
                price -= (price * 0.10);
            else if (age > 65)
                price -= (price * 0.30);

            if (journey == 2)
                price = 2 * (price - price * 0.20);
            System.out.println(price + "TL");
        } else {
            System.out.println("Hatalı veri girdiniz!");

        }
    }
}