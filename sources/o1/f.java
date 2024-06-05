package o1;

import android.content.Context;
import android.os.Build;
import androidx.work.p;
import androidx.work.q;
import n1.b;
import p1.g;
import t1.a;

/* compiled from: NetworkNotRoamingController */
public class f extends c<b> {

    /* renamed from: e  reason: collision with root package name */
    private static final String f20990e = p.f("NetworkNotRoamingCtrlr");

    public f(Context context, a aVar) {
        super(g.c(context, aVar).d());
    }

    /* access modifiers changed from: package-private */
    public boolean b(r1.p pVar) {
        return pVar.f21935j.b() == q.NOT_ROAMING;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean c(b bVar) {
        if (Build.VERSION.SDK_INT < 24) {
            p.c().a(f20990e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !bVar.a();
        } else if (!bVar.a() || !bVar.c()) {
            return true;
        } else {
            return false;
        }
    }
}
