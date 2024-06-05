package dd;

import java.util.concurrent.atomic.AtomicLong;
import r6.o;

/* compiled from: InternalLogId */
public final class j0 {

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicLong f32227d = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    private final String f32228a;

    /* renamed from: b  reason: collision with root package name */
    private final String f32229b;

    /* renamed from: c  reason: collision with root package name */
    private final long f32230c;

    j0(String str, String str2, long j10) {
        o.p(str, "typeName");
        o.e(!str.isEmpty(), "empty type");
        this.f32228a = str;
        this.f32229b = str2;
        this.f32230c = j10;
    }

    public static j0 a(Class<?> cls, String str) {
        return b(c(cls), str);
    }

    public static j0 b(String str, String str2) {
        return new j0(str, str2, e());
    }

    private static String c(Class<?> cls) {
        String simpleName = ((Class) o.p(cls, "type")).getSimpleName();
        if (!simpleName.isEmpty()) {
            return simpleName;
        }
        return cls.getName().substring(cls.getPackage().getName().length() + 1);
    }

    static long e() {
        return f32227d.incrementAndGet();
    }

    public long d() {
        return this.f32230c;
    }

    public String f() {
        return this.f32228a + "<" + this.f32230c + ">";
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f());
        if (this.f32229b != null) {
            sb2.append(": (");
            sb2.append(this.f32229b);
            sb2.append(')');
        }
        return sb2.toString();
    }
}
