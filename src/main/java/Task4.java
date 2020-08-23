public class Task4 {
    public static String simpleNumber(int number) {
        String result = "";

        if (number == 2) {
            result  += "Число " + number +  " простое";
        }

        else if (number > 1) {

            if ((((((number % 1) == 0) && (number % 1) == 0))) && ((number % 2) != 0)) {
                result += "Число " + number +  " простое";
            }

            else {
                result += "Число " + number + " не простое";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int s = 2;
        System.out.println(simpleNumber(s));

        int s1 = 18;
        System.out.println(simpleNumber(s1));

        int s2 = 777;
        System.out.println(simpleNumber(s2));

        int s3 = 666;
        System.out.println(simpleNumber(s3));
    }
}
