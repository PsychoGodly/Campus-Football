package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfhb implements zzfgg {
    private static final zzfhb zza = new zzfhb();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public static Handler zzc = null;
    /* access modifiers changed from: private */
    public static final Runnable zzd = new zzfgx();
    /* access modifiers changed from: private */
    public static final Runnable zze = new zzfgy();
    private final List zzf = new ArrayList();
    private int zzg;
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzfgi zzj = new zzfgi();
    private final zzfgu zzk = new zzfgu();
    /* access modifiers changed from: private */
    public final zzfgv zzl = new zzfgv(new zzfhe());
    private long zzm;

    zzfhb() {
    }

    public static zzfhb zzd() {
        return zza;
    }

    static /* bridge */ /* synthetic */ void zzg(zzfhb zzfhb) {
        zzfhb.zzg = 0;
        zzfhb.zzi.clear();
        zzfhb.zzh = false;
        for (zzffo zzffo : zzffz.zza().zzb()) {
        }
        zzfhb.zzm = System.nanoTime();
        zzfhb.zzk.zzi();
        long nanoTime = System.nanoTime();
        zzfgh zza2 = zzfhb.zzj.zza();
        if (zzfhb.zzk.zze().size() > 0) {
            Iterator it = zzfhb.zzk.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zzfgp.zza(0, 0, 0, 0);
                View zza4 = zzfhb.zzk.zza(str);
                zzfgh zzb2 = zzfhb.zzj.zzb();
                String zzc2 = zzfhb.zzk.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza5 = zzb2.zza(zza4);
                    zzfgp.zzb(zza5, str);
                    zzfgp.zzf(zza5, zzc2);
                    zzfgp.zzc(zza3, zza5);
                }
                zzfgp.zzi(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfhb.zzl.zzc(zza3, hashSet, nanoTime);
            }
        }
        if (zzfhb.zzk.zzf().size() > 0) {
            JSONObject zza6 = zzfgp.zza(0, 0, 0, 0);
            zzfhb.zzk((View) null, zza2, zza6, 1, false);
            zzfgp.zzi(zza6);
            zzfhb.zzl.zzd(zza6, zzfhb.zzk.zzf(), nanoTime);
        } else {
            zzfhb.zzl.zzb();
        }
        zzfhb.zzk.zzg();
        long nanoTime2 = System.nanoTime() - zzfhb.zzm;
        if (zzfhb.zzf.size() > 0) {
            for (zzfha zzfha : zzfhb.zzf) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfha.zzb();
                if (zzfha instanceof zzfgz) {
                    ((zzfgz) zzfha).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzfgh zzfgh, JSONObject jSONObject, int i10, boolean z10) {
        zzfgh.zzb(view, jSONObject, this, i10 == 1, z10);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    public final void zza(View view, zzfgh zzfgh, JSONObject jSONObject, boolean z10) {
        int zzk2;
        boolean z11;
        if (zzfgs.zzb(view) == null && (zzk2 = this.zzk.zzk(view)) != 3) {
            JSONObject zza2 = zzfgh.zza(view);
            zzfgp.zzc(jSONObject, zza2);
            String zzd2 = this.zzk.zzd(view);
            if (zzd2 != null) {
                zzfgp.zzb(zza2, zzd2);
                zzfgp.zze(zza2, Boolean.valueOf(this.zzk.zzj(view)));
                this.zzk.zzh();
            } else {
                zzfgt zzb2 = this.zzk.zzb(view);
                if (zzb2 != null) {
                    zzfgp.zzd(zza2, zzb2);
                    z11 = true;
                } else {
                    z11 = false;
                }
                zzk(view, zzfgh, zza2, zzk2, z10 || z11);
            }
            this.zzg++;
        }
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfgw(this));
    }
}
