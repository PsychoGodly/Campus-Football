package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.common.api.g;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzccu implements g {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzccu(zzcbj zzcbj) {
        Context context = zzcbj.getContext();
        this.zza = context;
        this.zzb = t.r().B(context, zzcbj.zzn().zza);
        this.zzc = new WeakReference(zzcbj);
    }

    static /* bridge */ /* synthetic */ void zze(zzccu zzccu, String str, Map map) {
        zzcbj zzcbj = (zzcbj) zzccu.zzc.get();
        if (zzcbj != null) {
            zzcbj.zzd("onPrecacheEvent", map);
        }
    }

    public void release() {
    }

    public abstract void zzf();

    public final void zzg(String str, String str2, String str3, String str4) {
        zzbyt.zza.post(new zzcct(this, str, str2, str3, str4));
    }

    /* access modifiers changed from: protected */
    public final void zzh(String str, String str2, int i10) {
        zzbyt.zza.post(new zzccr(this, str, str2, i10));
    }

    public final void zzj(String str, String str2, long j10) {
        zzbyt.zza.post(new zzccs(this, str, str2, j10));
    }

    public final void zzn(String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        zzbyt.zza.post(new zzccq(this, str, str2, i10, i11, j10, j11, z10, i12, i13));
    }

    public final void zzo(String str, String str2, long j10, long j11, boolean z10, long j12, long j13, long j14, int i10, int i11) {
        Handler handler = zzbyt.zza;
        zzccp zzccp = r0;
        zzccp zzccp2 = new zzccp(this, str, str2, j10, j11, j12, j13, j14, z10, i10, i11);
        handler.post(zzccp);
    }

    /* access modifiers changed from: protected */
    public void zzp(int i10) {
    }

    /* access modifiers changed from: protected */
    public void zzq(int i10) {
    }

    /* access modifiers changed from: protected */
    public void zzr(int i10) {
    }

    /* access modifiers changed from: protected */
    public void zzs(int i10) {
    }

    public abstract boolean zzt(String str);

    public boolean zzu(String str, String[] strArr) {
        return zzt(str);
    }

    public boolean zzw(String str, String[] strArr, zzccm zzccm) {
        return zzt(str);
    }
}
