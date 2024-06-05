package com.google.android.gms.measurement.internal;

import androidx.collection.e;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzb;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class n5 extends e<String, zzb> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ i5 f24859a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    n5(i5 i5Var, int i10) {
        super(20);
        this.f24859a = i5Var;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        q.g(str);
        return i5.u(this.f24859a, str);
    }
}
