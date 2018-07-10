import java.util.*;

public class TenRand {

    private static Random ayn = new Random();

    public static void display(int[] arr) {
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void display(ArrayList<Integer> arr) {
        for (Integer number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static int[] tenRandom() {
        int[] randomIntegers = new int[10];
        for (int i = 0; i < randomIntegers.length; i++) {
            randomIntegers[i] = 55 + ayn.nextInt(101-55);
        }
        return randomIntegers;
    }

    public static ArrayList<Integer> tenRandomPlus() {
        int[] randomIntegers = tenRandom();
        ArrayList<Integer> randInts = new ArrayList<Integer>();
        for (int number : randomIntegers) randInts.add(number);
        Collections.sort(randInts);
        System.out.println("Smallest: " + randInts.get(0));
        System.out.println("Largest: " +  randInts.get(9));
        return randInts;
    }

    public static void main(String[] args) {
        display(tenRandomPlus());
    }

}