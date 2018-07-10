import java.util.*;

public class Alphabet {
    
    public static void shuffleAlphabet() {
        ArrayList<Character> alphabet = new ArrayList<Character>(
            Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z')
        );
        ArrayList<Character> vowels = new ArrayList<Character>(
            Arrays.asList('a','e','i','o','u')
        );
        Collections.shuffle(alphabet);
        Character first = alphabet.get(0);
        Character last = alphabet.get(25);
        System.out.println("First: " + first);
        System.out.println("Last: " + last);
        if (vowels.contains(first)) System.out.println("First is a vowel.");
    }

    public static void main(String[] args){
        shuffleAlphabet();
    }

}