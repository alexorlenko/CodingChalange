public class Summation {

    final static int FIRST_VALUE = 5;
    final static int SECOND_VALUE = 7;

    public static void main(String[] args) {
        System.out.println(summation(FIRST_VALUE) + summation(SECOND_VALUE));
    }

    public static long summation(int number) {
        long result = 0;
        for (int i = number; i < 1000000; i += number) {
            result += i;
        }
        return result;
    }

}