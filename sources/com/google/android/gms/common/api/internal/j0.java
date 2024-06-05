package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.k0;
import h5.b;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class j0 extends q0 {

    /* renamed from: b  reason: collision with root package name */
    private final Map<a.f, g0> f15163b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0 f15164c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j0(r0 r0Var, Map<a.f, g0> map) {
        super(r0Var, (p0) null);
        this.f15164c = r0Var;
        this.f15163b = map;
    }

    public final void a() {
        k0 k0Var = new k0(this.f15164c.f15226d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (a.f next : this.f15163b.keySet()) {
            if (!next.requiresGooglePlayServices() || this.f15163b.get(next).f15128c) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        int i10 = -1;
        int i11 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i11 < size) {
                i10 = k0Var.b(this.f15164c.f15225c, (a.f) arrayList.get(i11));
                i11++;
                if (i10 != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i11 < size2) {
                i10 = k0Var.b(this.f15164c.f15225c, (a.f) arrayList2.get(i11));
                i11++;
                if (i10 == 0) {
                    break;
                }
            }
        }
        if (i10 != 0) {
            b bVar = new b(i10, (PendingIntent) null);
            r0 r0Var = this.f15164c;
            r0Var.f15223a.l(new h0(this, r0Var, bVar));
            return;
        }
        r0 r0Var2 = this.f15164c;
        if (r0Var2.f15235m && r0Var2.f15233k != null) {
            r0Var2.f15233k.d();
        }
        for (a.f next2 : this.f15163b.keySet()) {
            c.C0157c cVar = this.f15163b.get(next2);
            if (!next2.requiresGooglePlayServices() || k0Var.b(this.f15164c.f15225c, next2) == 0) {
                next2.connect(cVar);
            } else {
                r0 r0Var3 = this.f15164c;
                r0Var3.f15223a.l(new i0(this, r0Var3, cVar));
            }
        }
    }
}
