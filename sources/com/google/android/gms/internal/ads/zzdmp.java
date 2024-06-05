package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.client.a0;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdmp {
    private final zzcum zza;
    private final zzdca zzb;
    /* access modifiers changed from: private */
    public final zzcvv zzc;
    private final zzcwi zzd;
    private final zzcwu zze;
    private final zzczi zzf;
    private final Executor zzg;
    private final zzdbw zzh;
    private final zzcng zzi;
    private final b zzj;
    private final zzbwb zzk;
    private final zzapw zzl;
    /* access modifiers changed from: private */
    public final zzcyz zzm;
    private final zzeaf zzn;
    private final zzfff zzo;
    private final zzdpi zzp;
    private final zzfdk zzq;

    public zzdmp(zzcum zzcum, zzcvv zzcvv, zzcwi zzcwi, zzcwu zzcwu, zzczi zzczi, Executor executor, zzdbw zzdbw, zzcng zzcng, b bVar, zzbwb zzbwb, zzapw zzapw, zzcyz zzcyz, zzeaf zzeaf, zzfff zzfff, zzdpi zzdpi, zzfdk zzfdk, zzdca zzdca) {
        this.zza = zzcum;
        this.zzc = zzcvv;
        this.zzd = zzcwi;
        this.zze = zzcwu;
        this.zzf = zzczi;
        this.zzg = executor;
        this.zzh = zzdbw;
        this.zzi = zzcng;
        this.zzj = bVar;
        this.zzk = zzbwb;
        this.zzl = zzapw;
        this.zzm = zzcyz;
        this.zzn = zzeaf;
        this.zzo = zzfff;
        this.zzp = zzdpi;
        this.zzq = zzfdk;
        this.zzb = zzdca;
    }

    public static final zzfut zzj(zzcei zzcei, String str, String str2) {
        zzbzs zzbzs = new zzbzs();
        zzcei.zzN().zzA(new zzdmn(zzbzs));
        zzcei.zzab(str, str2, (String) null);
        return zzbzs;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc() {
        this.zza.onAdClicked();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(String str, String str2) {
        this.zzf.zzbz(str, str2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze() {
        this.zzc.zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(View view) {
        this.zzj.a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzcei zzcei, zzcei zzcei2, Map map) {
        this.zzi.zzh(zzcei);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean zzh(View view, MotionEvent motionEvent) {
        this.zzj.a();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    public final void zzi(zzcei zzcei, boolean z10, zzbhr zzbhr) {
        zzaps zzc2;
        zzcei zzcei2 = zzcei;
        zzcfv zzN = zzcei.zzN();
        zzdmg zzdmg = r4;
        zzdmg zzdmg2 = new zzdmg(this);
        zzcwi zzcwi = this.zzd;
        zzcwu zzcwu = this.zze;
        zzdmh zzdmh = r7;
        zzdmh zzdmh2 = new zzdmh(this);
        zzdmi zzdmi = r10;
        zzdmi zzdmi2 = new zzdmi(this);
        b bVar = this.zzj;
        zzdmo zzdmo = r12;
        zzdmo zzdmo2 = new zzdmo(this);
        zzN.zzM(zzdmg, zzcwi, zzcwu, zzdmh, zzdmi, z10, zzbhr, bVar, zzdmo, this.zzk, this.zzn, this.zzo, this.zzp, this.zzq, (zzbih) null, this.zzb, (zzbig) null, (zzbia) null);
        zzcei zzcei3 = zzcei;
        zzcei3.setOnTouchListener(new zzdmj(this));
        zzcei3.setOnClickListener(new zzdmk(this));
        if (((Boolean) a0.c().zzb(zzbar.zzcj)).booleanValue() && (zzc2 = this.zzl.zzc()) != null) {
            zzc2.zzo((View) zzcei3);
        }
        this.zzh.zzm(zzcei3, this.zzg);
        this.zzh.zzm(new zzdml(zzcei3), this.zzg);
        this.zzh.zza((View) zzcei3);
        zzcei3.zzad("/trackActiveViewUnit", new zzdmm(this, zzcei3));
        this.zzi.zzi(zzcei3);
    }
}
