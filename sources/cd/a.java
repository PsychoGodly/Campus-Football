package cd;

import android.content.Context;
import dc.a;
import kotlin.jvm.internal.m;
import lc.c;
import lc.k;

/* compiled from: FlutterToastPlugin.kt */
public final class a implements dc.a {

    /* renamed from: a  reason: collision with root package name */
    private k f31971a;

    private final void a(c cVar, Context context) {
        this.f31971a = new k(cVar, "PonnamKarthik/fluttertoast");
        c cVar2 = new c(context);
        k kVar = this.f31971a;
        if (kVar != null) {
            kVar.e(cVar2);
        }
    }

    private final void b() {
        k kVar = this.f31971a;
        if (kVar != null) {
            kVar.e((k.c) null);
        }
        this.f31971a = null;
    }

    public void onAttachedToEngine(a.b bVar) {
        m.e(bVar, "binding");
        c b10 = bVar.b();
        m.d(b10, "binding.binaryMessenger");
        Context a10 = bVar.a();
        m.d(a10, "binding.applicationContext");
        a(b10, a10);
    }

    public void onDetachedFromEngine(a.b bVar) {
        m.e(bVar, "p0");
        b();
    }
}
