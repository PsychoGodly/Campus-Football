package vb;

import com.google.protobuf.z;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import s8.b;
import vb.k0;

/* compiled from: DeveloperConsentKt.kt */
public final class h0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38966b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final k0.a f38967a;

    /* compiled from: DeveloperConsentKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ h0 a(k0.a aVar) {
            m.e(aVar, "builder");
            return new h0(aVar, (h) null);
        }
    }

    private h0(k0.a aVar) {
        this.f38967a = aVar;
    }

    public /* synthetic */ h0(k0.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ k0 a() {
        z s10 = this.f38967a.build();
        m.d(s10, "_builder.build()");
        return (k0) s10;
    }

    public final /* synthetic */ void b(b bVar, Iterable iterable) {
        m.e(bVar, "<this>");
        m.e(iterable, "values");
        this.f38967a.F(iterable);
    }

    public final /* synthetic */ b c() {
        List<m0> G = this.f38967a.G();
        m.d(G, "_builder.getOptionsList()");
        return new b(G);
    }
}
