import java.util.Scanner;

public class MinMaxPatika {
    public static void main(String[] args) {
        int n, inputVal, i,minVal,maxVal;
        Scanner sc= new Scanner(System.in);
        System.out.print("Kaç Sayı gireceksiniz? ");
        n = sc.nextInt();
        n--;
        System.out.print("Sayı girin: ");
        inputVal = sc.nextInt();
        minVal=inputVal;
        maxVal=inputVal;
        for (i = 0; i < n; i++) {
            System.out.print("Sayı girin: ");
            inputVal = sc.nextInt();
            if(inputVal<minVal){
                minVal=inputVal;
            }else if(inputVal>maxVal){
                maxVal=inputVal;
            }
        }

        System.out.println("minVal: "+minVal);
        System.out.println("maxVal: "+maxVal);

    }
}