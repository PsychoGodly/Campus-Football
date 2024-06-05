package com.google.android.gms.common.internal;

import android.os.Bundle;
import h5.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class e1 extends q0 {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ c f15380g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e1(c cVar, int i10, Bundle bundle) {
        super(cVar, i10, (Bundle) null);
        this.f15380g = cVar;
    }

    /* access modifiers changed from: protected */
    public final void f(b bVar) {
        if (!this.f15380g.enableLocalFallback() || !c.zzo(this.f15380g)) {
            this.f15380g.zzc.a(bVar);
            this.f15380g.onConnectionFailed(bVar);
            return;
        }
        c.zzk(this.f15380g, 16);
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        this.f15380g.zzc.a(b.f18803f);
        return true;
    }
}
