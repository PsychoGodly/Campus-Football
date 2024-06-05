package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.nativead.b;
import java.lang.ref.WeakReference;

/* compiled from: FlutterAdListener */
class y implements b.c {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<w> f34160a;

    y(w wVar) {
        this.f34160a = new WeakReference<>(wVar);
    }

    public void onNativeAdLoaded(b bVar) {
        if (this.f34160a.get() != null) {
            ((w) this.f34160a.get()).d(bVar);
        }
    }
}
