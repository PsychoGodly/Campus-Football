package androidx.work;

import java.util.List;

/* compiled from: InputMerger */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5324a = p.f("InputMerger");

    public static k a(String str) {
        try {
            return (k) Class.forName(str).newInstance();
        } catch (Exception e10) {
            p c10 = p.c();
            String str2 = f5324a;
            c10.b(str2, "Trouble instantiating + " + str, e10);
            return null;
        }
    }

    public abstract e b(List<e> list);
}
