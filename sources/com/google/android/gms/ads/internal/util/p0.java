package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzakk;
import com.google.android.gms.internal.ads.zzako;
import com.google.android.gms.internal.ads.zzaku;
import com.google.android.gms.internal.ads.zzall;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzbzs;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class p0 extends zzako {

    /* renamed from: a  reason: collision with root package name */
    private final zzbzs f14847a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbyz f14848b;

    public p0(String str, Map map, zzbzs zzbzs) {
        super(0, str, new o0(zzbzs));
        this.f14847a = zzbzs;
        zzbyz zzbyz = new zzbyz((String) null);
        this.f14848b = zzbyz;
        zzbyz.zzd(str, "GET", (Map) null, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    public final zzaku zzh(zzakk zzakk) {
        return zzaku.zzb(zzakk, zzall.zzb(zzakk));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzakk zzakk = (zzakk) obj;
        this.f14848b.zzf(zzakk.zzc, zzakk.zza);
        zzbyz zzbyz = this.f14848b;
        byte[] bArr = zzakk.zzb;
        if (zzbyz.zzl() && bArr != null) {
            zzbyz.zzh(bArr);
        }
        this.f14847a.zzd(zzakk);
    }
}
