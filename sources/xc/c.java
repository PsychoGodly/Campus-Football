package xc;

import android.app.Activity;
import android.content.Context;
import dc.a;
import lc.k;

/* compiled from: SharePlugin */
public class c implements a, ec.a {

    /* renamed from: a  reason: collision with root package name */
    private a f39337a;

    /* renamed from: b  reason: collision with root package name */
    private b f39338b;

    /* renamed from: c  reason: collision with root package name */
    private k f39339c;

    private void a(Context context, Activity activity, lc.c cVar) {
        this.f39339c = new k(cVar, "plugins.flutter.io/share");
        b bVar = new b(context, activity);
        this.f39338b = bVar;
        a aVar = new a(bVar);
        this.f39337a = aVar;
        this.f39339c.e(aVar);
    }

    public void onAttachedToActivity(ec.c cVar) {
        this.f39338b.j(cVar.getActivity());
    }

    public void onAttachedToEngine(a.b bVar) {
        a(bVar.a(), (Activity) null, bVar.b());
    }

    public void onDetachedFromActivity() {
        this.f39338b.j((Activity) null);
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.f39339c.e((k.c) null);
        this.f39339c = null;
        this.f39338b = null;
    }

    public void onReattachedToActivityForConfigChanges(ec.c cVar) {
        onAttachedToActivity(cVar);
    }
}
