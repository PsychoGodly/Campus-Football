package ne;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

/* compiled from: _Strings.kt */
class r extends q {
    public static final String B0(String str, int i10) {
        m.e(str, "<this>");
        if (i10 >= 0) {
            String substring = str.substring(i.c(i10, str.length()));
            m.d(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static char C0(CharSequence charSequence) {
        m.e(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(p.z(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}
