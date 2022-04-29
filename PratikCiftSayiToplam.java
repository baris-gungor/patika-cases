import java.util.Scanner;

public class PratikCiftSayiToplam {
    public static void main(String[] args) {
        int n,i,total=0,avg,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        // reading the number of elements from the that we want to enter
        n = sc.nextInt();
        sc.close();
        // creates an array in the memory of length 10
        for(i=0;i<n;i++){
            if(i%3==0 && i%4==0){
                total+=i;
                count++;
            }
        }
        count--;
        avg=total/count;
        System.out.println("Total: "+total);
        System.out.println("Count: "+count);
        System.out.println("Avg: "+avg);

        

    }
}