public class Integer {
    public static int valueOf(String str) throws NumberFormatException {
        int summ = 0;
        if (str.charAt(0) == '-') {
            for (int i = 1; i < str.length(); i++) {
                summ += charToInt(str.charAt(i)) * Math.pow(10, str.length() - i - 1);
            }
            return -summ;
        } else {
            for (int i = 0; i < str.length(); i++) {
                summ += charToInt(str.charAt(i)) * Math.pow(10, str.length() - i - 1);
            }
            return summ;
        }
    }

    public static int charToInt(char chr) throws NumberFormatException {
        if (chr > '0' && chr < '9') {
            return (int) chr - '0';
        } else throw new NumberFormatException();
    }
}
