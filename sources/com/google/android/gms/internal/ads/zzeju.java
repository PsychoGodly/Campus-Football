package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.common.internal.q;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeju implements zzepm {
    public final z4 zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;

    public zzeju(z4 z4Var, String str, boolean z10, String str2, float f10, int i10, int i11, String str3, boolean z11) {
        q.l(z4Var, "the adSize must not be null");
        this.zza = z4Var;
        this.zzb = str;
        this.zzc = z10;
        this.zzd = str2;
        this.zze = f10;
        this.zzf = i10;
        this.zzg = i11;
        this.zzh = str3;
        this.zzi = z11;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzezi.zzf(bundle, "smart_w", "full", this.zza.f14650f == -1);
        zzezi.zzf(bundle, "smart_h", "auto", this.zza.f14647b == -2);
        zzezi.zzg(bundle, "ene", true, this.zza.f14655k);
        zzezi.zzf(bundle, "rafmt", "102", this.zza.f14658n);
        zzezi.zzf(bundle, "rafmt", "103", this.zza.f14659o);
        zzezi.zzf(bundle, "rafmt", "105", this.zza.f14660p);
        zzezi.zzg(bundle, "inline_adaptive_slot", true, this.zzi);
        zzezi.zzg(bundle, "interscroller_slot", true, this.zza.f14660p);
        zzezi.zzc(bundle, "format", this.zzb);
        zzezi.zzf(bundle, "fluid", "height", this.zzc);
        String str = this.zzd;
        zzezi.zzf(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        String str2 = this.zzh;
        zzezi.zzf(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList arrayList = new ArrayList();
        z4[] z4VarArr = this.zza.f14652h;
        if (z4VarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.zza.f14647b);
            bundle2.putInt("width", this.zza.f14650f);
            bundle2.putBoolean("is_fluid_height", this.zza.f14654j);
            arrayList.add(bundle2);
        } else {
            for (z4 z4Var : z4VarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", z4Var.f14654j);
                bundle3.putInt("height", z4Var.f14647b);
                bundle3.putInt("width", z4Var.f14650f);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
