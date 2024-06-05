package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.n1;
import com.google.android.gms.ads.internal.util.p1;
import com.google.android.gms.ads.internal.util.s1;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import m5.m;
import o5.c;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbyj {
    /* access modifiers changed from: private */
    public final Object zza = new Object();
    private final s1 zzb;
    private final zzbyn zzc;
    private boolean zzd;
    /* access modifiers changed from: private */
    public Context zze;
    /* access modifiers changed from: private */
    public zzbzg zzf;
    private String zzg;
    /* access modifiers changed from: private */
    public zzbaz zzh;
    private Boolean zzi;
    private final AtomicInteger zzj;
    private final zzbyi zzk;
    private final Object zzl;
    private zzfut zzm;
    /* access modifiers changed from: private */
    public final AtomicBoolean zzn;

    public zzbyj() {
        s1 s1Var = new s1();
        this.zzb = s1Var;
        this.zzc = new zzbyn(x.d(), s1Var);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = new AtomicInteger(0);
        this.zzk = new zzbyi((zzbyh) null);
        this.zzl = new Object();
        this.zzn = new AtomicBoolean();
    }

    public final int zza() {
        return this.zzj.get();
    }

    public final Context zzc() {
        return this.zze;
    }

    public final Resources zzd() {
        if (this.zzf.zzd) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) a0.c().zzb(zzbar.zzjh)).booleanValue()) {
                return zzbze.zza(this.zze).getResources();
            }
            zzbze.zza(this.zze).getResources();
            return null;
        } catch (zzbzd e10) {
            zzbza.zzk("Cannot load resource from dynamite apk or local jar", e10);
            return null;
        }
    }

    public final zzbaz zzf() {
        zzbaz zzbaz;
        synchronized (this.zza) {
            zzbaz = this.zzh;
        }
        return zzbaz;
    }

    public final zzbyn zzg() {
        return this.zzc;
    }

    public final p1 zzh() {
        s1 s1Var;
        synchronized (this.zza) {
            s1Var = this.zzb;
        }
        return s1Var;
    }

    public final zzfut zzj() {
        if (this.zze != null) {
            if (!((Boolean) a0.c().zzb(zzbar.zzcp)).booleanValue()) {
                synchronized (this.zzl) {
                    zzfut zzfut = this.zzm;
                    if (zzfut != null) {
                        return zzfut;
                    }
                    zzfut zzb2 = zzbzn.zza.zzb(new zzbye(this));
                    this.zzm = zzb2;
                    return zzb2;
                }
            }
        }
        return zzfuj.zzh(new ArrayList());
    }

    public final Boolean zzk() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzi;
        }
        return bool;
    }

    public final String zzm() {
        return this.zzg;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzn() throws Exception {
        Context zza2 = zzbub.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo f10 = c.a(zza2).f(zza2.getApplicationInfo().packageName, 4096);
            if (f10.requestedPermissions != null && f10.requestedPermissionsFlags != null) {
                int i10 = 0;
                while (true) {
                    String[] strArr = f10.requestedPermissions;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    if ((f10.requestedPermissionsFlags[i10] & 2) != 0) {
                        arrayList.add(strArr[i10]);
                    }
                    i10++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void zzp() {
        this.zzk.zza();
    }

    public final void zzq() {
        this.zzj.decrementAndGet();
    }

    public final void zzr() {
        this.zzj.incrementAndGet();
    }

    public final void zzs(Context context, zzbzg zzbzg) {
        zzbaz zzbaz;
        synchronized (this.zza) {
            if (!this.zzd) {
                this.zze = context.getApplicationContext();
                this.zzf = zzbzg;
                t.d().zzc(this.zzc);
                this.zzb.l(this.zze);
                zzbsf.zzb(this.zze, this.zzf);
                t.g();
                if (!((Boolean) zzbce.zzc.zze()).booleanValue()) {
                    n1.a("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbaz = null;
                } else {
                    zzbaz = new zzbaz();
                }
                this.zzh = zzbaz;
                if (zzbaz != null) {
                    zzbzq.zza(new zzbyf(this).zzb(), "AppState.registerCsiReporter");
                }
                if (m.i()) {
                    if (((Boolean) a0.c().zzb(zzbar.zzhL)).booleanValue()) {
                        ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzbyg(this));
                    }
                }
                this.zzd = true;
                zzj();
            }
        }
        t.r().B(context, zzbzg.zza);
    }

    public final void zzt(Throwable th, String str) {
        zzbsf.zzb(this.zze, this.zzf).zzg(th, str, ((Double) zzbct.zzg.zze()).floatValue());
    }

    public final void zzu(Throwable th, String str) {
        zzbsf.zzb(this.zze, this.zzf).zzf(th, str);
    }

    public final void zzv(Boolean bool) {
        synchronized (this.zza) {
            this.zzi = bool;
        }
    }

    public final void zzw(String str) {
        this.zzg = str;
    }

    public final boolean zzx(Context context) {
        if (m.i()) {
            if (((Boolean) a0.c().zzb(zzbar.zzhL)).booleanValue()) {
                return this.zzn.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
