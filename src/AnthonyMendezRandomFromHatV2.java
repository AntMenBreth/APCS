import java.util.Scanner;

public class AnthonyMendezRandomFromHatV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many teams?");
        //Get's user input for how many teams
        int numbteams = scan.nextInt();
        //Creates Scanner for the teams
        int[] matchup = new int[numbteams];
        //Determines whether the # of teams is worthy
        if (numbteams % 2 != 0) {
            System.out.println("No odd number of Teams!");
            System.out.println("How many teams?");
            numbteams=scan.nextInt();
        }
        //Worthy teams only enter this else statement
        else {
            //Both for testing whether the numbers were used in the array
            int temp = 0;
            int tempp = 0;
            //For telling the array where different numbers should be placed
            int x = 0;
            //For calculating when the program should end
            int fin = 0;
            //While loop containing the main code
            while (fin != numbteams / 2) {
                temp = calc(numbteams);
                tempp = calc(numbteams);
                //Checks if either number was used prior
                if (tf(matchup, temp) == false) {
                } else if (tf(matchup, tempp) == false) {
                }
                //Checks if numbers are the same
                else if (temp == tempp) {
                }
                //Sets up array for the next set of teams & prints the teams versing each other
                else {
                    matchup[x] = temp;
                    matchup[(x + 1)] = tempp;
                    x = x + 2;
                    System.out.println(temp + " vs " + tempp);
                    fin++;
                }
            }
        }
    }

    //Calculates a number between 1-numbteams
    public static int calc(int numbteams) {
        int randomSize = (int) (Math.random() * ((numbteams - 1) + 1)) + 1;
        return randomSize;
    }

    //Scans array for numbers already given a place
    public static boolean tf(int[] array, int temp) {
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (temp == array[i]) {
                x = 1;
            }
        }
        if (x == 0) {
            return true;
        } else {
            return false;
        }
    }
}