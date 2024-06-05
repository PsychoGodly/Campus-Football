package io.flutter.plugins.googlemobileads;

import android.util.Log;
import b5.b;
import io.flutter.plugins.googlemobileads.d0;
import io.flutter.plugins.googlemobileads.e;
import java.lang.ref.WeakReference;
import n4.n;
import n4.t;

/* compiled from: FlutterRewardedInterstitialAd */
class e0 extends e.d {

    /* renamed from: b  reason: collision with root package name */
    private final a f33978b;

    /* renamed from: c  reason: collision with root package name */
    private final String f33979c;

    /* renamed from: d  reason: collision with root package name */
    private final h f33980d;

    /* renamed from: e  reason: collision with root package name */
    private final l f33981e;

    /* renamed from: f  reason: collision with root package name */
    private final i f33982f;

    /* renamed from: g  reason: collision with root package name */
    b5.a f33983g;

    /* compiled from: FlutterRewardedInterstitialAd */
    private static final class a extends b implements a5.a, t {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<e0> f33984a;

        a(e0 e0Var) {
            this.f33984a = new WeakReference<>(e0Var);
        }

        /* renamed from: a */
        public void onAdLoaded(b5.a aVar) {
            if (this.f33984a.get() != null) {
                ((e0) this.f33984a.get()).g(aVar);
            }
        }

        public void onAdFailedToLoad(n nVar) {
            if (this.f33984a.get() != null) {
                ((e0) this.f33984a.get()).f(nVar);
            }
        }

        public void onAdMetadataChanged() {
            if (this.f33984a.get() != null) {
                ((e0) this.f33984a.get()).h();
            }
        }

        public void onUserEarnedReward(a5.b bVar) {
            if (this.f33984a.get() != null) {
                ((e0) this.f33984a.get()).i(bVar);
            }
        }
    }

    public e0(int i10, a aVar, String str, l lVar, h hVar) {
        super(i10);
        this.f33978b = aVar;
        this.f33979c = str;
        this.f33981e = lVar;
        this.f33982f = null;
        this.f33980d = hVar;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f33983g = null;
    }

    public void c(boolean z10) {
        b5.a aVar = this.f33983g;
        if (aVar == null) {
            Log.e("FlutterRIAd", "Error setting immersive mode in rewarded interstitial ad - the rewarded interstitial ad wasn't loaded yet.");
        } else {
            aVar.setImmersiveMode(z10);
        }
    }

    public void d() {
        if (this.f33983g == null) {
            Log.e("FlutterRIAd", "Error showing rewarded interstitial - the rewarded interstitial ad wasn't loaded yet.");
        } else if (this.f33978b.f() == null) {
            Log.e("FlutterRIAd", "Tried to show rewarded interstitial ad before activity was bound to the plugin.");
        } else {
            this.f33983g.setFullScreenContentCallback(new s(this.f33978b, this.f33956a));
            this.f33983g.setOnAdMetadataChangedListener(new a(this));
            this.f33983g.show(this.f33978b.f(), new a(this));
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        a aVar = new a(this);
        l lVar = this.f33981e;
        if (lVar != null) {
            h hVar = this.f33980d;
            String str = this.f33979c;
            hVar.j(str, lVar.b(str), aVar);
            return;
        }
        i iVar = this.f33982f;
        if (iVar != null) {
            h hVar2 = this.f33980d;
            String str2 = this.f33979c;
            hVar2.e(str2, iVar.k(str2), aVar);
            return;
        }
        Log.e("FlutterRIAd", "A null or invalid ad request was provided.");
    }

    /* access modifiers changed from: package-private */
    public void f(n nVar) {
        this.f33978b.k(this.f33956a, new e.c(nVar));
    }

    /* access modifiers changed from: package-private */
    public void g(b5.a aVar) {
        this.f33983g = aVar;
        aVar.setOnPaidEventListener(new a0(this.f33978b, this));
        this.f33978b.m(this.f33956a, aVar.getResponseInfo());
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.f33978b.n(this.f33956a);
    }

    /* access modifiers changed from: package-private */
    public void i(a5.b bVar) {
        this.f33978b.u(this.f33956a, new d0.b(Integer.valueOf(bVar.getAmount()), bVar.getType()));
    }

    public void j(f0 f0Var) {
        b5.a aVar = this.f33983g;
        if (aVar != null) {
            aVar.setServerSideVerificationOptions(f0Var.a());
        } else {
            Log.e("FlutterRIAd", "RewardedInterstitialAd is null in setServerSideVerificationOptions");
        }
    }

    public e0(int i10, a aVar, String str, i iVar, h hVar) {
        super(i10);
        this.f33978b = aVar;
        this.f33979c = str;
        this.f33982f = iVar;
        this.f33981e = null;
        this.f33980d = hVar;
    }
}
