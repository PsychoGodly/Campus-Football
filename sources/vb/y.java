package vb;

import com.google.protobuf.z;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import s8.b;
import vb.b0;

/* compiled from: CampaignStateKt.kt */
public final class y {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39116b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final b0.a f39117a;

    /* compiled from: CampaignStateKt.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final /* synthetic */ y a(b0.a aVar) {
            m.e(aVar, "builder");
            return new y(aVar, (h) null);
        }
    }

    private y(b0.a aVar) {
        this.f39117a = aVar;
    }

    public /* synthetic */ y(b0.a aVar, h hVar) {
        this(aVar);
    }

    public final /* synthetic */ b0 a() {
        z s10 = this.f39117a.build();
        m.d(s10, "_builder.build()");
        return (b0) s10;
    }

    public final /* synthetic */ void b(b bVar, Iterable iterable) {
        m.e(bVar, "<this>");
        m.e(iterable, "values");
        this.f39117a.F(iterable);
    }

    public final /* synthetic */ void c(b bVar, Iterable iterable) {
        m.e(bVar, "<this>");
        m.e(iterable, "values");
        this.f39117a.G(iterable);
    }

    public final /* synthetic */ b d() {
        List<a0> H = this.f39117a.H();
        m.d(H, "_builder.getLoadedCampaignsList()");
        return new b(H);
    }

    public final /* synthetic */ b e() {
        List<a0> I = this.f39117a.I();
        m.d(I, "_builder.getShownCampaignsList()");
        return new b(I);
    }
}
