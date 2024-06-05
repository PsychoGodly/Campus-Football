package o1;

import android.content.Context;
import android.os.Build;
import androidx.work.q;
import n1.b;
import p1.g;
import r1.p;
import t1.a;

/* compiled from: NetworkConnectedController */
public class d extends c<b> {
    public d(Context context, a aVar) {
        super(g.c(context, aVar).d());
    }

    /* access modifiers changed from: package-private */
    public boolean b(p pVar) {
        return pVar.f21935j.b() == q.CONNECTED;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean c(b bVar) {
        if (Build.VERSION.SDK_INT < 26) {
            return !bVar.a();
        }
        if (!bVar.a() || !bVar.d()) {
            return true;
        }
        return false;
    }
}
