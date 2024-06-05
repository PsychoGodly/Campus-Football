package x1;

import android.app.Activity;
import android.content.Context;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;
import dc.a;
import ec.c;
import java.util.HashMap;
import lc.j;
import lc.k;

/* compiled from: FacebookAudienceNetworkPlugin */
public class a implements dc.a, k.c, ec.a {

    /* renamed from: a  reason: collision with root package name */
    private k f23570a;

    /* renamed from: b  reason: collision with root package name */
    private k f23571b;

    /* renamed from: c  reason: collision with root package name */
    private k f23572c;

    /* renamed from: d  reason: collision with root package name */
    private Activity f23573d;

    /* renamed from: f  reason: collision with root package name */
    private Context f23574f;

    private boolean a(HashMap hashMap) {
        String str = (String) hashMap.get("testingId");
        AudienceNetworkAds.initialize(this.f23573d.getApplicationContext());
        if (str == null) {
            return true;
        }
        AdSettings.addTestDevice(str);
        return true;
    }

    public void onAttachedToActivity(c cVar) {
        this.f23573d = cVar.getActivity();
    }

    public void onAttachedToEngine(a.b bVar) {
        k kVar = new k(bVar.b(), "fb.audience.network.io");
        this.f23570a = kVar;
        kVar.e(this);
        this.f23574f = bVar.a();
        k kVar2 = new k(bVar.b(), "fb.audience.network.io/interstitialAd");
        this.f23571b = kVar2;
        kVar2.e(new d(this.f23574f, kVar2));
        k kVar3 = new k(bVar.b(), "fb.audience.network.io/rewardedAd");
        this.f23572c = kVar3;
        kVar3.e(new g(this.f23574f, kVar3));
        bVar.e().a("fb.audience.network.io/bannerAd", new b(bVar.b()));
        bVar.e().a("fb.audience.network.io/nativeAd", new e(bVar.b()));
    }

    public void onDetachedFromActivity() {
    }

    public void onDetachedFromActivityForConfigChanges() {
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.f23570a.e((k.c) null);
        this.f23571b.e((k.c) null);
        this.f23572c.e((k.c) null);
    }

    public void onMethodCall(j jVar, k.d dVar) {
        if (jVar.f36116a.equals("init")) {
            dVar.success(Boolean.valueOf(a((HashMap) jVar.f36117b)));
        } else {
            dVar.notImplemented();
        }
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
        onAttachedToActivity(cVar);
    }
}
