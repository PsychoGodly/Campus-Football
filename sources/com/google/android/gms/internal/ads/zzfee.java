package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.ads.internal.t;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfee implements zzfec {
    private final Context zza;
    /* access modifiers changed from: private */
    public long zzb = 0;
    /* access modifiers changed from: private */
    public long zzc = -1;
    /* access modifiers changed from: private */
    public boolean zzd = false;
    /* access modifiers changed from: private */
    public int zze = 0;
    /* access modifiers changed from: private */
    public String zzf = MaxReward.DEFAULT_LABEL;
    /* access modifiers changed from: private */
    public String zzg = MaxReward.DEFAULT_LABEL;
    /* access modifiers changed from: private */
    public String zzh = MaxReward.DEFAULT_LABEL;
    /* access modifiers changed from: private */
    public String zzi = MaxReward.DEFAULT_LABEL;
    /* access modifiers changed from: private */
    public String zzj = MaxReward.DEFAULT_LABEL;
    /* access modifiers changed from: private */
    public String zzk = MaxReward.DEFAULT_LABEL;
    /* access modifiers changed from: private */
    public String zzl = MaxReward.DEFAULT_LABEL;
    private boolean zzm = false;
    private boolean zzn = false;
    /* access modifiers changed from: private */
    public final int zzo;
    /* access modifiers changed from: private */
    public int zzp = 2;
    /* access modifiers changed from: private */
    public int zzq = 2;

    zzfee(Context context, int i10) {
        this.zza = context;
        this.zzo = i10;
    }

    public final synchronized zzfee zzH(int i10) {
        this.zzp = i10;
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfec zza(c3 c3Var) {
        zzq(c3Var);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfec zzb(zzeyn zzeyn) {
        zzr(zzeyn);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfec zzc(String str) {
        zzs(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfec zzd(String str) {
        zzt(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfec zze(String str) {
        zzu(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfec zzf(boolean z10) {
        zzv(z10);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfec zzg(Throwable th) {
        zzw(th);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfec zzh() {
        zzx();
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfec zzi() {
        zzy();
        return this;
    }

    public final synchronized boolean zzj() {
        return this.zzn;
    }

    public final boolean zzk() {
        return !TextUtils.isEmpty(this.zzh);
    }

    public final synchronized zzfeg zzl() {
        if (this.zzm) {
            return null;
        }
        this.zzm = true;
        if (!this.zzn) {
            zzx();
        }
        if (this.zzc < 0) {
            zzy();
        }
        return new zzfeg(this, (zzfef) null);
    }

    public final /* bridge */ /* synthetic */ zzfec zzm(int i10) {
        zzH(i10);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.zzfee zzq(com.google.android.gms.ads.internal.client.c3 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.os.IBinder r3 = r3.f14431f     // Catch:{ all -> 0x0023 }
            if (r3 != 0) goto L_0x0007
            monitor-exit(r2)
            return r2
        L_0x0007:
            com.google.android.gms.internal.ads.zzcuh r3 = (com.google.android.gms.internal.ads.zzcuh) r3     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r3.zzk()     // Catch:{ all -> 0x0023 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x0015
            r2.zzf = r0     // Catch:{ all -> 0x0023 }
        L_0x0015:
            java.lang.String r3 = r3.zzi()     // Catch:{ all -> 0x0023 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0021
            r2.zzg = r3     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r2)
            return r2
        L_0x0023:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfee.zzq(com.google.android.gms.ads.internal.client.c3):com.google.android.gms.internal.ads.zzfee");
    }

    public final synchronized zzfee zzr(zzeyn zzeyn) {
        if (!TextUtils.isEmpty(zzeyn.zzb.zzb)) {
            this.zzf = zzeyn.zzb.zzb;
        }
        Iterator it = zzeyn.zza.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzeyc zzeyc = (zzeyc) it.next();
            if (!TextUtils.isEmpty(zzeyc.zzac)) {
                this.zzg = zzeyc.zzac;
                break;
            }
        }
        return this;
    }

    public final synchronized zzfee zzs(String str) {
        if (((Boolean) a0.c().zzb(zzbar.zzib)).booleanValue()) {
            this.zzl = str;
        }
        return this;
    }

    public final synchronized zzfee zzt(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfee zzu(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfee zzv(boolean z10) {
        this.zzd = z10;
        return this;
    }

    public final synchronized zzfee zzw(Throwable th) {
        if (((Boolean) a0.c().zzb(zzbar.zzib)).booleanValue()) {
            this.zzk = zzbsf.zzd(th);
            this.zzj = (String) zzfoh.zzc(zzfng.zzc(10)).zzd(zzbsf.zzc(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfee zzx() {
        this.zze = t.s().k(this.zza);
        Resources resources = this.zza.getResources();
        int i10 = 2;
        if (resources != null) {
            Configuration configuration = resources.getConfiguration();
            if (configuration != null) {
                i10 = configuration.orientation == 2 ? 4 : 3;
            }
        }
        this.zzq = i10;
        this.zzb = t.b().b();
        this.zzn = true;
        return this;
    }

    public final synchronized zzfee zzy() {
        this.zzc = t.b().b();
        return this;
    }
}
