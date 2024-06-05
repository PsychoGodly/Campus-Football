package r6;

/* compiled from: Ascii */
public final class c {
    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        int b10;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = charSequence.charAt(i10);
            char charAt2 = charSequence2.charAt(i10);
            if (charAt != charAt2 && ((b10 = b(charAt)) >= 26 || b10 != b(charAt2))) {
                return false;
            }
        }
        return true;
    }

    private static int b(char c10) {
        return (char) ((c10 | ' ') - 'a');
    }

    public static boolean c(char c10) {
        return c10 >= 'a' && c10 <= 'z';
    }

    public static boolean d(char c10) {
        return c10 >= 'A' && c10 <= 'Z';
    }

    public static String e(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (d(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (d(c10)) {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static String f(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (c(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c(c10)) {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }
}
