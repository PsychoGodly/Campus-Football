package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import h5.f;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfep implements Runnable {
    public static Boolean zza;
    private final Context zzb;
    private final zzbzg zzc;
    private final zzfeu zzd = zzfex.zzc();
    private String zze;
    private int zzf;
    private final zzdna zzg;
    private boolean zzh = false;
    private final zzdye zzi;
    private final zzbtz zzj;

    public zzfep(Context context, zzbzg zzbzg, zzdna zzdna, zzdye zzdye, zzbtz zzbtz, byte[] bArr) {
        this.zzb = context;
        this.zzc = zzbzg;
        this.zzg = zzdna;
        this.zzi = zzdye;
        this.zzj = zzbtz;
    }

    public static synchronized boolean zza() {
        boolean booleanValue;
        synchronized (zzfep.class) {
            if (zza == null) {
                if (!((Boolean) zzbcd.zzb.zze()).booleanValue()) {
                    zza = Boolean.FALSE;
                } else {
                    zza = Boolean.valueOf(Math.random() < ((Double) zzbcd.zza.zze()).doubleValue());
                }
            }
            booleanValue = zza.booleanValue();
        }
        return booleanValue;
    }

    private final synchronized void zzc() {
        if (!this.zzh) {
            this.zzh = true;
            if (zza()) {
                t.r();
                this.zze = b2.M(this.zzb);
                this.zzf = f.h().b(this.zzb);
                long intValue = (long) ((Integer) a0.c().zzb(zzbar.zzhX)).intValue();
                zzbzn.zzd.scheduleAtFixedRate(this, intValue, intValue, TimeUnit.MILLISECONDS);
            }
        }
    }

    private final synchronized void zzd() {
        try {
            new zzdyd(this.zzb, this.zzc.zza, this.zzj, Binder.getCallingUid(), (byte[]) null).zza(new zzdyb((String) a0.c().zzb(zzbar.zzhW), 60000, new HashMap(), ((zzfex) this.zzd.zzal()).zzax(), "application/x-protobuf", false));
            this.zzd.zzc();
        } catch (Exception e10) {
            if (!(e10 instanceof zzdtf) || ((zzdtf) e10).zza() != 3) {
                t.q().zzt(e10, "CuiMonitor.sendCuiPing");
            } else {
                this.zzd.zzc();
            }
        }
    }

    public final synchronized void run() {
        if (zza()) {
            if (this.zzd.zza() != 0) {
                zzd();
            }
        }
    }

    public final synchronized void zzb(zzfeg zzfeg) {
        if (!this.zzh) {
            zzc();
        }
        if (zza()) {
            if (zzfeg != null) {
                if (this.zzd.zza() < ((Integer) a0.c().zzb(zzbar.zzhY)).intValue()) {
                    zzfeu zzfeu = this.zzd;
                    zzfev zza2 = zzfew.zza();
                    zzfer zza3 = zzfes.zza();
                    zza3.zzr(zzfeg.zzk());
                    zza3.zzn(zzfeg.zzj());
                    zza3.zzf(zzfeg.zzb());
                    zza3.zzt(3);
                    zza3.zzl(this.zzc.zza);
                    zza3.zza(this.zze);
                    zza3.zzj(Build.VERSION.RELEASE);
                    zza3.zzo(Build.VERSION.SDK_INT);
                    zza3.zzs(zzfeg.zzm());
                    zza3.zzi(zzfeg.zza());
                    zza3.zzd((long) this.zzf);
                    zza3.zzq(zzfeg.zzl());
                    zza3.zzb(zzfeg.zzc());
                    zza3.zze(zzfeg.zze());
                    zza3.zzg(zzfeg.zzf());
                    zza3.zzh(this.zzg.zzc(zzfeg.zzf()));
                    zza3.zzk(zzfeg.zzg());
                    zza3.zzc(zzfeg.zzd());
                    zza3.zzp(zzfeg.zzi());
                    zza3.zzm(zzfeg.zzh());
                    zza2.zza(zza3);
                    zzfeu.zzb(zza2);
                }
            }
        }
    }
}
