package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.p;
import java.util.ArrayList;
import java.util.List;
import n1.d;

/* compiled from: ConstraintsCommandHandler */
class c {

    /* renamed from: e  reason: collision with root package name */
    private static final String f5213e = p.f("ConstraintsCmdHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f5214a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5215b;

    /* renamed from: c  reason: collision with root package name */
    private final e f5216c;

    /* renamed from: d  reason: collision with root package name */
    private final d f5217d;

    c(Context context, int i10, e eVar) {
        this.f5214a = context;
        this.f5215b = i10;
        this.f5216c = eVar;
        this.f5217d = new d(context, eVar.f(), (n1.c) null);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        List<r1.p> g10 = this.f5216c.g().q().B().g();
        ConstraintProxy.a(this.f5214a, g10);
        this.f5217d.d(g10);
        ArrayList<r1.p> arrayList = new ArrayList<>(g10.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (r1.p next : g10) {
            String str = next.f21926a;
            if (currentTimeMillis >= next.a() && (!next.b() || this.f5217d.c(str))) {
                arrayList.add(next);
            }
        }
        for (r1.p pVar : arrayList) {
            String str2 = pVar.f21926a;
            Intent b10 = b.b(this.f5214a, str2);
            p.c().a(f5213e, String.format("Creating a delay_met command for workSpec with id (%s)", new Object[]{str2}), new Throwable[0]);
            e eVar = this.f5216c;
            eVar.k(new e.b(eVar, b10, this.f5215b));
        }
        this.f5217d.e();
    }
}
