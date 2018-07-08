public class StringManipulatorTest {
    
    public static void main(String[] args) {
        
        StringManipulator mani = new StringManipulator();

        //Test concat and trim
        System.out.println(mani.trimAndConcat("  Hello   ", "     World!      ")); // expect HelloWorld

        //Test getIndexOrNull for char
        System.out.println(mani.getIndexOrNull("hello", 'e')); // expect 1
        System.out.println(mani.getIndexOrNull("hello", 'a')); // expect null

        //Test getIndexOrNull for string
        System.out.println(mani.getIndexOrNull("hello", "llo")); // expect 1
        System.out.println(mani.getIndexOrNull("hello", "a")); // expect null

        //Test concatSubString
        System.out.println(mani.concatSubstring("hello", 0, 2, "world")); // expect heworld

    }

}