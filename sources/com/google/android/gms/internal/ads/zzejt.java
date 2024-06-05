package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.z4;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzejt implements zzepn {
    private final zzepn zza;
    private final zzeyx zzb;
    private final Context zzc;
    private final zzbyj zzd;

    public zzejt(zzelk zzelk, zzeyx zzeyx, Context context, zzbyj zzbyj) {
        this.zza = zzelk;
        this.zzb = zzeyx;
        this.zzc = context;
        this.zzd = zzbyj;
    }

    public final int zza() {
        return 7;
    }

    public final zzfut zzb() {
        return zzfuj.zzl(this.zza.zzb(), new zzejs(this), zzbzn.zzf);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeju zzc(zzeps zzeps) {
        boolean z10;
        String str;
        String str2;
        int i10;
        float f10;
        int i11;
        int i12;
        DisplayMetrics displayMetrics;
        z4 z4Var = this.zzb.zze;
        z4[] z4VarArr = z4Var.f14652h;
        if (z4VarArr != null) {
            str = null;
            boolean z11 = false;
            boolean z12 = false;
            z10 = false;
            for (z4 z4Var2 : z4VarArr) {
                boolean z13 = z4Var2.f14654j;
                if (!z13 && !z11) {
                    str = z4Var2.f14646a;
                    z11 = true;
                }
                if (z13) {
                    if (!z12) {
                        z12 = true;
                        z10 = true;
                    } else {
                        z12 = true;
                    }
                }
                if (z11 && z12) {
                    break;
                }
            }
        } else {
            str = z4Var.f14646a;
            z10 = z4Var.f14654j;
        }
        Resources resources = this.zzc.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            i11 = 0;
            f10 = 0.0f;
            i10 = 0;
        } else {
            float f11 = displayMetrics.density;
            int i13 = displayMetrics.widthPixels;
            i11 = displayMetrics.heightPixels;
            str2 = this.zzd.zzh().zzm();
            i10 = i13;
            f10 = f11;
        }
        StringBuilder sb2 = new StringBuilder();
        z4[] z4VarArr2 = z4Var.f14652h;
        if (z4VarArr2 != null) {
            boolean z14 = false;
            for (z4 z4Var3 : z4VarArr2) {
                if (z4Var3.f14654j) {
                    z14 = true;
                } else {
                    if (sb2.length() != 0) {
                        sb2.append("|");
                    }
                    int i14 = z4Var3.f14650f;
                    if (i14 == -1) {
                        i14 = f10 != 0.0f ? (int) (((float) z4Var3.f14651g) / f10) : -1;
                    }
                    sb2.append(i14);
                    sb2.append("x");
                    int i15 = z4Var3.f14647b;
                    if (i15 == -2) {
                        i15 = f10 != 0.0f ? (int) (((float) z4Var3.f14648c) / f10) : -2;
                    }
                    sb2.append(i15);
                }
            }
            if (z14) {
                if (sb2.length() != 0) {
                    i12 = 0;
                    sb2.insert(0, "|");
                } else {
                    i12 = 0;
                }
                sb2.insert(i12, "320x50");
            }
        }
        return new zzeju(z4Var, str, z10, sb2.toString(), f10, i10, i11, str2, this.zzb.zzp);
    }
}
