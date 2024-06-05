package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzajw;
import com.google.android.gms.internal.ads.zzaks;
import com.google.android.gms.internal.ads.zzakt;
import com.google.android.gms.internal.ads.zzalt;
import com.google.android.gms.internal.ads.zzbyz;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class k0 extends zzalt {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ byte[] f14824a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Map f14825b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzbyz f14826c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    k0(q0 q0Var, int i10, String str, zzakt zzakt, zzaks zzaks, byte[] bArr, Map map, zzbyz zzbyz) {
        super(i10, str, zzakt, zzaks);
        this.f14824a = bArr;
        this.f14825b = map;
        this.f14826c = zzbyz;
    }

    public final Map zzl() throws zzajw {
        Map map = this.f14825b;
        return map == null ? Collections.emptyMap() : map;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzo((String) obj);
    }

    public final byte[] zzx() throws zzajw {
        byte[] bArr = this.f14824a;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public final void zzz(String str) {
        this.f14826c.zzg(str);
        super.zzo(str);
    }
}
