import java.util.*;

public class ArraySum {
    
    public static void printArrayList(ArrayList<Integer> arr) {
        for (Integer i: arr) {
            System.out.println(i);
        }
    }

    public static ArrayList<Integer> sumArray() {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(3,5,1,2,7,9,8,13,25,32));
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int entry = arr.get(i);
            sum += entry;
            if (entry < 10) {
                arr.remove(i);
                i--;
            };
        }
        System.out.println("sum: " + sum);
        return arr;
    }

    public static void main(String[] args) {
        printArrayList(sumArray());
    }

}