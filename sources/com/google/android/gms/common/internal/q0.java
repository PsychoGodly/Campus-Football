package com.google.android.gms.common.internal;

import android.os.Bundle;
import h5.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
abstract class q0 extends a1 {

    /* renamed from: d  reason: collision with root package name */
    public final int f15467d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f15468e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ c f15469f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected q0(c cVar, int i10, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f15469f = cVar;
        this.f15467d = i10;
        this.f15468e = bundle;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.Parcelable] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void a(java.lang.Object r3) {
        /*
            r2 = this;
            int r3 = r2.f15467d
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L_0x001c
            boolean r3 = r2.g()
            if (r3 != 0) goto L_0x001b
            com.google.android.gms.common.internal.c r3 = r2.f15469f
            r3.zzp(r0, (android.os.IInterface) null)
            h5.b r3 = new h5.b
            r0 = 8
            r3.<init>(r0, r1)
            r2.f(r3)
        L_0x001b:
            return
        L_0x001c:
            com.google.android.gms.common.internal.c r3 = r2.f15469f
            r3.zzp(r0, (android.os.IInterface) null)
            android.os.Bundle r3 = r2.f15468e
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L_0x002e:
            h5.b r3 = new h5.b
            int r0 = r2.f15467d
            r3.<init>(r0, r1)
            r2.f(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.q0.a(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    public final void b() {
    }

    /* access modifiers changed from: protected */
    public abstract void f(b bVar);

    /* access modifiers changed from: protected */
    public abstract boolean g();
}
