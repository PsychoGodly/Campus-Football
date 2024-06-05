package vb;

import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.a2;

/* compiled from: RequestPolicyKt.kt */
public final class s2 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39080b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final a2.a f39081a;

    /* compiled from: RequestPolicyKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ s2 a(a2.a aVar) {
            m.e(aVar, "builder");
            return new s2(aVar, (h) null);
        }
    }

    private s2(a2.a aVar) {
        this.f39081a = aVar;
    }

    public /* synthetic */ s2(a2.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ a2 a() {
        z s10 = this.f39081a.build();
        m.d(s10, "_builder.build()");
        return (a2) s10;
    }

    public final void b(b2 b2Var) {
        m.e(b2Var, "value");
        this.f39081a.F(b2Var);
    }

    public final void c(c2 c2Var) {
        m.e(c2Var, "value");
        this.f39081a.G(c2Var);
    }
}
