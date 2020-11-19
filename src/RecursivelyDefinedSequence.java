import java.util.ArrayList;
import java.util.List;

public class RecursivelyDefinedSequence {
    static int INCOMING_VALUE = 6171;

    public static void main(String[] args) {
        System.out.println(countSumOfSequenceNumbers(INCOMING_VALUE));
    }

    public static int function(int number) {
        return (number % 2 == 1 ? (1 + (3 * number)) : (number / 2));
    }

    public static List<Integer> getListOfSequenceNumbers(int number) {
        int result = number;
        List<Integer> list = new ArrayList<>();
        list.add(number);
        do {
            result = function(result);
            list.add(result);
        } while (result > 1);
        return list;
    }

    public static long countSumOfSequenceNumbers(int number) {
        int sumOfElements = 0;
        for (Integer integer : getListOfSequenceNumbers(number)) {
            sumOfElements += integer;
        }
        return sumOfElements;
    }

}