package l8;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: GlobalLibraryVersionRegistrar */
public class d {

    /* renamed from: b  reason: collision with root package name */
    private static volatile d f29197b;

    /* renamed from: a  reason: collision with root package name */
    private final Set<f> f29198a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f29197b;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f29197b;
                if (dVar == null) {
                    dVar = new d();
                    f29197b = dVar;
                }
            }
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public Set<f> b() {
        Set<f> unmodifiableSet;
        synchronized (this.f29198a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f29198a);
        }
        return unmodifiableSet;
    }
}
