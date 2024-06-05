package tb;

import lc.j;
import lc.k;

/* compiled from: ConnectivityMethodChannelHandler */
class e implements k.c {

    /* renamed from: a  reason: collision with root package name */
    private final a f38551a;

    e(a aVar) {
        this.f38551a = aVar;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        if ("check".equals(jVar.f36116a)) {
            dVar.success(this.f38551a.b());
        } else {
            dVar.notImplemented();
        }
    }
}
