package DataTypesAndVariables_EXERCISES;

import java.util.Scanner;

public class E08beerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maxVolume = Double.MIN_VALUE;
        String maxModelKeg = "";
        int countKegs = Integer.parseInt(scanner.nextLine());
        for (int keg = 1; keg <= countKegs; keg++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(2 , radius) * height;
            if (volume > maxVolume){
                maxVolume = volume;
                maxModelKeg = model;
            }
        }
        System.out.println(maxModelKeg);
    }
}
