package o1;

import android.content.Context;
import android.os.Build;
import androidx.work.q;
import n1.b;
import r1.p;
import t1.a;

/* compiled from: NetworkUnmeteredController */
public class g extends c<b> {
    public g(Context context, a aVar) {
        super(p1.g.c(context, aVar).d());
    }

    /* access modifiers changed from: package-private */
    public boolean b(p pVar) {
        return pVar.f21935j.b() == q.UNMETERED || (Build.VERSION.SDK_INT >= 30 && pVar.f21935j.b() == q.TEMPORARILY_UNMETERED);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean c(b bVar) {
        return !bVar.a() || bVar.b();
    }
}
