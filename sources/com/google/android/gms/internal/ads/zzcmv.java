package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcmv implements zzcuo, zzcwc, zzcvi, a, zzcve {
    /* access modifiers changed from: private */
    public final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    /* access modifiers changed from: private */
    public final zzeyo zze;
    /* access modifiers changed from: private */
    public final zzeyc zzf;
    /* access modifiers changed from: private */
    public final zzffb zzg;
    /* access modifiers changed from: private */
    public final zzezg zzh;
    private final zzapw zzi;
    private final zzbbt zzj;
    private final zzfen zzk;
    private final WeakReference zzl;
    private final WeakReference zzm;
    private final zzctr zzn;
    private boolean zzo;
    private final AtomicBoolean zzp = new AtomicBoolean();
    private final zzbbv zzq;

    zzcmv(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzeyo zzeyo, zzeyc zzeyc, zzffb zzffb, zzezg zzezg, View view, zzcei zzcei, zzapw zzapw, zzbbt zzbbt, zzbbv zzbbv, zzfen zzfen, zzctr zzctr, byte[] bArr) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzeyo;
        this.zzf = zzeyc;
        this.zzg = zzffb;
        this.zzh = zzezg;
        this.zzi = zzapw;
        View view2 = view;
        this.zzl = new WeakReference(view);
        zzcei zzcei2 = zzcei;
        this.zzm = new WeakReference(zzcei);
        this.zzj = zzbbt;
        this.zzq = zzbbv;
        this.zzk = zzfen;
        this.zzn = zzctr;
    }

    /* access modifiers changed from: private */
    public final void zzs() {
        int i10;
        String zzh2 = ((Boolean) a0.c().zzb(zzbar.zzda)).booleanValue() ? this.zzi.zzc().zzh(this.zza, (View) this.zzl.get(), (Activity) null) : null;
        if ((!((Boolean) a0.c().zzb(zzbar.zzal)).booleanValue() || !this.zze.zzb.zzb.zzg) && ((Boolean) zzbcj.zzh.zze()).booleanValue()) {
            if (((Boolean) zzbcj.zzg.zze()).booleanValue() && ((i10 = this.zzf.zzb) == 1 || i10 == 2 || i10 == 5)) {
                zzcei zzcei = (zzcei) this.zzm.get();
            }
            zzfuj.zzq((zzfua) zzfuj.zzn(zzfua.zzv(zzfuj.zzh((Object) null)), ((Long) a0.c().zzb(zzbar.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcmu(this, zzh2), this.zzb);
            return;
        }
        zzezg zzezg = this.zzh;
        zzffb zzffb = this.zzg;
        zzeyo zzeyo = this.zze;
        zzeyc zzeyc = this.zzf;
        zzezg.zza(zzffb.zzd(zzeyo, zzeyc, false, zzh2, (String) null, zzeyc.zzd));
    }

    private final void zzt(int i10, int i11) {
        View view;
        if (i10 <= 0 || !((view = (View) this.zzl.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzs();
        } else {
            this.zzd.schedule(new zzcmo(this, i10, i11), (long) i11, TimeUnit.MILLISECONDS);
        }
    }

    public final void onAdClicked() {
        if ((!((Boolean) a0.c().zzb(zzbar.zzal)).booleanValue() || !this.zze.zzb.zzb.zzg) && ((Boolean) zzbcj.zzd.zze()).booleanValue()) {
            zzfuj.zzq(zzfuj.zze(zzfua.zzv(this.zzj.zza()), Throwable.class, zzcmp.zza, zzbzn.zzf), new zzcmt(this), this.zzb);
            return;
        }
        zzezg zzezg = this.zzh;
        zzffb zzffb = this.zzg;
        zzeyo zzeyo = this.zze;
        zzeyc zzeyc = this.zzf;
        List zzc2 = zzffb.zzc(zzeyo, zzeyc, zzeyc.zzc);
        int i10 = 1;
        if (true == t.q().zzx(this.zza)) {
            i10 = 2;
        }
        zzezg.zzc(zzc2, i10);
    }

    public final void zzbr() {
        zzezg zzezg = this.zzh;
        zzffb zzffb = this.zzg;
        zzeyo zzeyo = this.zze;
        zzeyc zzeyc = this.zzf;
        zzezg.zza(zzffb.zzc(zzeyo, zzeyc, zzeyc.zzh));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg() {
        this.zzb.execute(new zzcms(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(int i10, int i11) {
        zzt(i10 - 1, i11);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(int i10, int i11) {
        this.zzb.execute(new zzcmq(this, i10, i11));
    }

    public final void zzj() {
    }

    public final void zzk(c3 c3Var) {
        if (((Boolean) a0.c().zzb(zzbar.zzbo)).booleanValue()) {
            this.zzh.zza(this.zzg.zzc(this.zze, this.zzf, zzffb.zzf(2, c3Var.f14427a, this.zzf.zzp)));
        }
    }

    public final void zzl() {
        if (this.zzp.compareAndSet(false, true)) {
            int intValue = ((Integer) a0.c().zzb(zzbar.zzdh)).intValue();
            if (intValue > 0) {
                zzt(intValue, ((Integer) a0.c().zzb(zzbar.zzdi)).intValue());
                return;
            }
            if (((Boolean) a0.c().zzb(zzbar.zzdg)).booleanValue()) {
                this.zzc.execute(new zzcmr(this));
            } else {
                zzs();
            }
        }
    }

    public final void zzm() {
    }

    public final synchronized void zzn() {
        zzctr zzctr;
        if (this.zzo) {
            ArrayList arrayList = new ArrayList(this.zzf.zzd);
            arrayList.addAll(this.zzf.zzg);
            this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, true, (String) null, (String) null, arrayList));
        } else {
            zzezg zzezg = this.zzh;
            zzffb zzffb = this.zzg;
            zzeyo zzeyo = this.zze;
            zzeyc zzeyc = this.zzf;
            zzezg.zza(zzffb.zzc(zzeyo, zzeyc, zzeyc.zzn));
            if (((Boolean) a0.c().zzb(zzbar.zzde)).booleanValue() && (zzctr = this.zzn) != null) {
                this.zzh.zza(this.zzg.zzc(this.zzn.zzc(), this.zzn.zzb(), zzffb.zzg(zzctr.zzb().zzn, zzctr.zza().zzf())));
            }
            zzezg zzezg2 = this.zzh;
            zzffb zzffb2 = this.zzg;
            zzeyo zzeyo2 = this.zze;
            zzeyc zzeyc2 = this.zzf;
            zzezg2.zza(zzffb2.zzc(zzeyo2, zzeyc2, zzeyc2.zzg));
        }
        this.zzo = true;
    }

    public final void zzo() {
    }

    public final void zzp(zzbud zzbud, String str, String str2) {
        zzezg zzezg = this.zzh;
        zzffb zzffb = this.zzg;
        zzeyc zzeyc = this.zzf;
        zzezg.zza(zzffb.zze(zzeyc, zzeyc.zzi, zzbud));
    }

    public final void zzq() {
        zzezg zzezg = this.zzh;
        zzffb zzffb = this.zzg;
        zzeyo zzeyo = this.zze;
        zzeyc zzeyc = this.zzf;
        zzezg.zza(zzffb.zzc(zzeyo, zzeyc, zzeyc.zzj));
    }
}
