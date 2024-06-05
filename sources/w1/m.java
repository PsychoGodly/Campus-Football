package w1;

import android.app.Activity;
import android.content.Context;
import dc.a;
import ec.c;
import lc.k;
import lc.o;

/* compiled from: PermissionHandlerPlugin */
public final class m implements a, ec.a {

    /* renamed from: a  reason: collision with root package name */
    private n f23507a;

    /* renamed from: b  reason: collision with root package name */
    private k f23508b;

    /* renamed from: c  reason: collision with root package name */
    private o f23509c;

    /* renamed from: d  reason: collision with root package name */
    private c f23510d;

    /* renamed from: f  reason: collision with root package name */
    private l f23511f;

    private void a() {
        c cVar = this.f23510d;
        if (cVar != null) {
            cVar.e(this.f23507a);
            this.f23510d.c(this.f23507a);
        }
    }

    private void b() {
        o oVar = this.f23509c;
        if (oVar != null) {
            oVar.b(this.f23507a);
            this.f23509c.a(this.f23507a);
            return;
        }
        c cVar = this.f23510d;
        if (cVar != null) {
            cVar.b(this.f23507a);
            this.f23510d.a(this.f23507a);
        }
    }

    private void c(Context context, lc.c cVar) {
        this.f23508b = new k(cVar, "flutter.baseflow.com/permissions/methods");
        l lVar = new l(context, new a(), this.f23507a, new p());
        this.f23511f = lVar;
        this.f23508b.e(lVar);
    }

    private void d(Activity activity) {
        n nVar = this.f23507a;
        if (nVar != null) {
            nVar.h(activity);
        }
    }

    private void e() {
        this.f23508b.e((k.c) null);
        this.f23508b = null;
        this.f23511f = null;
    }

    private void f() {
        n nVar = this.f23507a;
        if (nVar != null) {
            nVar.h((Activity) null);
        }
    }

    public void onAttachedToActivity(c cVar) {
        d(cVar.getActivity());
        this.f23510d = cVar;
        b();
    }

    public void onAttachedToEngine(a.b bVar) {
        this.f23507a = new n(bVar.a());
        c(bVar.a(), bVar.b());
    }

    public void onDetachedFromActivity() {
        f();
        a();
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b bVar) {
        e();
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
        onAttachedToActivity(cVar);
    }
}
