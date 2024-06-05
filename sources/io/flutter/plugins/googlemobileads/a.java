package io.flutter.plugins.googlemobileads;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.flutter.plugins.googlemobileads.d0;
import io.flutter.plugins.googlemobileads.e;
import java.util.HashMap;
import java.util.Map;
import lc.k;
import n4.y;

/* compiled from: AdInstanceManager */
class a {

    /* renamed from: a  reason: collision with root package name */
    private Activity f33928a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, e> f33929b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final k f33930c;

    /* renamed from: io.flutter.plugins.googlemobileads.a$a  reason: collision with other inner class name */
    /* compiled from: AdInstanceManager */
    class C0387a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f33931a;

        C0387a(Map map) {
            this.f33931a = map;
        }

        public void run() {
            a.this.f33930c.c("onAdEvent", this.f33931a);
        }
    }

    a(k kVar) {
        this.f33930c = kVar;
    }

    private void g(Map<Object, Object> map) {
        new Handler(Looper.getMainLooper()).post(new C0387a(map));
    }

    /* access modifiers changed from: package-private */
    public e b(int i10) {
        return this.f33929b.get(Integer.valueOf(i10));
    }

    /* access modifiers changed from: package-private */
    public Integer c(e eVar) {
        for (Integer next : this.f33929b.keySet()) {
            if (this.f33929b.get(next) == eVar) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void d(int i10) {
        if (this.f33929b.containsKey(Integer.valueOf(i10))) {
            e eVar = this.f33929b.get(Integer.valueOf(i10));
            if (eVar != null) {
                eVar.a();
            }
            this.f33929b.remove(Integer.valueOf(i10));
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        for (Map.Entry next : this.f33929b.entrySet()) {
            if (next.getValue() != null) {
                ((e) next.getValue()).a();
            }
        }
        this.f33929b.clear();
    }

    /* access modifiers changed from: package-private */
    public Activity f() {
        return this.f33928a;
    }

    /* access modifiers changed from: package-private */
    public void h(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put("eventName", "onAdClicked");
        g(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void i(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put("eventName", "onAdClosed");
        g(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void j(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put("eventName", "onAdDismissedFullScreenContent");
        g(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void k(int i10, e.c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put("eventName", "onAdFailedToLoad");
        hashMap.put("loadAdError", cVar);
        g(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void l(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put("eventName", "onAdImpression");
        g(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void m(int i10, y yVar) {
        e.C0388e eVar;
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put("eventName", "onAdLoaded");
        if (yVar == null) {
            eVar = null;
        } else {
            eVar = new e.C0388e(yVar);
        }
        hashMap.put("responseInfo", eVar);
        g(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void n(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put("eventName", "onAdMetadataChanged");
        g(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void o(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put("eventName", "onAdOpened");
        g(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void p(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put("eventName", "onAdShowedFullScreenContent");
        g(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void q(int i10, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put("eventName", "onAppEvent");
        hashMap.put(MediationMetaData.KEY_NAME, str);
        hashMap.put(JsonStorageKeyNames.DATA_KEY, str2);
        g(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void r(int i10, n4.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put("eventName", "onFailedToShowFullScreenContent");
        hashMap.put("error", new e.a(aVar));
        g(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void s(int i10, int i11) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put("eventName", "onFluidAdHeightChanged");
        hashMap.put("height", Integer.valueOf(i11));
        g(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void t(e eVar, n nVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", c(eVar));
        hashMap.put("eventName", "onPaidEvent");
        hashMap.put("valueMicros", Long.valueOf(nVar.f34105c));
        hashMap.put("precision", Integer.valueOf(nVar.f34103a));
        hashMap.put("currencyCode", nVar.f34104b);
        g(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void u(int i10, d0.b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put("eventName", "onRewardedAdUserEarnedReward");
        hashMap.put("rewardItem", bVar);
        g(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void v(Activity activity) {
        this.f33928a = activity;
    }

    /* access modifiers changed from: package-private */
    public boolean w(int i10) {
        e.d dVar = (e.d) b(i10);
        if (dVar == null) {
            return false;
        }
        dVar.d();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void x(e eVar, int i10) {
        if (this.f33929b.get(Integer.valueOf(i10)) == null) {
            this.f33929b.put(Integer.valueOf(i10), eVar);
        } else {
            throw new IllegalArgumentException(String.format("Ad for following adId already exists: %d", new Object[]{Integer.valueOf(i10)}));
        }
    }
}
