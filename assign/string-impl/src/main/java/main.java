public class main {
    public static void main(String[] args) {
        String str = "Hello World!";
        StringFunctions stringFunctions = new StringFunctions();
        String reversedStr = stringFunctions.ReverseString(str);
        int length = stringFunctions.StringLength(str);

        System.out.println("String: " + str + " reversed: " + reversedStr + " has length: " + length);
    }
}
