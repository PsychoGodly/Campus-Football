package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeei {
    private final zzezm zza;
    private final zzdna zzb;
    private final zzdpi zzc;
    private final zzfdk zzd;

    public zzeei(zzezm zzezm, zzdna zzdna, zzdpi zzdpi, zzfdk zzfdk) {
        this.zza = zzezm;
        this.zzb = zzdna;
        this.zzc = zzdpi;
        this.zzd = zzfdk;
    }

    public final void zza(zzeyf zzeyf, zzeyc zzeyc, int i10, zzeax zzeax, long j10) {
        if (((Boolean) a0.c().zzb(zzbar.zzhS)).booleanValue()) {
            zzfdj zzb2 = zzfdj.zzb("adapter_status");
            zzb2.zzg(zzeyf);
            zzb2.zzf(zzeyc);
            zzb2.zza("adapter_l", String.valueOf(j10));
            zzb2.zza("sc", Integer.toString(i10));
            if (zzeax != null) {
                zzb2.zza("arec", Integer.toString(zzeax.zzb().f14427a));
                String zza2 = this.zza.zza(zzeax.getMessage());
                if (zza2 != null) {
                    zzb2.zza("areec", zza2);
                }
            }
            zzdmz zzb3 = this.zzb.zzb(zzeyc.zzu);
            if (zzb3 != null) {
                zzb2.zza("ancn", zzb3.zza);
                zzbpq zzbpq = zzb3.zzb;
                if (zzbpq != null) {
                    zzb2.zza("adapter_v", zzbpq.toString());
                }
                zzbpq zzbpq2 = zzb3.zzc;
                if (zzbpq2 != null) {
                    zzb2.zza("adapter_sv", zzbpq2.toString());
                }
            }
            this.zzd.zzb(zzb2);
            return;
        }
        zzdph zza3 = this.zzc.zza();
        zza3.zze(zzeyf);
        zza3.zzd(zzeyc);
        zza3.zzb("action", "adapter_status");
        zza3.zzb("adapter_l", String.valueOf(j10));
        zza3.zzb("sc", Integer.toString(i10));
        if (zzeax != null) {
            zza3.zzb("arec", Integer.toString(zzeax.zzb().f14427a));
            String zza4 = this.zza.zza(zzeax.getMessage());
            if (zza4 != null) {
                zza3.zzb("areec", zza4);
            }
        }
        zzdmz zzb4 = this.zzb.zzb(zzeyc.zzu);
        if (zzb4 != null) {
            zza3.zzb("ancn", zzb4.zza);
            zzbpq zzbpq3 = zzb4.zzb;
            if (zzbpq3 != null) {
                zza3.zzb("adapter_v", zzbpq3.toString());
            }
            zzbpq zzbpq4 = zzb4.zzc;
            if (zzbpq4 != null) {
                zza3.zzb("adapter_sv", zzbpq4.toString());
            }
        }
        zza3.zzg();
    }
}
