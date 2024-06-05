package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzako implements Comparable {
    /* access modifiers changed from: private */
    public final zzakz zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzaks zzf;
    private Integer zzg;
    private zzakr zzh;
    private boolean zzi;
    private zzajx zzj;
    private zzakn zzk;
    private final zzakc zzl;

    public zzako(int i10, String str, zzaks zzaks) {
        Uri parse;
        String host;
        this.zza = zzakz.zza ? new zzakz() : null;
        this.zze = new Object();
        int i11 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i10;
        this.zzc = str;
        this.zzf = zzaks;
        this.zzl = new zzakc();
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i11 = host.hashCode();
        }
        this.zzd = i11;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzako) obj).zzg.intValue();
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzw();
        String str = this.zzc;
        Integer num = this.zzg;
        return "[ ] " + str + " " + "0x".concat(valueOf) + " NORMAL " + num;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzajx zzd() {
        return this.zzj;
    }

    public final zzako zze(zzajx zzajx) {
        this.zzj = zzajx;
        return this;
    }

    public final zzako zzf(zzakr zzakr) {
        this.zzh = zzakr;
        return this;
    }

    public final zzako zzg(int i10) {
        this.zzg = Integer.valueOf(i10);
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract zzaku zzh(zzakk zzakk);

    public final String zzj() {
        String str = this.zzc;
        if (this.zzb == 0) {
            return str;
        }
        String num = Integer.toString(1);
        return num + "-" + str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzajw {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzakz.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzakx zzakx) {
        zzaks zzaks;
        synchronized (this.zze) {
            zzaks = this.zzf;
        }
        if (zzaks != null) {
            zzaks.zza(zzakx);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void zzo(Object obj);

    /* access modifiers changed from: package-private */
    public final void zzp(String str) {
        zzakr zzakr = this.zzh;
        if (zzakr != null) {
            zzakr.zzb(this);
        }
        if (zzakz.zza) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzakm(this, str, id2));
                return;
            }
            this.zza.zza(str, id2);
            this.zza.zzb(toString());
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzr() {
        zzakn zzakn;
        synchronized (this.zze) {
            zzakn = this.zzk;
        }
        if (zzakn != null) {
            zzakn.zza(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzs(zzaku zzaku) {
        zzakn zzakn;
        synchronized (this.zze) {
            zzakn = this.zzk;
        }
        if (zzakn != null) {
            zzakn.zzb(this, zzaku);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzt(int i10) {
        zzakr zzakr = this.zzh;
        if (zzakr != null) {
            zzakr.zzc(this, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzu(zzakn zzakn) {
        synchronized (this.zze) {
            this.zzk = zzakn;
        }
    }

    public final boolean zzv() {
        boolean z10;
        synchronized (this.zze) {
            z10 = this.zzi;
        }
        return z10;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzajw {
        return null;
    }

    public final zzakc zzy() {
        return this.zzl;
    }
}
