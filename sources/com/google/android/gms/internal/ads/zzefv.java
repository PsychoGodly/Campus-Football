package com.google.android.gms.internal.ads;

import android.os.IBinder;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzefv implements zzcvx {
    boolean zza = false;
    final /* synthetic */ zzeaw zzb;
    final /* synthetic */ zzbzs zzc;
    final /* synthetic */ zzefw zzd;

    zzefv(zzefw zzefw, zzeaw zzeaw, zzbzs zzbzs) {
        this.zzd = zzefw;
        this.zzb = zzeaw;
        this.zzc = zzbzs;
    }

    private final synchronized void zze(c3 c3Var) {
        int i10 = 1;
        if (true == ((Boolean) a0.c().zzb(zzbar.zzeY)).booleanValue()) {
            i10 = 3;
        }
        this.zzc.zze(new zzeax(i10, c3Var));
    }

    public final synchronized void zza(int i10) {
        if (!this.zza) {
            this.zza = true;
            zze(new c3(i10, zzefw.zze(this.zzb.zza, i10), "undefined", (c3) null, (IBinder) null));
        }
    }

    public final synchronized void zzb(c3 c3Var) {
        if (!this.zza) {
            this.zza = true;
            zze(c3Var);
        }
    }

    public final synchronized void zzc(int i10, String str) {
        if (!this.zza) {
            this.zza = true;
            if (str == null) {
                str = zzefw.zze(this.zzb.zza, i10);
            }
            zze(new c3(i10, str, "undefined", (c3) null, (IBinder) null));
        }
    }

    public final synchronized void zzd() {
        this.zzc.zzd((Object) null);
    }
}
