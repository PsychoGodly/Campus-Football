package vb;

import com.google.protobuf.t1;
import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.g3;

/* compiled from: TimestampsKt.kt */
public final class e3 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38939b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final g3.a f38940a;

    /* compiled from: TimestampsKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ e3 a(g3.a aVar) {
            m.e(aVar, "builder");
            return new e3(aVar, (h) null);
        }
    }

    private e3(g3.a aVar) {
        this.f38940a = aVar;
    }

    public /* synthetic */ e3(g3.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ g3 a() {
        z s10 = this.f38940a.build();
        m.d(s10, "_builder.build()");
        return (g3) s10;
    }

    public final void b(long j10) {
        this.f38940a.F(j10);
    }

    public final void c(t1 t1Var) {
        m.e(t1Var, "value");
        this.f38940a.G(t1Var);
    }
}
