package vb;

import com.google.protobuf.i;
import com.google.protobuf.z;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import s8.c;
import vb.s0;

/* compiled from: DiagnosticEventKt.kt */
public final class o0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39048b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final s0.a f39049a;

    /* compiled from: DiagnosticEventKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ o0 a(s0.a aVar) {
            m.e(aVar, "builder");
            return new o0(aVar, (h) null);
        }
    }

    private o0(s0.a aVar) {
        this.f39049a = aVar;
    }

    public /* synthetic */ o0(s0.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ s0 a() {
        z s10 = this.f39049a.build();
        m.d(s10, "_builder.build()");
        return (s0) s10;
    }

    public final /* synthetic */ c b() {
        Map<String, Integer> F = this.f39049a.F();
        m.d(F, "_builder.getIntTagsMap()");
        return new c(F);
    }

    public final /* synthetic */ c c() {
        Map<String, String> G = this.f39049a.G();
        m.d(G, "_builder.getStringTagsMap()");
        return new c(G);
    }

    public final /* synthetic */ void d(c cVar, Map map) {
        m.e(cVar, "<this>");
        m.e(map, "map");
        this.f39049a.H(map);
    }

    public final /* synthetic */ void e(c cVar, Map map) {
        m.e(cVar, "<this>");
        m.e(map, "map");
        this.f39049a.I(map);
    }

    public final void f(c<String, String, Object> cVar, String str, String str2) {
        m.e(cVar, "<this>");
        m.e(str, "key");
        m.e(str2, "value");
        this.f39049a.J(str, str2);
    }

    public final void g(r0 r0Var) {
        m.e(r0Var, "value");
        this.f39049a.K(r0Var);
    }

    public final void h(String str) {
        m.e(str, "value");
        this.f39049a.L(str);
    }

    public final void i(u0 u0Var) {
        m.e(u0Var, "value");
        this.f39049a.M(u0Var);
    }

    public final void j(i iVar) {
        m.e(iVar, "value");
        this.f39049a.N(iVar);
    }

    public final void k(boolean z10) {
        this.f39049a.O(z10);
    }

    public final void l(String str) {
        m.e(str, "value");
        this.f39049a.P(str);
    }

    public final void m(double d10) {
        this.f39049a.Q(d10);
    }

    public final void n(g3 g3Var) {
        m.e(g3Var, "value");
        this.f39049a.R(g3Var);
    }
}
