public class Integer {

    public static int valueOf(String str) throws NumberFormatException {
        return str.charAt(0) == '-' ? convert(str, 1, -1) : convert(str, 0, 1);
    }

    public static int convert(String str, int k1, int k2) {
        int summ = 0;
        for (int i = k1; i < str.length(); i++) {
            summ += charToInt(str.charAt(i)) * Math.pow(10, str.length() - i - 1);
        }
        return k2 * summ;
    }

    public static int charToInt(char chr) throws NumberFormatException {
        if (chr > '0' && chr < '9') {
            return (int) chr - '0';
        } else throw new NumberFormatException();
    }
}
