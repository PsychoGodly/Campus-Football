package io.flutter.plugins.googlemobileads;

import io.flutter.plugins.googlemobileads.e;
import n4.d;
import n4.n;

/* compiled from: FlutterAdListener */
class f extends d {

    /* renamed from: a  reason: collision with root package name */
    protected final int f33985a;

    /* renamed from: b  reason: collision with root package name */
    protected final a f33986b;

    f(int i10, a aVar) {
        this.f33985a = i10;
        this.f33986b = aVar;
    }

    public void onAdClicked() {
        this.f33986b.h(this.f33985a);
    }

    public void onAdClosed() {
        this.f33986b.i(this.f33985a);
    }

    public void onAdFailedToLoad(n nVar) {
        this.f33986b.k(this.f33985a, new e.c(nVar));
    }

    public void onAdImpression() {
        this.f33986b.l(this.f33985a);
    }

    public void onAdOpened() {
        this.f33986b.o(this.f33985a);
    }
}
