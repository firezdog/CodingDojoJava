public class FizzBuzzTest {
    public static void main(String[] args) {
        int testCase = Integer.parseInt(args[0]);
        FizzBuzz fb = new FizzBuzz();
        System.out.println(fb.FizzBuzzMethod(testCase));
    }
}