import java.util.ArrayList;

public class Basic13 {

    public static void Print1To255() {
        System.out.println("The numbers from 1 to 255:");
        for (int i = 1; i < 256; i++) {
            System.out.print(i + " ");
        }
    }

    public static void PrintOdd1To255() {
        System.out.println("The odd numbers from 1 to 255:");
        for (int i = 1; i < 256; i+= 2) {
            System.out.print(i + " ");
        }
    }

    public static void runningTally() {
        int sum = 0;
        for (int i = 0; i < 256; i++) {
            sum += i;
            String string = "Number %s; Sum %s";
			System.out.println(String.format(string, i, sum));
        }
    }
    
    public static void iterate(Object[] arr) {
        for (Object item: arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static int max(Integer[] arr) {
        int max = arr[0];
        for (int number: arr) {
            if (max < number) max = number;
        }
        return max;
    }

    public static double getAverage(Integer[] arr) {
        double average = 0;
        for (int number: arr) {
            average += (double) number;
        }
        return average /= arr.length;
    }

    public static ArrayList<Integer> arrayWithOdds() {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        for (int i = 1; i < 256; i +=2) {
            ints.add(i);
        }
        return ints;
    }

    public static int greaterThanY(int[] arr, int y) {
        int count = 0;
        for (int number: arr){
            if (number > y) count++;
        }
        return count;
    }

    public static Integer[] squareArray(Integer[] arr){
        Integer[] copy = arr;
        for (int i=0; i < copy.length; i++){
            copy[i] *= copy[i];
        }
        return copy;
    }

    public static Integer[] noNegatives(Integer[] a) {
        Integer[] copy = a;
        for (int i = 0; i < copy.length; i++) {
            if (copy[i] < 0) copy[i] = 0;
        }
        return copy;
    }

    public static Object[] maxMinAvg(Integer[] a) {
        int max = max(a);
        double average = getAverage(a);
        int min = a[0];
        for (Integer number : a) {
            if (number < min) min = number;
        }
        return new Object[] {min, max, average};
    }

    public static Integer[] shift(Integer[] a) {
        Integer[] copy = a;
        int mem = copy[copy.length - 1];
        int temp;
        for (int i = 0; i < copy.length; i++) {
            temp = copy[i];
            copy[i] = mem;
            mem = temp;
        }
        return copy;
    }

    public static void main(String[] args) {
        // Print1To255();
        // PrintOdd1To255();
        // runningTally();
        // iterate(new String[] {"Hello", " world", "!"});
        // System.out.println(max(new int[] {7,-5,11,3,2,0,100,0})); //expect 100
        // System.out.println(getAverage(new int[] {-5,5})); // expect 0;
        // System.out.println(getAverage(new int[] {5,5})); // expect 5;
        // System.out.println(getAverage(new int[] {-5,-5})); // expect -5;
        // System.out.println(getAverage(new int[] {1, 2})); // expect 1.5
        // ArrayList<Integer> result = arrayWithOdds(); // expect {1, 3, 5, ..., 255}
        // System.out.println(greaterThanY(new int[] {1,2,3,4,5,6,7,8}, 5)); // expect 3
        // iterate(squareArray(new Integer[] {2,3,4,5,6})); // expect 4 9 16 25 36
        // iterate(noNegatives(new Integer[] {-1,-1,-1})); //expect 0 0 0
        // iterate(maxMinAvg(new Integer[] {-1,0,1})); //expect -1, 1, 0
        // iterate(shift(new Integer[] {1,2,3,4,5}));
    }


}