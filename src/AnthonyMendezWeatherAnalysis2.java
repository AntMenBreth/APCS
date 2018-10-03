import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AnthonyMendezWeatherAnalysis2 {
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
        }

        //Calculates Average Temp
        double avgfin = temp(dayz, days);
        //Calculates how many days were above average
        int abvav = AboveAverage(dayz, avgfin);
        //Print Statements: 1-Prints Average Temp   2-Prints # of days above average
        System.out.println("Average temp = " + f.format(avgfin));
        System.out.println(abvav + " days were above average.");
        System.out.println();
        System.out.println("Temperatures:"+Arrays.toString(dayz));
        //Calculates Two Coldest Days and Prints Them
        ColdestDays(dayz);
        //Calculates Hottest Two Days and Prints Them
        HottestDays(dayz);

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
    public static int AboveAverage(int[] dayz, double avgfin) {
        //Code for Calculating how many days above average
        int abvav = 0;
        for (int i = 0; i < dayz.length; i++) {
            if (dayz[i] > avgfin) {
                abvav += 1;
            }

        }
        return abvav;

    }
    public static void HottestDays(int[] dayz) {
        //Code for Calculating the hottest day
        int hottest = 0;
        int second=0;
        for (int i = 0; i < dayz.length; i++) {
            if (dayz[i] > hottest) {
                second=hottest;
                hottest=dayz[i];
            }


        }
        System.out.println("Two hottest days: "+hottest+", "+second);
    }
    public static void ColdestDays(int[] dayz) {
        //Code for Calculating the hottest day
        int hottest = 100000000;
        int second = 1000000000;
        for (int i = 0; i < dayz.length; i++) {
            if (dayz[i] < hottest) {
                second = hottest;
                hottest = dayz[i];
            }

        }
        System.out.println("Two coldest days: " + hottest + ", " + second);
    }
}
