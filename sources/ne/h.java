package ne;

import com.applovin.mediation.MaxReward;
import fe.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* compiled from: Indent.kt */
class h extends g {

    /* compiled from: Indent.kt */
    static final class a extends n implements l<String, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f36530a = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(String str) {
            m.e(str, "line");
            return str;
        }
    }

    /* compiled from: Indent.kt */
    static final class b extends n implements l<String, String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f36531a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f36531a = str;
        }

        /* renamed from: a */
        public final String invoke(String str) {
            m.e(str, "line");
            return this.f36531a + str;
        }
    }

    private static final l<String, String> b(String str) {
        if (str.length() == 0) {
            return a.f36530a;
        }
        return new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (!a.c(str.charAt(i10))) {
                break;
            } else {
                i10++;
            }
        }
        return i10 == -1 ? str.length() : i10;
    }

    public static final String d(String str, String str2) {
        String invoke;
        m.e(str, "<this>");
        m.e(str2, "newIndent");
        List<String> N = p.N(str);
        ArrayList<String> arrayList = new ArrayList<>();
        for (T next : N) {
            if (!o.m((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(r.j(arrayList, 10));
        for (String c10 : arrayList) {
            arrayList2.add(Integer.valueOf(c(c10)));
        }
        Integer num = (Integer) y.A(arrayList2);
        int i10 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * N.size());
        l<String, String> b10 = b(str2);
        int e10 = q.e(N);
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : N) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                q.i();
            }
            String str3 = (String) next2;
            if ((i10 == 0 || i10 == e10) && o.m(str3)) {
                str3 = null;
            } else {
                String B0 = r.B0(str3, intValue);
                if (!(B0 == null || (invoke = b10.invoke(B0)) == null)) {
                    str3 = invoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i10 = i11;
        }
        String sb2 = ((StringBuilder) y.w(arrayList3, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 124, (Object) null)).toString();
        m.d(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    public static String e(String str) {
        m.e(str, "<this>");
        return d(str, MaxReward.DEFAULT_LABEL);
    }
}
