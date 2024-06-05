package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.u4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import m5.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbyc {
    /* access modifiers changed from: private */
    public final e zza;
    private final zzbyn zzb;
    private final LinkedList zzc;
    private final Object zzd = new Object();
    private final String zze;
    private final String zzf;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = 0;
    private long zzj = -1;
    private long zzk = -1;

    zzbyc(e eVar, zzbyn zzbyn, String str, String str2) {
        this.zza = eVar;
        this.zzb = zzbyn;
        this.zze = str;
        this.zzf = str2;
        this.zzc = new LinkedList();
    }

    public final Bundle zza() {
        Bundle bundle;
        synchronized (this.zzd) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.zze);
            bundle.putString("slotid", this.zzf);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.zzj);
            bundle.putLong("tresponse", this.zzk);
            bundle.putLong("timp", this.zzg);
            bundle.putLong("tload", this.zzh);
            bundle.putLong("pcc", this.zzi);
            bundle.putLong("tfetch", -1);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                arrayList.add(((zzbyb) it.next()).zzb());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final String zzc() {
        return this.zze;
    }

    public final void zzd() {
        synchronized (this.zzd) {
            if (this.zzk != -1) {
                zzbyb zzbyb = new zzbyb(this);
                zzbyb.zzd();
                this.zzc.add(zzbyb);
                this.zzi++;
                this.zzb.zzd();
                this.zzb.zzc(this);
            }
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            if (this.zzk != -1 && !this.zzc.isEmpty()) {
                zzbyb zzbyb = (zzbyb) this.zzc.getLast();
                if (zzbyb.zza() == -1) {
                    zzbyb.zzc();
                    this.zzb.zzc(this);
                }
            }
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            if (this.zzk != -1 && this.zzg == -1) {
                this.zzg = this.zza.b();
                this.zzb.zzc(this);
            }
            this.zzb.zze();
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zzb.zzf();
        }
    }

    public final void zzh(boolean z10) {
        synchronized (this.zzd) {
            if (this.zzk != -1) {
                this.zzh = this.zza.b();
            }
        }
    }

    public final void zzi() {
        synchronized (this.zzd) {
            this.zzb.zzg();
        }
    }

    public final void zzj(u4 u4Var) {
        synchronized (this.zzd) {
            long b10 = this.zza.b();
            this.zzj = b10;
            this.zzb.zzh(u4Var, b10);
        }
    }

    public final void zzk(long j10) {
        synchronized (this.zzd) {
            this.zzk = j10;
            if (j10 != -1) {
                this.zzb.zzc(this);
            }
        }
    }
}
