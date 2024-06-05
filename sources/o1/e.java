package o1;

import android.content.Context;
import android.os.Build;
import androidx.work.p;
import androidx.work.q;
import n1.b;
import p1.g;
import t1.a;

/* compiled from: NetworkMeteredController */
public class e extends c<b> {

    /* renamed from: e  reason: collision with root package name */
    private static final String f20989e = p.f("NetworkMeteredCtrlr");

    public e(Context context, a aVar) {
        super(g.c(context, aVar).d());
    }

    /* access modifiers changed from: package-private */
    public boolean b(r1.p pVar) {
        return pVar.f21935j.b() == q.METERED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean c(b bVar) {
        if (Build.VERSION.SDK_INT < 26) {
            p.c().a(f20989e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !bVar.a();
        } else if (!bVar.a() || !bVar.b()) {
            return true;
        } else {
            return false;
        }
    }
}
