package vb;

import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.c2;

/* compiled from: RequestTimeoutPolicyKt.kt */
public final class u2 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39095b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final c2.a f39096a;

    /* compiled from: RequestTimeoutPolicyKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ u2 a(c2.a aVar) {
            m.e(aVar, "builder");
            return new u2(aVar, (h) null);
        }
    }

    private u2(c2.a aVar) {
        this.f39096a = aVar;
    }

    public /* synthetic */ u2(c2.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ c2 a() {
        z s10 = this.f39096a.build();
        m.d(s10, "_builder.build()");
        return (c2) s10;
    }

    public final void b(int i10) {
        this.f39096a.F(i10);
    }

    public final void c(int i10) {
        this.f39096a.G(i10);
    }

    public final void d(int i10) {
        this.f39096a.H(i10);
    }

    public final void e(int i10) {
        this.f39096a.I(i10);
    }
}
