import java.util.*;

public class RandString {

    private static ArrayList<Character> alphabet = new ArrayList<Character>(
        Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z')
    );

    public static ArrayList<Character> randomAlph() {
        ArrayList<Character> randAlph = alphabet;
        Collections.shuffle(randAlph);
        return randAlph;
    }

    public static String randomString() {
        String random = new String();
        ArrayList<Character> randAlph = randomAlph();
        for (int i = 0; i < 5; i++) {
            random += randAlph.get(i);
        }
        return random;
    }

    public static ArrayList<String> randStrArr() {
        ArrayList<String> random = new ArrayList<String>();
        for (int i = 0; i < 10; i ++) {
            random.add(randomString());
        }
        return random;
    }

    public static void main(String[] args) {
        System.out.println(randStrArr());
    }

}