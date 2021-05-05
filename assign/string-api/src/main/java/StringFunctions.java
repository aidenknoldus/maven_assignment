public class StringFunctions {
    public static String ReverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int StringLength(String str) {
        return str.length();
    }
}
