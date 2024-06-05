package vb;

import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.m1;

/* compiled from: InitializationDeviceInfoKt.kt */
public final class j1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38983b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final m1.a f38984a;

    /* compiled from: InitializationDeviceInfoKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ j1 a(m1.a aVar) {
            m.e(aVar, "builder");
            return new j1(aVar, (h) null);
        }
    }

    private j1(m1.a aVar) {
        this.f38984a = aVar;
    }

    public /* synthetic */ j1(m1.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ m1 a() {
        z s10 = this.f38984a.build();
        m.d(s10, "_builder.build()");
        return (m1) s10;
    }

    public final void b(String str) {
        m.e(str, "value");
        this.f38984a.F(str);
    }

    public final void c(String str) {
        m.e(str, "value");
        this.f38984a.G(str);
    }

    public final void d(String str) {
        m.e(str, "value");
        this.f38984a.H(str);
    }

    public final void e(String str) {
        m.e(str, "value");
        this.f38984a.I(str);
    }
}
