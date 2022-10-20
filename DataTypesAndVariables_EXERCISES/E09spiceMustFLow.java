package DataTypesAndVariables_EXERCISES;

import java.util.Scanner;

public class E09spiceMustFLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//програма която пресмята общия брой подправки събрани от източника
        //след като the yield e събирана цял ден се намаля с 10  -> startingYield - 10
        //
        int startingYield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int totalSpiceAmount = 0;
        while (startingYield >= 100){
            int spices = startingYield - 26;
            totalSpiceAmount += spices;
            days++;

            startingYield = startingYield - 10;
        }
        System.out.println(days);
        if (totalSpiceAmount >= 26){
            totalSpiceAmount -= 26;
        }
        System.out.println(totalSpiceAmount);
    }
}
