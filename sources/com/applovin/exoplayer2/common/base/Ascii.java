package com.applovin.exoplayer2.common.base;

public final class Ascii {
    public static final byte ACK = 6;
    public static final byte BEL = 7;
    public static final byte BS = 8;
    public static final byte CAN = 24;
    private static final char CASE_MASK = ' ';
    public static final byte CR = 13;
    public static final byte DC1 = 17;
    public static final byte DC2 = 18;
    public static final byte DC3 = 19;
    public static final byte DC4 = 20;
    public static final byte DEL = Byte.MAX_VALUE;
    public static final byte DLE = 16;
    public static final byte EM = 25;
    public static final byte ENQ = 5;
    public static final byte EOT = 4;
    public static final byte ESC = 27;
    public static final byte ETB = 23;
    public static final byte ETX = 3;
    public static final byte FF = 12;
    public static final byte FS = 28;
    public static final byte GS = 29;
    public static final byte HT = 9;
    public static final byte LF = 10;
    public static final char MAX = '';
    public static final char MIN = '\u0000';
    public static final byte NAK = 21;
    public static final byte NL = 10;
    public static final byte NUL = 0;
    public static final byte RS = 30;
    public static final byte SI = 15;
    public static final byte SO = 14;
    public static final byte SOH = 1;
    public static final byte SP = 32;
    public static final byte SPACE = 32;
    public static final byte STX = 2;
    public static final byte SUB = 26;
    public static final byte SYN = 22;
    public static final byte US = 31;
    public static final byte VT = 11;
    public static final byte XOFF = 19;
    public static final byte XON = 17;

    private Ascii() {
    }

    public static boolean equalsIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        int alphaIndex;
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
            if (charAt != charAt2 && ((alphaIndex = getAlphaIndex(charAt)) >= 26 || alphaIndex != getAlphaIndex(charAt2))) {
                return false;
            }
        }
        return true;
    }

    private static int getAlphaIndex(char c10) {
        return (char) ((c10 | CASE_MASK) - 'a');
    }

    public static boolean isLowerCase(char c10) {
        return c10 >= 'a' && c10 <= 'z';
    }

    public static boolean isUpperCase(char c10) {
        return c10 >= 'A' && c10 <= 'Z';
    }

    public static String toLowerCase(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (isUpperCase(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (isUpperCase(c10)) {
                        charArray[i10] = (char) (c10 ^ CASE_MASK);
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static String toUpperCase(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (isLowerCase(str.charAt(i10))) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (isLowerCase(c10)) {
                        charArray[i10] = (char) (c10 ^ CASE_MASK);
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static String truncate(CharSequence charSequence, int i10, String str) {
        Preconditions.checkNotNull(charSequence);
        int length = i10 - str.length();
        Preconditions.checkArgument(length >= 0, "maxLength (%s) must be >= length of the truncation indicator (%s)", i10, str.length());
        int length2 = charSequence.length();
        String str2 = charSequence;
        if (length2 <= i10) {
            String charSequence2 = charSequence.toString();
            int length3 = charSequence2.length();
            str2 = charSequence2;
            if (length3 <= i10) {
                return charSequence2;
            }
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str2, 0, length);
        sb2.append(str);
        return sb2.toString();
    }

    public static String toLowerCase(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return toLowerCase((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = toLowerCase(charSequence.charAt(i10));
        }
        return String.valueOf(cArr);
    }

    public static String toUpperCase(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return toUpperCase((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = toUpperCase(charSequence.charAt(i10));
        }
        return String.valueOf(cArr);
    }

    public static char toLowerCase(char c10) {
        return isUpperCase(c10) ? (char) (c10 ^ CASE_MASK) : c10;
    }

    public static char toUpperCase(char c10) {
        return isLowerCase(c10) ? (char) (c10 ^ CASE_MASK) : c10;
    }
}
