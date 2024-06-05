package ne;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: Regex.kt */
public final class e implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f36528b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final Pattern f36529a;

    /* compiled from: Regex.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    public e(Pattern pattern) {
        m.e(pattern, "nativePattern");
        this.f36529a = pattern;
    }

    public final String a(CharSequence charSequence, String str) {
        m.e(charSequence, "input");
        m.e(str, "replacement");
        String replaceAll = this.f36529a.matcher(charSequence).replaceAll(str);
        m.d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final List<String> b(CharSequence charSequence, int i10) {
        m.e(charSequence, "input");
        p.a0(i10);
        Matcher matcher = this.f36529a.matcher(charSequence);
        if (i10 == 1 || !matcher.find()) {
            return p.b(charSequence.toString());
        }
        int i11 = 10;
        if (i10 > 0) {
            i11 = i.c(i10, 10);
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = 0;
        int i13 = i10 - 1;
        do {
            arrayList.add(charSequence.subSequence(i12, matcher.start()).toString());
            i12 = matcher.end();
            if ((i13 >= 0 && arrayList.size() == i13) || !matcher.find()) {
                arrayList.add(charSequence.subSequence(i12, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i12, matcher.start()).toString());
            i12 = matcher.end();
            break;
        } while (!matcher.find());
        arrayList.add(charSequence.subSequence(i12, charSequence.length()).toString());
        return arrayList;
    }

    public String toString() {
        String pattern = this.f36529a.toString();
        m.d(pattern, "nativePattern.toString()");
        return pattern;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.m.e(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            kotlin.jvm.internal.m.d(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.e.<init>(java.lang.String):void");
    }
}
