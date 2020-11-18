public class Summation {
    public static void main(String[] args) {

        long firstSum = summation(5);
        long secondSum = summation(7);
        long totalSum = firstSum + secondSum;
        System.out.println(totalSum);
    }

    public static long summation(int number) {
        long result = 0;
        for (int i = number; i < 1000000; i += number) {
            result += i;
        }
        return result;
    }

}