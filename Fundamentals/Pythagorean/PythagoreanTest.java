public class PythagoreanTest {
    public static void main (String[] args) {
        int legA = Integer.parseInt(args[0]);
        int legB = Integer.parseInt(args[1]);
        Pythagorean p = new Pythagorean();
        System.out.println(p.calculateHypotenuse(legA, legB));
    }
}