package vb;

import com.google.protobuf.z;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import s8.b;
import vb.t0;

/* compiled from: DiagnosticEventRequestKt.kt */
public final class p0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39055b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final t0.a f39056a;

    /* compiled from: DiagnosticEventRequestKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ p0 a(t0.a aVar) {
            m.e(aVar, "builder");
            return new p0(aVar, (h) null);
        }
    }

    private p0(t0.a aVar) {
        this.f39056a = aVar;
    }

    public /* synthetic */ p0(t0.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ t0 a() {
        z s10 = this.f39056a.build();
        m.d(s10, "_builder.build()");
        return (t0) s10;
    }

    public final /* synthetic */ void b(b bVar, Iterable iterable) {
        m.e(bVar, "<this>");
        m.e(iterable, "values");
        this.f39056a.F(iterable);
    }

    public final /* synthetic */ void c(b bVar) {
        m.e(bVar, "<this>");
        this.f39056a.G();
    }

    public final /* synthetic */ b d() {
        List<s0> H = this.f39056a.H();
        m.d(H, "_builder.getBatchList()");
        return new b(H);
    }
}
