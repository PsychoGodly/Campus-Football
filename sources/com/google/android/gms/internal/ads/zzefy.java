package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzefy extends zzbnk {
    private final zzcum zza;
    private final zzdca zzb;
    private final zzcvg zzc;
    private final zzcvv zzd;
    private final zzcwa zze;
    private final zzczi zzf;
    private final zzcwu zzg;
    private final zzdcs zzh;
    private final zzcze zzi;
    private final zzcvb zzj;

    public zzefy(zzcum zzcum, zzdca zzdca, zzcvg zzcvg, zzcvv zzcvv, zzcwa zzcwa, zzczi zzczi, zzcwu zzcwu, zzdcs zzdcs, zzcze zzcze, zzcvb zzcvb) {
        this.zza = zzcum;
        this.zzb = zzdca;
        this.zzc = zzcvg;
        this.zzd = zzcvv;
        this.zze = zzcwa;
        this.zzf = zzczi;
        this.zzg = zzcwu;
        this.zzh = zzdcs;
        this.zzi = zzcze;
        this.zzj = zzcvb;
    }

    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzr();
    }

    public final void zzf() {
        this.zzg.zzf(4);
    }

    public final void zzg(int i10) {
    }

    public final void zzh(c3 c3Var) {
    }

    public final void zzi(int i10, String str) {
    }

    @Deprecated
    public final void zzj(int i10) throws RemoteException {
        zzk(new c3(i10, MaxReward.DEFAULT_LABEL, "undefined", (c3) null, (IBinder) null));
    }

    public final void zzk(c3 c3Var) {
        this.zzj.zza(zzezx.zzc(8, c3Var));
    }

    public final void zzl(String str) {
        zzk(new c3(0, str, "undefined", (c3) null, (IBinder) null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    public final void zzn() {
        this.zzd.zzb();
    }

    public final void zzo() {
        this.zze.zzn();
    }

    public final void zzp() {
        this.zzg.zzb();
        this.zzi.zza();
    }

    public final void zzq(String str, String str2) {
        this.zzf.zzbz(str, str2);
    }

    public final void zzr(zzber zzber, String str) {
    }

    public void zzs(zzbup zzbup) {
    }

    public void zzt(zzbut zzbut) throws RemoteException {
    }

    public void zzu() throws RemoteException {
    }

    public void zzv() {
        this.zzh.zza();
    }

    public final void zzw() {
        this.zzh.zzb();
    }

    public final void zzx() throws RemoteException {
        this.zzh.zzc();
    }

    public void zzy() {
        this.zzh.zzd();
    }
}
