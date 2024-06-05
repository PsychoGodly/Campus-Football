package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
final class zzaj extends zzc {
    /* access modifiers changed from: private */
    public final zzaj zza = this;
    /* access modifiers changed from: private */
    public final zzdr zzb;
    /* access modifiers changed from: private */
    public final zzdr zzc;
    /* access modifiers changed from: private */
    public final zzdr zzd;
    private final zzdr zze;
    private final zzdr zzf;
    private final zzdr zzg;
    private final zzdr zzh;
    /* access modifiers changed from: private */
    public final zzdr zzi;
    /* access modifiers changed from: private */
    public final zzdr zzj;
    private final zzdr zzk;
    private final zzdr zzl;
    private final zzdr zzm;

    /* synthetic */ zzaj(Application application, zzai zzai) {
        zzdo zza2 = zzdp.zza(application);
        this.zzb = zza2;
        zzdr zza3 = zzdn.zza(new zzat(zza2));
        this.zzc = zza3;
        zzdr zza4 = zzdn.zza(zzaf.zza);
        this.zzd = zza4;
        zzah zzah = new zzah(this);
        this.zze = zzah;
        zzdr zza5 = zzdn.zza(new zzbr(zzah, zzaw.zza));
        this.zzf = zza5;
        zzb zzb2 = new zzb(zza2);
        this.zzg = zzb2;
        zzq zzq = new zzq(zza2, zzb2, zza3);
        this.zzh = zzq;
        zzdr zza6 = zzdn.zza(new zzh(zzaw.zza));
        this.zzi = zza6;
        zzar zzar = new zzar(zza2, zza3, zzaw.zza);
        this.zzj = zzar;
        zzad zzad = new zzad(zza6, zzar, zza3);
        this.zzk = zzad;
        zzy zzy = new zzy(zza2, zza4, zzau.zza, zzaw.zza, zza3, zza5, zzq, zzad, zza6);
        this.zzl = zzy;
        this.zzm = zzdn.zza(new zzm(zza3, zzy, zza5));
    }

    public final zzl zzb() {
        return (zzl) this.zzm.zzb();
    }

    public final zzbq zzc() {
        return (zzbq) this.zzf.zzb();
    }
}
