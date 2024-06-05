package ub;

import android.content.Context;
import dc.a;
import lc.c;
import lc.k;

/* compiled from: DeviceInfoPlusPlugin */
public class a implements dc.a {

    /* renamed from: a  reason: collision with root package name */
    k f38742a;

    private void a(c cVar, Context context) {
        this.f38742a = new k(cVar, "dev.fluttercommunity.plus/device_info");
        this.f38742a.e(new b(context.getContentResolver(), context.getPackageManager()));
    }

    private void b() {
        this.f38742a.e((k.c) null);
        this.f38742a = null;
    }

    public void onAttachedToEngine(a.b bVar) {
        a(bVar.b(), bVar.a());
    }

    public void onDetachedFromEngine(a.b bVar) {
        b();
    }
}
