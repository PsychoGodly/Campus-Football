package p0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m;

/* compiled from: CreationExtras.kt */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<b<?>, Object> f21096a = new LinkedHashMap();

    /* renamed from: p0.a$a  reason: collision with other inner class name */
    /* compiled from: CreationExtras.kt */
    public static final class C0220a extends a {

        /* renamed from: b  reason: collision with root package name */
        public static final C0220a f21097b = new C0220a();

        private C0220a() {
        }

        public <T> T a(b<T> bVar) {
            m.e(bVar, "key");
            return null;
        }
    }

    /* compiled from: CreationExtras.kt */
    public interface b<T> {
    }

    public abstract <T> T a(b<T> bVar);

    public final Map<b<?>, Object> b() {
        return this.f21096a;
    }
}
