package vb;

import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.p;

/* compiled from: BannerSizeKt.kt */
public final class w {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39105b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final p.a f39106a;

    /* compiled from: BannerSizeKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ w a(p.a aVar) {
            m.e(aVar, "builder");
            return new w(aVar, (h) null);
        }
    }

    private w(p.a aVar) {
        this.f39106a = aVar;
    }

    public /* synthetic */ w(p.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ p a() {
        z s10 = this.f39106a.build();
        m.d(s10, "_builder.build()");
        return (p) s10;
    }

    public final void b(int i10) {
        this.f39106a.F(i10);
    }

    public final void c(int i10) {
        this.f39106a.G(i10);
    }
}
