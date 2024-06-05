package hb;

import com.google.ads.mediation.admob.AdMobAdapter;
import n4.g;

/* compiled from: AdRequestFactory */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private ab.a f32974a;

    public a(ab.a aVar) {
        this.f32974a = aVar;
    }

    public g a() {
        return c().c();
    }

    public g b(String str) {
        return c().d(str).c();
    }

    public g.a c() {
        return new g.a().h(this.f32974a.b()).b(AdMobAdapter.class, this.f32974a.a());
    }
}
