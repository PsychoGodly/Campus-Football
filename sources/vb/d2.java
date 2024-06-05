package vb;

import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.g2;

/* compiled from: OperativeEventErrorDataKt.kt */
public final class d2 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38934b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final g2.a f38935a;

    /* compiled from: OperativeEventErrorDataKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ d2 a(g2.a aVar) {
            m.e(aVar, "builder");
            return new d2(aVar, (h) null);
        }
    }

    private d2(g2.a aVar) {
        this.f38935a = aVar;
    }

    public /* synthetic */ d2(g2.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ g2 a() {
        z s10 = this.f38935a.build();
        m.d(s10, "_builder.build()");
        return (g2) s10;
    }

    public final void b(h2 h2Var) {
        m.e(h2Var, "value");
        this.f38935a.F(h2Var);
    }

    public final void c(String str) {
        m.e(str, "value");
        this.f38935a.G(str);
    }
}
