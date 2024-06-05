package vb;

import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.i1;

/* compiled from: InitializationCompletedEventRequestKt.kt */
public final class g1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38963b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final i1.a f38964a;

    /* compiled from: InitializationCompletedEventRequestKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ g1 a(i1.a aVar) {
            m.e(aVar, "builder");
            return new g1(aVar, (h) null);
        }
    }

    private g1(i1.a aVar) {
        this.f38964a = aVar;
    }

    public /* synthetic */ g1(i1.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ i1 a() {
        z s10 = this.f38964a.build();
        m.d(s10, "_builder.build()");
        return (i1) s10;
    }

    public final void b(a1 a1Var) {
        m.e(a1Var, "value");
        this.f38964a.F(a1Var);
    }

    public final void c(b3 b3Var) {
        m.e(b3Var, "value");
        this.f38964a.G(b3Var);
    }
}
