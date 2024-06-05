package vb;

import com.google.protobuf.i;
import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.m2;

/* compiled from: PiiKt.kt */
public final class k2 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38996b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final m2.a f38997a;

    /* compiled from: PiiKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ k2 a(m2.a aVar) {
            m.e(aVar, "builder");
            return new k2(aVar, (h) null);
        }
    }

    private k2(m2.a aVar) {
        this.f38997a = aVar;
    }

    public /* synthetic */ k2(m2.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ m2 a() {
        z s10 = this.f38997a.build();
        m.d(s10, "_builder.build()");
        return (m2) s10;
    }

    public final void b(i iVar) {
        m.e(iVar, "value");
        this.f38997a.F(iVar);
    }

    public final void c(i iVar) {
        m.e(iVar, "value");
        this.f38997a.G(iVar);
    }
}
