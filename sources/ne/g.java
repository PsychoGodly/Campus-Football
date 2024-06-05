package ne;

import fe.l;
import kotlin.jvm.internal.m;

/* compiled from: Appendable.kt */
class g {
    public static <T> void a(Appendable appendable, T t10, l<? super T, ? extends CharSequence> lVar) {
        boolean z10;
        m.e(appendable, "<this>");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(t10));
            return;
        }
        if (t10 == null) {
            z10 = true;
        } else {
            z10 = t10 instanceof CharSequence;
        }
        if (z10) {
            appendable.append((CharSequence) t10);
        } else if (t10 instanceof Character) {
            appendable.append(((Character) t10).charValue());
        } else {
            appendable.append(String.valueOf(t10));
        }
    }
}
