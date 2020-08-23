public class Task2 {

    public static int roundFive (Float number) {
        int result = 0;

        if ((number % 5) == 0) {
            result += number;
        }

        else if ((number % 5) <= 2.5) {
            result += ((int)(number / 5)) * 5;
        }

        else if ((number % 5) >= 2.5) {
            result += (((int)(number / 5)) * 5) + 5;
        }

        return result;
    }

    public static void main(String args[]) {
        float s = 27f;
        System.out.println(roundFive(s));

        float s1 = 27.8f;
        System.out.println(roundFive(s1));

        float s2 = 41.7f;
        System.out.println(roundFive(s2));

    }
}