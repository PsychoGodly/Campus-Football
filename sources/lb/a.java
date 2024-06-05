package lb;

import com.google.ads.mediation.admob.AdMobAdapter;
import n4.g;

/* compiled from: AdRequestFactory */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private ab.a f36091a;

    public a(ab.a aVar) {
        this.f36091a = aVar;
    }

    public g a() {
        return c().c();
    }

    public g b(String str) {
        return c().setAdString(str).c();
    }

    public g.a c() {
        return new g.a().setRequestAgent(this.f36091a.b()).addNetworkExtrasBundle(AdMobAdapter.class, this.f36091a.a());
    }
}
