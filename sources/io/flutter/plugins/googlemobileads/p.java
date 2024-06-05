package io.flutter.plugins.googlemobileads;

import android.util.Log;
import bd.c;
import io.flutter.plugins.googlemobileads.e;
import java.lang.ref.WeakReference;
import n4.n;
import p4.a;

/* compiled from: FlutterAppOpenAd */
class p extends e.d {

    /* renamed from: b  reason: collision with root package name */
    private final a f34113b;

    /* renamed from: c  reason: collision with root package name */
    private final String f34114c;

    /* renamed from: d  reason: collision with root package name */
    private final int f34115d;

    /* renamed from: e  reason: collision with root package name */
    private final l f34116e;

    /* renamed from: f  reason: collision with root package name */
    private final i f34117f;

    /* renamed from: g  reason: collision with root package name */
    private p4.a f34118g;

    /* renamed from: h  reason: collision with root package name */
    private final h f34119h;

    /* compiled from: FlutterAppOpenAd */
    private static final class a extends a.C0225a {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<p> f34120a;

        a(p pVar) {
            this.f34120a = new WeakReference<>(pVar);
        }

        /* renamed from: a */
        public void onAdLoaded(p4.a aVar) {
            if (this.f34120a.get() != null) {
                ((p) this.f34120a.get()).j(aVar);
            }
        }

        public void onAdFailedToLoad(n nVar) {
            if (this.f34120a.get() != null) {
                ((p) this.f34120a.get()).i(nVar);
            }
        }
    }

    p(int i10, int i11, a aVar, String str, l lVar, i iVar, h hVar) {
        super(i10);
        c.b((lVar == null && iVar == null) ? false : true, "One of request and adManagerAdRequest must be non-null.");
        this.f34113b = aVar;
        this.f34115d = i11;
        this.f34114c = str;
        this.f34116e = lVar;
        this.f34117f = iVar;
        this.f34119h = hVar;
    }

    private int g() {
        int i10 = this.f34115d;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2 || i10 == 3) {
            return 2;
        }
        Log.e("FlutterAppOpenAd", "Passed unknown app open orientation: " + this.f34115d);
        return 1;
    }

    /* access modifiers changed from: private */
    public void i(n nVar) {
        this.f34113b.k(this.f33956a, new e.c(nVar));
    }

    /* access modifiers changed from: private */
    public void j(p4.a aVar) {
        this.f34118g = aVar;
        aVar.setOnPaidEventListener(new a0(this.f34113b, this));
        this.f34113b.m(this.f33956a, aVar.getResponseInfo());
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f34118g = null;
    }

    /* access modifiers changed from: package-private */
    public void c(boolean z10) {
        p4.a aVar = this.f34118g;
        if (aVar == null) {
            Log.w("FlutterAppOpenAd", "Tried to set immersive mode on app open ad before it was loaded");
        } else {
            aVar.setImmersiveMode(z10);
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (this.f34118g == null) {
            Log.w("FlutterAppOpenAd", "Tried to show app open ad before it was loaded");
        } else if (this.f34113b.f() == null) {
            Log.e("FlutterAppOpenAd", "Tried to show app open ad before activity was bound to the plugin.");
        } else {
            this.f34118g.setFullScreenContentCallback(new s(this.f34113b, this.f33956a));
            this.f34118g.show(this.f34113b.f());
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        l lVar = this.f34116e;
        if (lVar != null) {
            h hVar = this.f34119h;
            String str = this.f34114c;
            hVar.f(str, lVar.b(str), g(), new a(this));
            return;
        }
        i iVar = this.f34117f;
        if (iVar != null) {
            h hVar2 = this.f34119h;
            String str2 = this.f34114c;
            hVar2.a(str2, iVar.k(str2), g(), new a(this));
        }
    }
}
