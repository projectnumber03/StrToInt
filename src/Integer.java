public class Integer {
    public static int valueOf(String str) throws NumberFormatException {
        int summ = 0;
        int k1;
        int k2;
        if (str.charAt(0) == '-') {
            k1 = 1;
            k2 = -1;
        } else {
            k1 = 0;
            k2 = 1;
        }
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
