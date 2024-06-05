package vb;

import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.w3;

/* compiled from: UniversalResponseKt.kt */
public final class u3 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39097b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final w3.a f39098a;

    /* compiled from: UniversalResponseKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ u3 a(w3.a aVar) {
            m.e(aVar, "builder");
            return new u3(aVar, (h) null);
        }
    }

    private u3(w3.a aVar) {
        this.f39098a = aVar;
    }

    public /* synthetic */ u3(w3.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ w3 a() {
        z s10 = this.f39098a.build();
        m.d(s10, "_builder.build()");
        return (w3) s10;
    }

    public final void b(d1 d1Var) {
        m.e(d1Var, "value");
        this.f39098a.F(d1Var);
    }
}
