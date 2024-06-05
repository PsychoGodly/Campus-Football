package com.applovin.impl.sdk;

import com.applovin.impl.h8;
import com.applovin.impl.ho;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.a;
import java.lang.ref.WeakReference;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final k f11552a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f11553b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference f11554c;

    /* renamed from: d  reason: collision with root package name */
    private ho f11555d;

    private b(h8 h8Var, a.C0136a aVar, k kVar) {
        this.f11553b = new WeakReference(h8Var);
        this.f11554c = new WeakReference(aVar);
        this.f11552a = kVar;
    }

    public static b a(h8 h8Var, a.C0136a aVar, k kVar) {
        b bVar = new b(h8Var, aVar, kVar);
        bVar.a(h8Var.getTimeToLiveMillis());
        return bVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        d();
        this.f11552a.f().a(this);
    }

    public h8 b() {
        return (h8) this.f11553b.get();
    }

    public void d() {
        a();
        h8 b10 = b();
        if (b10 != null) {
            b10.setExpired();
            a.C0136a aVar = (a.C0136a) this.f11554c.get();
            if (aVar != null) {
                aVar.onAdExpired(b10);
            }
        }
    }

    public void a(long j10) {
        a();
        if (((Boolean) this.f11552a.a(oj.f10369o1)).booleanValue() || !this.f11552a.f0().isApplicationPaused()) {
            this.f11555d = ho.a(j10, this.f11552a, new d0(this));
        }
    }

    public void a() {
        ho hoVar = this.f11555d;
        if (hoVar != null) {
            hoVar.a();
            this.f11555d = null;
        }
    }
}
