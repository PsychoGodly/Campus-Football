package vb;

import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.w1;

/* compiled from: AdOperationsConfigurationKt.kt */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38941b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final w1.a f38942a;

    /* compiled from: AdOperationsConfigurationKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ f a(w1.a aVar) {
            m.e(aVar, "builder");
            return new f(aVar, (h) null);
        }
    }

    private f(w1.a aVar) {
        this.f38942a = aVar;
    }

    public /* synthetic */ f(w1.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ w1 a() {
        z s10 = this.f38942a.build();
        m.d(s10, "_builder.build()");
        return (w1) s10;
    }

    public final void b(int i10) {
        this.f38942a.F(i10);
    }

    public final void c(int i10) {
        this.f38942a.G(i10);
    }

    public final void d(int i10) {
        this.f38942a.H(i10);
    }
}
