package io.flutter.plugins.googlemobileads;

import androidx.lifecycle.a0;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import lc.c;
import lc.d;
import lc.j;
import lc.k;

final class AppStateNotifier implements m, k.c, d.C0413d {

    /* renamed from: a  reason: collision with root package name */
    private final k f33925a;

    /* renamed from: b  reason: collision with root package name */
    private final d f33926b;

    /* renamed from: c  reason: collision with root package name */
    private d.b f33927c;

    AppStateNotifier(c cVar) {
        k kVar = new k(cVar, "plugins.flutter.io/google_mobile_ads/app_state_method");
        this.f33925a = kVar;
        kVar.e(this);
        d dVar = new d(cVar, "plugins.flutter.io/google_mobile_ads/app_state_event");
        this.f33926b = dVar;
        dVar.d(this);
    }

    public void g(Object obj) {
        this.f33927c = null;
    }

    public void h(Object obj, d.b bVar) {
        this.f33927c = bVar;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        a0.l().getLifecycle().a(this);
    }

    /* access modifiers changed from: package-private */
    public void j() {
        a0.l().getLifecycle().d(this);
    }

    public void onMethodCall(j jVar, k.d dVar) {
        String str = jVar.f36116a;
        str.hashCode();
        if (str.equals("stop")) {
            j();
        } else if (!str.equals("start")) {
            dVar.notImplemented();
        } else {
            i();
        }
    }

    public void onStateChanged(p pVar, i.a aVar) {
        d.b bVar;
        d.b bVar2;
        if (aVar == i.a.ON_START && (bVar2 = this.f33927c) != null) {
            bVar2.success("foreground");
        } else if (aVar == i.a.ON_STOP && (bVar = this.f33927c) != null) {
            bVar.success("background");
        }
    }
}
