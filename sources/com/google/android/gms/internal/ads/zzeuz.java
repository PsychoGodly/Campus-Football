package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.u4;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeuz implements zzevt {
    private final zzevt zza;
    private final zzevt zzb;
    private final zzfbf zzc;
    private final String zzd;
    private zzctw zze;
    private final Executor zzf;

    public zzeuz(zzevt zzevt, zzevt zzevt2, zzfbf zzfbf, String str, Executor executor) {
        this.zza = zzevt;
        this.zzb = zzevt2;
        this.zzc = zzfbf;
        this.zzd = str;
        this.zzf = executor;
    }

    private final zzfut zzg(zzfas zzfas, zzevu zzevu) {
        zzctw zzctw = zzfas.zza;
        this.zze = zzctw;
        if (zzfas.zzc != null) {
            if (zzctw.zzf() != null) {
                zzfas.zzc.zzo().zzbG(zzfas.zza.zzf());
            }
            return zzfuj.zzh(zzfas.zzc);
        }
        zzctw.zzb().zzl(zzfas.zzb);
        return ((zzevj) this.zza).zzb(zzevu, (zzevs) null, zzfas.zza);
    }

    /* renamed from: zza */
    public final synchronized zzctw zzd() {
        return this.zze;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzb(zzevu zzevu, zzeuy zzeuy, zzevs zzevs, zzctw zzctw, zzeve zzeve) throws Exception {
        if (zzeve != null) {
            zzeuy zzeuy2 = new zzeuy(zzeuy.zza, zzeuy.zzb, zzeuy.zzc, zzeuy.zzd, zzeuy.zze, zzeuy.zzf, zzeve.zza);
            if (zzeve.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzeuy2);
                return zzg(zzeve.zzc, zzevu);
            }
            zzfut zza2 = this.zzc.zza(zzeuy2);
            if (zza2 != null) {
                this.zze = null;
                return zzfuj.zzm(zza2, new zzeuv(this), this.zzf);
            }
            this.zzc.zze(zzeuy2);
            zzevu = new zzevu(zzevu.zzb, zzeve.zzb);
        }
        zzfut zzb2 = ((zzevj) this.zza).zzb(zzevu, zzevs, zzctw);
        this.zze = zzctw;
        return zzb2;
    }

    public final /* bridge */ /* synthetic */ zzfut zzc(zzevu zzevu, zzevs zzevs, Object obj) {
        return zzf(zzevu, zzevs, (zzctw) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zze(zzfbc zzfbc) throws Exception {
        zzfbe zzfbe;
        if (zzfbc == null || zzfbc.zza == null || (zzfbe = zzfbc.zzb) == null) {
            throw new zzdtf(1, "Empty prefetch");
        }
        zzawt zza2 = zzawz.zza();
        zzawr zza3 = zzaws.zza();
        zza3.zzd(2);
        zza3.zzb(zzaww.zzd());
        zza2.zza(zza3);
        zzfbc.zza.zza.zzb().zzc().zzi((zzawz) zza2.zzal());
        return zzg(zzfbc.zza, ((zzeuy) zzfbe).zzb);
    }

    public final synchronized zzfut zzf(zzevu zzevu, zzevs zzevs, zzctw zzctw) {
        zzevu zzevu2 = zzevu;
        zzevs zzevs2 = zzevs;
        synchronized (this) {
            zzctv zza2 = zzevs2.zza(zzevu2.zzb);
            zza2.zza(new zzeva(this.zzd));
            zzctw zzctw2 = (zzctw) zza2.zzh();
            zzctw2.zzg();
            zzctw2.zzg();
            u4 u4Var = zzctw2.zzg().zzd;
            if (u4Var.f14569t == null) {
                if (u4Var.f14574y == null) {
                    zzeyx zzg = zzctw2.zzg();
                    zzevs zzevs3 = zzevs;
                    zzevu zzevu3 = zzevu;
                    zzfut zzm = zzfuj.zzm(zzfua.zzv(((zzevf) this.zzb).zzb(zzevu2, zzevs2, zzctw2)), new zzeuw(this, zzevu, new zzeuy(zzevs3, zzevu3, zzg.zzd, zzg.zzf, this.zzf, zzg.zzj, (zzfat) null), zzevs, zzctw2), this.zzf);
                    return zzm;
                }
            }
            this.zze = zzctw2;
            zzfut zzb2 = ((zzevj) this.zza).zzb(zzevu2, zzevs2, zzctw2);
            return zzb2;
        }
    }
}
