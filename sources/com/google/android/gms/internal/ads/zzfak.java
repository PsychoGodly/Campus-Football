package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.f5;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.common.api.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfak implements zzfaj {
    private final ConcurrentHashMap zza;
    private final zzfaq zzb;
    private final zzfam zzc = new zzfam();

    public zzfak(zzfaq zzfaq) {
        this.zza = new ConcurrentHashMap(zzfaq.zzd);
        this.zzb = zzfaq;
    }

    private final void zzf() {
        Parcelable.Creator<zzfaq> creator = zzfaq.CREATOR;
        if (((Boolean) a0.c().zzb(zzbar.zzfU)).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.zzb.zzb);
            sb2.append(" PoolCollection");
            sb2.append(this.zzc.zzb());
            int i10 = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i10++;
                sb2.append(i10);
                sb2.append(". ");
                sb2.append(entry.getValue());
                sb2.append("#");
                sb2.append(((zzfat) entry.getKey()).hashCode());
                sb2.append("    ");
                for (int i11 = 0; i11 < ((zzfai) entry.getValue()).zzb(); i11++) {
                    sb2.append("[O]");
                }
                for (int zzb2 = ((zzfai) entry.getValue()).zzb(); zzb2 < this.zzb.zzd; zzb2++) {
                    sb2.append("[ ]");
                }
                sb2.append("\n");
                sb2.append(((zzfai) entry.getValue()).zzg());
                sb2.append("\n");
            }
            while (i10 < this.zzb.zzc) {
                i10++;
                sb2.append(i10);
                sb2.append(".\n");
            }
            zzbza.zze(sb2.toString());
        }
    }

    public final zzfaq zza() {
        return this.zzb;
    }

    public final synchronized zzfas zzb(zzfat zzfat) {
        zzfas zzfas;
        zzfai zzfai = (zzfai) this.zza.get(zzfat);
        if (zzfai != null) {
            zzfas = zzfai.zze();
            if (zzfas == null) {
                this.zzc.zze();
            }
            zzfbg zzf = zzfai.zzf();
            if (zzfas != null) {
                zzawt zza2 = zzawz.zza();
                zzawr zza3 = zzaws.zza();
                zza3.zzd(2);
                zzawv zza4 = zzaww.zza();
                zza4.zza(zzf.zza);
                zza4.zzb(zzf.zzb);
                zza3.zza(zza4);
                zza2.zza(zza3);
                zzfas.zza.zzb().zzc().zze((zzawz) zza2.zzal());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzfas = null;
        }
        return zzfas;
    }

    @Deprecated
    public final zzfat zzc(u4 u4Var, String str, f5 f5Var) {
        return new zzfau(u4Var, str, new zzbtr(this.zzb.zza).zza().zzk, this.zzb.zzf, f5Var);
    }

    public final synchronized boolean zzd(zzfat zzfat, zzfas zzfas) {
        boolean zzh;
        zzfai zzfai = (zzfai) this.zza.get(zzfat);
        zzfas.zzd = t.b().a();
        if (zzfai == null) {
            zzfaq zzfaq = this.zzb;
            zzfai = new zzfai(zzfaq.zzd, zzfaq.zze * 1000);
            int size = this.zza.size();
            zzfaq zzfaq2 = this.zzb;
            if (size == zzfaq2.zzc) {
                int i10 = zzfaq2.zzg;
                int i11 = i10 - 1;
                zzfat zzfat2 = null;
                if (i10 != 0) {
                    long j10 = Long.MAX_VALUE;
                    if (i11 == 0) {
                        for (Map.Entry entry : this.zza.entrySet()) {
                            if (((zzfai) entry.getValue()).zzc() < j10) {
                                j10 = ((zzfai) entry.getValue()).zzc();
                                zzfat2 = (zzfat) entry.getKey();
                            }
                        }
                        if (zzfat2 != null) {
                            this.zza.remove(zzfat2);
                        }
                    } else if (i11 == 1) {
                        for (Map.Entry entry2 : this.zza.entrySet()) {
                            if (((zzfai) entry2.getValue()).zzd() < j10) {
                                j10 = ((zzfai) entry2.getValue()).zzd();
                                zzfat2 = (zzfat) entry2.getKey();
                            }
                        }
                        if (zzfat2 != null) {
                            this.zza.remove(zzfat2);
                        }
                    } else if (i11 == 2) {
                        int i12 = a.e.API_PRIORITY_OTHER;
                        for (Map.Entry entry3 : this.zza.entrySet()) {
                            if (((zzfai) entry3.getValue()).zza() < i12) {
                                i12 = ((zzfai) entry3.getValue()).zza();
                                zzfat2 = (zzfat) entry3.getKey();
                            }
                        }
                        if (zzfat2 != null) {
                            this.zza.remove(zzfat2);
                        }
                    }
                    this.zzc.zzg();
                } else {
                    throw null;
                }
            }
            this.zza.put(zzfat, zzfai);
            this.zzc.zzd();
        }
        zzh = zzfai.zzh(zzfas);
        this.zzc.zzc();
        zzfal zza2 = this.zzc.zza();
        zzfbg zzf = zzfai.zzf();
        zzawt zza3 = zzawz.zza();
        zzawr zza4 = zzaws.zza();
        zza4.zzd(2);
        zzawx zza5 = zzawy.zza();
        zza5.zza(zza2.zza);
        zza5.zzb(zza2.zzb);
        zza5.zzc(zzf.zzb);
        zza4.zzc(zza5);
        zza3.zza(zza4);
        zzfas.zza.zzb().zzc().zzf((zzawz) zza3.zzal());
        zzf();
        return zzh;
    }

    public final synchronized boolean zze(zzfat zzfat) {
        zzfai zzfai = (zzfai) this.zza.get(zzfat);
        if (zzfai == null) {
            return true;
        }
        if (zzfai.zzb() < this.zzb.zzd) {
            return true;
        }
        return false;
    }
}
