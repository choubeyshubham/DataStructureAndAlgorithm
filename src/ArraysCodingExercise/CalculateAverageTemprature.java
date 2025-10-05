package ArraysCodingExercise;

import java.util.Scanner;

public class CalculateAverageTemprature {
    /*


     */

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("How many day's temperature: ");
        int numDays=console.nextInt();
        //record tempraure and find average
        int[] temps = new int[numDays];
        int sum =0;
        for (int i = 0; i < numDays; i++) {
            System.out.println("Day "+i+"'s high temp: ");
//            int next = console.nextInt();
            temps[i]=console.nextInt();
            sum+=temps[i];
        }

        double average = (double) sum /numDays;
        int above=0;
        for (int temp : temps) {
            if (temp < average) {
                above++;
            }
        }
        System.out.println(above+ " days above average");
        System.out.println();
        System.out.println("Average Temp = "+average);

        System.out.println("===================");
        for (int s:temps){
            System.out.print(s+" ");
        }


    }


}
