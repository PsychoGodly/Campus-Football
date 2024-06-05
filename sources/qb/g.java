package qb;

import android.app.Activity;
import dc.a;
import ec.c;
import kotlin.jvm.internal.m;
import qb.a;

/* compiled from: WakelockPlugin.kt */
public final class g implements a, a.c, ec.a {

    /* renamed from: a  reason: collision with root package name */
    private f f37482a;

    public void a(a.b bVar) {
        f fVar = this.f37482a;
        m.b(fVar);
        m.b(bVar);
        fVar.d(bVar);
    }

    public a.C0425a isEnabled() {
        f fVar = this.f37482a;
        m.b(fVar);
        return fVar.b();
    }

    public void onAttachedToActivity(c cVar) {
        m.e(cVar, "binding");
        f fVar = this.f37482a;
        if (fVar != null) {
            fVar.c(cVar.getActivity());
        }
    }

    public void onAttachedToEngine(a.b bVar) {
        m.e(bVar, "flutterPluginBinding");
        d.f(bVar.b(), this);
        this.f37482a = new f();
    }

    public void onDetachedFromActivity() {
        f fVar = this.f37482a;
        if (fVar != null) {
            fVar.c((Activity) null);
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b bVar) {
        m.e(bVar, "binding");
        d.f(bVar.b(), (a.c) null);
        this.f37482a = null;
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
        m.e(cVar, "binding");
        onAttachedToActivity(cVar);
    }
}
