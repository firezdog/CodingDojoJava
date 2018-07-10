import java.util.*;

public class ArrayShuffle {

    public static void printArrayList(ArrayList<String>arr) {
    
        for (String s : arr) {
            System.out.println(s);
        }
    
    }

    public static ArrayList<String> shuffleList() {
        
        ArrayList<String> arr = new ArrayList<String>(Arrays.asList("Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"));
        Collections.shuffle(arr);
        printArrayList(arr);

        for(int i = 0; i < arr.size(); i++) {
            String item = arr.get(i);
            if (item.length() < 10) {
                arr.remove(item);
                i--;
            }
        }

        System.out.println();

        return arr;
    
    }

    public static void main(String[] args){

        printArrayList(shuffleList());

    }

}