package t7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u7.e;
import u7.u;
import y7.b;

/* compiled from: EncodedPath */
final class f {
    private static List<String> a(String str) {
        int length = str.length();
        b.d(length >= 2, "Invalid path \"%s\"", str);
        if (length == 2) {
            b.d(str.charAt(0) == 1 && str.charAt(1) == 1, "Non-empty path \"%s\" had length 2", str);
            return Collections.emptyList();
        }
        int length2 = str.length() - 2;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (i10 < length) {
            int indexOf = str.indexOf(1, i10);
            if (indexOf < 0 || indexOf > length2) {
                throw new IllegalArgumentException("Invalid encoded resource path: \"" + str + "\"");
            }
            int i11 = indexOf + 1;
            char charAt = str.charAt(i11);
            if (charAt == 1) {
                String substring = str.substring(i10, indexOf);
                if (sb2.length() != 0) {
                    sb2.append(substring);
                    substring = sb2.toString();
                    sb2.setLength(0);
                }
                arrayList.add(substring);
            } else if (charAt == 16) {
                sb2.append(str.substring(i10, indexOf));
                sb2.append(0);
            } else if (charAt == 17) {
                sb2.append(str.substring(i10, i11));
            } else {
                throw new IllegalArgumentException("Invalid encoded resource path: \"" + str + "\"");
            }
            i10 = indexOf + 2;
        }
        return arrayList;
    }

    static u b(String str) {
        return u.o(a(str));
    }

    static <B extends e<B>> String c(B b10) {
        StringBuilder sb2 = new StringBuilder();
        int k10 = b10.k();
        for (int i10 = 0; i10 < k10; i10++) {
            if (sb2.length() > 0) {
                e(sb2);
            }
            d(b10.h(i10), sb2);
        }
        e(sb2);
        return sb2.toString();
    }

    private static void d(String str, StringBuilder sb2) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == 0) {
                sb2.append(1);
                sb2.append(16);
            } else if (charAt != 1) {
                sb2.append(charAt);
            } else {
                sb2.append(1);
                sb2.append(17);
            }
        }
    }

    private static void e(StringBuilder sb2) {
        sb2.append(1);
        sb2.append(1);
    }

    static String f(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        int length = sb2.length() - 1;
        char charAt = sb2.charAt(length);
        b.d(charAt == 1, "successor may only operate on paths generated by encode", new Object[0]);
        sb2.setCharAt(length, (char) (charAt + 1));
        return sb2.toString();
    }
}
