package io.flutter.plugins.googlemobileads;

import java.lang.ref.WeakReference;

/* compiled from: FlutterAdListener */
class r extends f {

    /* renamed from: c  reason: collision with root package name */
    final WeakReference<g> f34127c;

    r(int i10, a aVar, g gVar) {
        super(i10, aVar);
        this.f34127c = new WeakReference<>(gVar);
    }

    public void onAdLoaded() {
        if (this.f34127c.get() != null) {
            ((g) this.f34127c.get()).onAdLoaded();
        }
    }
}
