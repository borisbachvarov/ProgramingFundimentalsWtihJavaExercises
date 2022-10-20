package DataTypesAndVariables_EXERCISES;

import java.util.Scanner;

public class E02sumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. vhodni danni
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (n >0){
            int lastDigit = n %10;
            sum+=lastDigit;
            n = n /10;
        }
        System.out.println(sum);
    }
}
