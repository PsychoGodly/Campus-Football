package io.flutter.plugins.googlemobileads;

import android.util.Log;
import io.flutter.plugins.googlemobileads.e;
import java.lang.ref.WeakReference;
import n4.n;
import o4.c;
import o4.d;

/* compiled from: FlutterAdManagerInterstitialAd */
class k extends e.d {

    /* renamed from: b  reason: collision with root package name */
    private final a f34020b;

    /* renamed from: c  reason: collision with root package name */
    private final String f34021c;

    /* renamed from: d  reason: collision with root package name */
    private final i f34022d;

    /* renamed from: e  reason: collision with root package name */
    private c f34023e;

    /* renamed from: f  reason: collision with root package name */
    private final h f34024f;

    /* compiled from: FlutterAdManagerInterstitialAd */
    private static final class a extends d implements o4.e {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<k> f34025a;

        a(k kVar) {
            this.f34025a = new WeakReference<>(kVar);
        }

        /* renamed from: a */
        public void onAdLoaded(c cVar) {
            if (this.f34025a.get() != null) {
                ((k) this.f34025a.get()).g(cVar);
            }
        }

        public void onAdFailedToLoad(n nVar) {
            if (this.f34025a.get() != null) {
                ((k) this.f34025a.get()).f(nVar);
            }
        }

        public void onAppEvent(String str, String str2) {
            if (this.f34025a.get() != null) {
                ((k) this.f34025a.get()).h(str, str2);
            }
        }
    }

    public k(int i10, a aVar, String str, i iVar, h hVar) {
        super(i10);
        this.f34020b = aVar;
        this.f34021c = str;
        this.f34022d = iVar;
        this.f34024f = hVar;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f34023e = null;
    }

    public void c(boolean z10) {
        c cVar = this.f34023e;
        if (cVar == null) {
            Log.e("FltGAMInterstitialAd", "The interstitial wasn't loaded yet.");
        } else {
            cVar.setImmersiveMode(z10);
        }
    }

    public void d() {
        if (this.f34023e == null) {
            Log.e("FltGAMInterstitialAd", "The interstitial wasn't loaded yet.");
        } else if (this.f34020b.f() == null) {
            Log.e("FltGAMInterstitialAd", "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            this.f34023e.setFullScreenContentCallback(new s(this.f34020b, this.f33956a));
            this.f34023e.show(this.f34020b.f());
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        h hVar = this.f34024f;
        String str = this.f34021c;
        hVar.b(str, this.f34022d.k(str), new a(this));
    }

    /* access modifiers changed from: package-private */
    public void f(n nVar) {
        this.f34020b.k(this.f33956a, new e.c(nVar));
    }

    /* access modifiers changed from: package-private */
    public void g(c cVar) {
        this.f34023e = cVar;
        cVar.setAppEventListener(new a(this));
        cVar.setOnPaidEventListener(new a0(this.f34020b, this));
        this.f34020b.m(this.f33956a, cVar.getResponseInfo());
    }

    /* access modifiers changed from: package-private */
    public void h(String str, String str2) {
        this.f34020b.q(this.f33956a, str, str2);
    }
}
