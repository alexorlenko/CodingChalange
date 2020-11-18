import java.util.ArrayList;
import java.util.List;

public class RecursivelyDefinedSequence {
    public static void main(String[] args) {
        int number = 6171;
        System.out.println(resultListSum(number));
    }

    public static int function(int number) {
        return (number % 2 == 1 ? (1 + (3 * number)) : (number / 2));
    }

    public static List<Integer> functionResultToList(int number) {
        int result = number;
        List<Integer> list = new ArrayList<>();
        list.add(number);
        do {
            result = function(result);
            list.add(result);
        } while (result > 1);
        return list;
    }

    public static long resultListSum(int number){
        List<Integer> myArray = functionResultToList(number);
        int sumOfElements = 0;
        for(int i = 0; i < myArray.size(); i++){
            sumOfElements += myArray.get(i);
        }
        return sumOfElements;
    }

}