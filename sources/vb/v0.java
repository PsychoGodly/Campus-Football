package vb;

import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.x1;

/* compiled from: DiagnosticEventsConfigurationKt.kt */
public final class v0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39099b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final x1.c f39100a;

    /* compiled from: DiagnosticEventsConfigurationKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ v0 a(x1.c cVar) {
            m.e(cVar, "builder");
            return new v0(cVar, (h) null);
        }
    }

    private v0(x1.c cVar) {
        this.f39100a = cVar;
    }

    public /* synthetic */ v0(x1.c cVar, h hVar) {
        this(cVar);
    }

    public final /* synthetic */ x1 a() {
        z s10 = this.f39100a.build();
        m.d(s10, "_builder.build()");
        return (x1) s10;
    }

    public final void b(boolean z10) {
        this.f39100a.F(z10);
    }

    public final void c(int i10) {
        this.f39100a.G(i10);
    }

    public final void d(int i10) {
        this.f39100a.H(i10);
    }

    public final void e(boolean z10) {
        this.f39100a.I(z10);
    }
}
