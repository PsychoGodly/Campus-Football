package vb;

import com.google.protobuf.z;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.i;

/* compiled from: AdPlayerConfigRequestKt.kt */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38954b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final i.a f38955a;

    /* compiled from: AdPlayerConfigRequestKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ g a(i.a aVar) {
            m.e(aVar, "builder");
            return new g(aVar, (h) null);
        }
    }

    private g(i.a aVar) {
        this.f38955a = aVar;
    }

    public /* synthetic */ g(i.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ i a() {
        z s10 = this.f38955a.build();
        m.d(s10, "_builder.build()");
        return (i) s10;
    }

    public final void b(com.google.protobuf.i iVar) {
        m.e(iVar, "value");
        this.f38955a.F(iVar);
    }

    public final void c(com.google.protobuf.i iVar) {
        m.e(iVar, "value");
        this.f38955a.G(iVar);
    }

    public final void d(String str) {
        m.e(str, "value");
        this.f38955a.H(str);
    }
}
