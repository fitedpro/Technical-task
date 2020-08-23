public class Task3_1 {

    public static String declination (int number) {
        String result = "";
        String num = String.valueOf(number);
        int index = Integer.parseInt(String.valueOf(num.charAt(num.length() - 1)));

        if (index == 0) {
            result = number + " компьютеров";
        }

        if (index == 1) {
            result = number + " компьютер";
        }

        if ((index >= 2) && (index <= 4)){
            result = number + " компьютера";
        }

        if ((index >= 5) && (index <= 9)){
            result = number + " компьютеров";
        }

        return result;
    }

    public static void main(String args[]) {
        int s = 25;
        System.out.println(declination(s));

        int s1 = 41;
        System.out.println(declination(s1));

        int s2 = 1048;
        System.out.println(declination(s2));
    }
}
