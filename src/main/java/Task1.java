import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {

    public static String formTown (String [] cities) {

        String town = "";

        for (int i = 0; i < cities.length; i++) {
            if (i == cities.length - 1) {
                town += cities[i] + ". ";
            }
            else {
                town += cities[i] + ", ";
            }

        }

        return town;
    }

    public static void main(String args[]) {
        String[] s = new String[10];
        s[0] = "Москва";
        s[1] = "Токио";
        s[2] = "Париж";
        s[3] = "Киев";
        s[4] = "Вашингтон";
        s[5] = "Санкт-Петербург";
        s[6] = "Краснодар";
        s[7] = "Ржев";
        s[8] = "Севастополь";
        s[9] = "Симферополь";

        System.out.println(formTown(s));

    }
}