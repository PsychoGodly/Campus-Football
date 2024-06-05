package pe;

import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import xd.g;

/* compiled from: CoroutineName.kt */
public final class o0 extends xd.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f37377b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f37378a;

    /* compiled from: CoroutineName.kt */
    public static final class a implements g.c<o0> {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    public o0(String str) {
        super(f37377b);
        this.f37378a = str;
    }

    public final String X0() {
        return this.f37378a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && m.a(this.f37378a, ((o0) obj).f37378a);
    }

    public int hashCode() {
        return this.f37378a.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f37378a + ')';
    }
}
