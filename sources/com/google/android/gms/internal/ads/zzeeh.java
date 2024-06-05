package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m5.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeeh {
    /* access modifiers changed from: private */
    public final e zza;
    /* access modifiers changed from: private */
    public final zzeei zzb;
    /* access modifiers changed from: private */
    public final zzfff zzc;
    private final List zzd = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */
    public final boolean zze;
    /* access modifiers changed from: private */
    public final zzeay zzf;

    public zzeeh(e eVar, zzeei zzeei, zzeay zzeay, zzfff zzfff) {
        this.zza = eVar;
        this.zzb = zzeei;
        this.zze = ((Boolean) a0.c().zzb(zzbar.zzgu)).booleanValue();
        this.zzf = zzeay;
        this.zzc = zzfff;
    }

    static /* bridge */ /* synthetic */ void zzg(zzeeh zzeeh, String str, int i10, long j10, String str2, Integer num) {
        String str3 = str + "." + i10 + "." + j10;
        if (!TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + str2;
        }
        if (((Boolean) a0.c().zzb(zzbar.zzbv)).booleanValue() && num != null && !TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + num;
        }
        zzeeh.zzd.add(str3);
    }

    /* access modifiers changed from: package-private */
    public final zzfut zze(zzeyo zzeyo, zzeyc zzeyc, zzfut zzfut, zzffb zzffb) {
        zzeyf zzeyf = zzeyo.zzb.zzb;
        long b10 = this.zza.b();
        String str = zzeyc.zzx;
        if (str != null) {
            zzfuj.zzq(zzfut, new zzeeg(this, b10, str, zzeyc, zzeyf, zzffb, zzeyo), zzbzn.zzf);
        }
        return zzfut;
    }

    public final String zzf() {
        return TextUtils.join("_", this.zzd);
    }
}
