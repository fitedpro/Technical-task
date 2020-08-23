public class Task3_2 {
        public static String round (int value) {
            String result = "";
            int number = 0;

            if (value > 100) {
                number += value % 100;
                number = number % 10;
            }

            if (value > 10) {
                number = value % 10;
            }

            if (number == 0) {
                result = value + " компьютеров";
            }

            if (number == 1) {
                result = value + " компьютер";
            }

            if ((number >= 2) && (number <= 4)){
                result = value + " компьютера";
            }

            if ((number >= 5) && (number <= 9)){
                result = value + " компьютеров";
            }

            return result;
        }

        public static void main(String args[]) {
            int s = 25;
            System.out.println(round(s));
            int s1 = 41;
            System.out.println(round(s1));
            int s2 = 1048;
            System.out.println(round(s2));
        }
    }