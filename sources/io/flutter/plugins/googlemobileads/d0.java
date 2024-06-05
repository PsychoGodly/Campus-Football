package io.flutter.plugins.googlemobileads;

import a5.c;
import a5.d;
import android.util.Log;
import io.flutter.plugins.googlemobileads.e;
import java.lang.ref.WeakReference;
import n4.n;
import n4.t;

/* compiled from: FlutterRewardedAd */
class d0 extends e.d {

    /* renamed from: b  reason: collision with root package name */
    private final a f33947b;

    /* renamed from: c  reason: collision with root package name */
    private final String f33948c;

    /* renamed from: d  reason: collision with root package name */
    private final h f33949d;

    /* renamed from: e  reason: collision with root package name */
    private final l f33950e;

    /* renamed from: f  reason: collision with root package name */
    private final i f33951f;

    /* renamed from: g  reason: collision with root package name */
    c f33952g;

    /* compiled from: FlutterRewardedAd */
    private static final class a extends d implements a5.a, t {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<d0> f33953a;

        a(d0 d0Var) {
            this.f33953a = new WeakReference<>(d0Var);
        }

        /* renamed from: a */
        public void onAdLoaded(c cVar) {
            if (this.f33953a.get() != null) {
                ((d0) this.f33953a.get()).g(cVar);
            }
        }

        public void onAdFailedToLoad(n nVar) {
            if (this.f33953a.get() != null) {
                ((d0) this.f33953a.get()).f(nVar);
            }
        }

        public void onAdMetadataChanged() {
            if (this.f33953a.get() != null) {
                ((d0) this.f33953a.get()).h();
            }
        }

        public void onUserEarnedReward(a5.b bVar) {
            if (this.f33953a.get() != null) {
                ((d0) this.f33953a.get()).i(bVar);
            }
        }
    }

    /* compiled from: FlutterRewardedAd */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        final Integer f33954a;

        /* renamed from: b  reason: collision with root package name */
        final String f33955b;

        b(Integer num, String str) {
            this.f33954a = num;
            this.f33955b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f33954a.equals(bVar.f33954a)) {
                return false;
            }
            return this.f33955b.equals(bVar.f33955b);
        }

        public int hashCode() {
            return (this.f33954a.hashCode() * 31) + this.f33955b.hashCode();
        }
    }

    public d0(int i10, a aVar, String str, l lVar, h hVar) {
        super(i10);
        this.f33947b = aVar;
        this.f33948c = str;
        this.f33950e = lVar;
        this.f33951f = null;
        this.f33949d = hVar;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f33952g = null;
    }

    public void c(boolean z10) {
        c cVar = this.f33952g;
        if (cVar == null) {
            Log.e("FlutterRewardedAd", "Error setting immersive mode in rewarded ad - the rewarded ad wasn't loaded yet.");
        } else {
            cVar.setImmersiveMode(z10);
        }
    }

    public void d() {
        if (this.f33952g == null) {
            Log.e("FlutterRewardedAd", "Error showing rewarded - the rewarded ad wasn't loaded yet.");
        } else if (this.f33947b.f() == null) {
            Log.e("FlutterRewardedAd", "Tried to show rewarded ad before activity was bound to the plugin.");
        } else {
            this.f33952g.setFullScreenContentCallback(new s(this.f33947b, this.f33956a));
            this.f33952g.setOnAdMetadataChangedListener(new a(this));
            this.f33952g.show(this.f33947b.f(), new a(this));
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        a aVar = new a(this);
        l lVar = this.f33950e;
        if (lVar != null) {
            h hVar = this.f33949d;
            String str = this.f33948c;
            hVar.i(str, lVar.b(str), aVar);
            return;
        }
        i iVar = this.f33951f;
        if (iVar != null) {
            h hVar2 = this.f33949d;
            String str2 = this.f33948c;
            hVar2.d(str2, iVar.k(str2), aVar);
            return;
        }
        Log.e("FlutterRewardedAd", "A null or invalid ad request was provided.");
    }

    /* access modifiers changed from: package-private */
    public void f(n nVar) {
        this.f33947b.k(this.f33956a, new e.c(nVar));
    }

    /* access modifiers changed from: package-private */
    public void g(c cVar) {
        this.f33952g = cVar;
        cVar.setOnPaidEventListener(new a0(this.f33947b, this));
        this.f33947b.m(this.f33956a, cVar.getResponseInfo());
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.f33947b.n(this.f33956a);
    }

    /* access modifiers changed from: package-private */
    public void i(a5.b bVar) {
        this.f33947b.u(this.f33956a, new b(Integer.valueOf(bVar.getAmount()), bVar.getType()));
    }

    public void j(f0 f0Var) {
        c cVar = this.f33952g;
        if (cVar != null) {
            cVar.setServerSideVerificationOptions(f0Var.a());
        } else {
            Log.e("FlutterRewardedAd", "RewardedAd is null in setServerSideVerificationOptions");
        }
    }

    public d0(int i10, a aVar, String str, i iVar, h hVar) {
        super(i10);
        this.f33947b = aVar;
        this.f33948c = str;
        this.f33951f = iVar;
        this.f33950e = null;
        this.f33949d = hVar;
    }
}
