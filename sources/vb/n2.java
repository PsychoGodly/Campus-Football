package vb;

import com.google.protobuf.i;
import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.p2;

/* compiled from: PrivacyUpdateRequestKt.kt */
public final class n2 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39029b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final p2.a f39030a;

    /* compiled from: PrivacyUpdateRequestKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ n2 a(p2.a aVar) {
            m.e(aVar, "builder");
            return new n2(aVar, (h) null);
        }
    }

    private n2(p2.a aVar) {
        this.f39030a = aVar;
    }

    public /* synthetic */ n2(p2.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ p2 a() {
        z s10 = this.f39030a.build();
        m.d(s10, "_builder.build()");
        return (p2) s10;
    }

    public final void b(i iVar) {
        m.e(iVar, "value");
        this.f39030a.F(iVar);
    }

    public final void c(int i10) {
        this.f39030a.G(i10);
    }
}
