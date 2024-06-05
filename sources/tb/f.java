package tb;

import android.content.Context;
import android.net.ConnectivityManager;
import dc.a;
import lc.c;
import lc.d;
import lc.k;

/* compiled from: ConnectivityPlugin */
public class f implements a {

    /* renamed from: a  reason: collision with root package name */
    private k f38552a;

    /* renamed from: b  reason: collision with root package name */
    private d f38553b;

    /* renamed from: c  reason: collision with root package name */
    private d f38554c;

    private void a(c cVar, Context context) {
        this.f38552a = new k(cVar, "dev.fluttercommunity.plus/connectivity");
        this.f38553b = new d(cVar, "dev.fluttercommunity.plus/connectivity_status");
        a aVar = new a((ConnectivityManager) context.getSystemService("connectivity"));
        e eVar = new e(aVar);
        this.f38554c = new d(context, aVar);
        this.f38552a.e(eVar);
        this.f38553b.d(this.f38554c);
    }

    private void b() {
        this.f38552a.e((k.c) null);
        this.f38553b.d((d.C0413d) null);
        this.f38554c.g((Object) null);
        this.f38552a = null;
        this.f38553b = null;
        this.f38554c = null;
    }

    public void onAttachedToEngine(a.b bVar) {
        a(bVar.b(), bVar.a());
    }

    public void onDetachedFromEngine(a.b bVar) {
        b();
    }
}
