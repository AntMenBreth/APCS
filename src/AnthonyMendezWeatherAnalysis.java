import java.util.Scanner;
import java.text.DecimalFormat;
public class AnthonyMendezWeatherAnalysis {
    public static void main(String[] args) {

        DecimalFormat f = new DecimalFormat("00.0");
        //Get's user input and prints it while storing data
        Scanner scan = new Scanner(System.in);
        System.out.print("How many days temperatures? ");
        int days = scan.nextInt();
        int[] dayz = new int[days];
        for (int i = 0; i < dayz.length; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            dayz[i] = scan.nextInt();
            System.out.println();
        }
        //Calculates Average Temp
        double avgfin = temp(dayz, days);
        //Calculates how many days were above average
        int abvav = aboveaverage(dayz, avgfin);
        //Print Statements: 1-Prints Average Temp   2-Prints # of days above average
        System.out.println("Average temp = " + f.format(avgfin));
        System.out.println(abvav + " days were above average.");
    }
    public static double temp(int[] dayz, int days) {
        //Code for Calculating Average Temp
        double avg = 0;
        for (int i = 0; i < dayz.length; i++) {
            avg = avg + dayz[i];
        }
        double avgfin = avg / days;
        return avgfin;

    }
    public static int aboveaverage(int[] dayz, double avgfin) {
        //Code for Calculating how many days above average
        int abvav = 0;
        for (int i = 0; i < dayz.length; i++) {
            if (dayz[i] > avgfin) {
                abvav += 1;
            }

        }
        return abvav;

    }
}
