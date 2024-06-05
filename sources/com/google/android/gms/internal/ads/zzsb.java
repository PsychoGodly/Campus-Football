package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzsb extends zzrt {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzgi zzc;

    protected zzsb() {
    }

    /* access modifiers changed from: protected */
    public final void zzA(Object obj, zzsu zzsu) {
        zzdl.zzd(!this.zza.containsKey(obj));
        zzry zzry = new zzry(this, obj);
        zzrz zzrz = new zzrz(this, obj);
        this.zza.put(obj, new zzsa(zzsu, zzry, zzrz));
        Handler handler = this.zzb;
        Objects.requireNonNull(handler);
        zzsu.zzh(handler, zzrz);
        Handler handler2 = this.zzb;
        Objects.requireNonNull(handler2);
        zzsu.zzg(handler2, zzrz);
        zzsu.zzm(zzry, this.zzc, zzb());
        if (!zzt()) {
            zzsu.zzi(zzry);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzj() {
        for (zzsa zzsa : this.zza.values()) {
            zzsa.zza.zzi(zzsa.zzb);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzl() {
        for (zzsa zzsa : this.zza.values()) {
            zzsa.zza.zzk(zzsa.zzb);
        }
    }

    /* access modifiers changed from: protected */
    public void zzn(zzgi zzgi) {
        this.zzc = zzgi;
        this.zzb = zzew.zzD((Handler.Callback) null);
    }

    /* access modifiers changed from: protected */
    public void zzq() {
        for (zzsa zzsa : this.zza.values()) {
            zzsa.zza.zzp(zzsa.zzb);
            zzsa.zza.zzs(zzsa.zzc);
            zzsa.zza.zzr(zzsa.zzc);
        }
        this.zza.clear();
    }

    /* access modifiers changed from: protected */
    public int zzv(Object obj, int i10) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public long zzw(Object obj, long j10) {
        return j10;
    }

    /* access modifiers changed from: protected */
    public zzss zzx(Object obj, zzss zzss) {
        throw null;
    }

    public void zzy() throws IOException {
        for (zzsa zzsa : this.zza.values()) {
            zzsa.zza.zzy();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void zzz(Object obj, zzsu zzsu, zzcn zzcn);
}
