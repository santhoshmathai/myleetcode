import java.util.ArrayList;
import java.util.List;

public class XOR1 {

    public static void main(String[] args) {
        int n = 12;
        List<Integer> lists = getTheValuesOfX(n);
        int maxValue = 0;
        int number = 0;

        for (Integer x : lists) {
            int result = n ^ x;
            if (result > maxValue) {
                maxValue = result;
                number = x;
            }
        }

        System.out.println("MaxValue: " + maxValue);
        System.out.println("Number: " + number);
    }

    public static List<Integer> getTheValuesOfX(int n) {
        List<Integer> lists = new ArrayList<>();
        int numberOfBits = Integer.toBinaryString(n).length();
        int x = (1 << numberOfBits) - 1;

        while (x >= n) {
            lists.add(x);
            x--;
        }

        return lists;
    }
}
