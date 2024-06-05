package io.flutter.plugins.googlemobileads;

import android.util.Log;
import io.flutter.plugins.googlemobileads.e;
import java.lang.ref.WeakReference;
import n4.n;
import u4.b;

/* compiled from: FlutterInterstitialAd */
class u extends e.d {

    /* renamed from: b  reason: collision with root package name */
    private final a f34131b;

    /* renamed from: c  reason: collision with root package name */
    private final String f34132c;

    /* renamed from: d  reason: collision with root package name */
    private final l f34133d;

    /* renamed from: e  reason: collision with root package name */
    private u4.a f34134e;

    /* renamed from: f  reason: collision with root package name */
    private final h f34135f;

    /* compiled from: FlutterInterstitialAd */
    private static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<u> f34136a;

        a(u uVar) {
            this.f34136a = new WeakReference<>(uVar);
        }

        /* renamed from: a */
        public void onAdLoaded(u4.a aVar) {
            if (this.f34136a.get() != null) {
                ((u) this.f34136a.get()).g(aVar);
            }
        }

        public void onAdFailedToLoad(n nVar) {
            if (this.f34136a.get() != null) {
                ((u) this.f34136a.get()).f(nVar);
            }
        }
    }

    public u(int i10, a aVar, String str, l lVar, h hVar) {
        super(i10);
        this.f34131b = aVar;
        this.f34132c = str;
        this.f34133d = lVar;
        this.f34135f = hVar;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f34134e = null;
    }

    public void c(boolean z10) {
        u4.a aVar = this.f34134e;
        if (aVar == null) {
            Log.e("FlutterInterstitialAd", "Error setting immersive mode in interstitial ad - the interstitial ad wasn't loaded yet.");
        } else {
            aVar.setImmersiveMode(z10);
        }
    }

    public void d() {
        if (this.f34134e == null) {
            Log.e("FlutterInterstitialAd", "Error showing interstitial - the interstitial ad wasn't loaded yet.");
        } else if (this.f34131b.f() == null) {
            Log.e("FlutterInterstitialAd", "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            this.f34134e.setFullScreenContentCallback(new s(this.f34131b, this.f33956a));
            this.f34134e.show(this.f34131b.f());
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        String str;
        l lVar;
        if (this.f34131b != null && (str = this.f34132c) != null && (lVar = this.f34133d) != null) {
            this.f34135f.g(str, lVar.b(str), new a(this));
        }
    }

    /* access modifiers changed from: package-private */
    public void f(n nVar) {
        this.f34131b.k(this.f33956a, new e.c(nVar));
    }

    /* access modifiers changed from: package-private */
    public void g(u4.a aVar) {
        this.f34134e = aVar;
        aVar.setOnPaidEventListener(new a0(this.f34131b, this));
        this.f34131b.m(this.f33956a, aVar.getResponseInfo());
    }
}
