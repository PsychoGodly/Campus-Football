package pe;

import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import nf.b;
import xd.g;

/* compiled from: CoroutineContext.kt */
public final class n0 extends xd.a implements a3<String> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f37365b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final long f37366a;

    /* compiled from: CoroutineContext.kt */
    public static final class a implements g.c<n0> {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    public n0(long j10) {
        super(f37365b);
        this.f37366a = j10;
    }

    public final long X0() {
        return this.f37366a;
    }

    /* renamed from: Y0 */
    public void v0(g gVar, String str) {
        Thread.currentThread().setName(str);
    }

    /* renamed from: Z0 */
    public String g0(g gVar) {
        String str;
        o0 o0Var = (o0) gVar.get(o0.f37377b);
        if (o0Var == null || (str = o0Var.X0()) == null) {
            str = "coroutine";
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int K = p.K(name, " @", 0, false, 6, (Object) null);
        if (K < 0) {
            K = name.length();
        }
        StringBuilder sb2 = new StringBuilder(str.length() + K + 10);
        String substring = name.substring(0, K);
        m.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb2.append(substring);
        sb2.append(" @");
        sb2.append(str);
        sb2.append('#');
        sb2.append(this.f37366a);
        String sb3 = sb2.toString();
        m.d(sb3, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb3);
        return name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && this.f37366a == ((n0) obj).f37366a;
    }

    public int hashCode() {
        return b.a(this.f37366a);
    }

    public String toString() {
        return "CoroutineId(" + this.f37366a + ')';
    }
}
