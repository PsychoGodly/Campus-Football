package v6;

import r6.o;

/* compiled from: Chars */
public final class b {
    public static char a(long j10) {
        char c10 = (char) ((int) j10);
        o.j(((long) c10) == j10, "Out of range: %s", j10);
        return c10;
    }

    public static boolean b(char[] cArr, char c10) {
        for (char c11 : cArr) {
            if (c11 == c10) {
                return true;
            }
        }
        return false;
    }

    public static char c(byte b10, byte b11) {
        return (char) ((b10 << 8) | (b11 & 255));
    }
}
