import java.util.Scanner;

public class PratikNotOrtalamasiProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double math, physics, chemistry, turkish, history, music;
        System.out.print("Grade of Math : ");
        math = input.nextDouble();
        System.out.print("Grade of Physics : ");
        physics = input.nextDouble();
        System.out.print("Grade of Chemistry : ");
        chemistry = input.nextDouble();
        System.out.print("Grade of Turkish : ");
        turkish = input.nextDouble();
        System.out.print("Grade of History : ");
        history = input.nextDouble();
        System.out.print("Grade of Music : ");
        music = input.nextDouble();

        double avg = (math + physics + chemistry + turkish + history + music) / 6.0;
        System.out.println("Average of Lessons : " + avg);

        String result = (avg >= 60) ? "Passed" : "Failed";
        
        System.out.println(result);

        input.close();
    }

}