package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzdf implements zzde {
    protected zzdc zzb;
    protected zzdc zzc;
    private zzdc zzd;
    private zzdc zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzdf() {
        ByteBuffer byteBuffer = zzde.zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        zzdc zzdc = zzdc.zza;
        this.zzd = zzdc;
        this.zze = zzdc;
        this.zzb = zzdc;
        this.zzc = zzdc;
    }

    public final zzdc zza(zzdc zzdc) throws zzdd {
        this.zzd = zzdc;
        this.zze = zzi(zzdc);
        return zzg() ? this.zze : zzdc.zza;
    }

    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zzde.zza;
        return byteBuffer;
    }

    public final void zzc() {
        this.zzg = zzde.zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    public final void zzf() {
        zzc();
        this.zzf = zzde.zza;
        zzdc zzdc = zzdc.zza;
        this.zzd = zzdc;
        this.zze = zzdc;
        this.zzb = zzdc;
        this.zzc = zzdc;
        zzm();
    }

    public boolean zzg() {
        return this.zze != zzdc.zza;
    }

    public boolean zzh() {
        return this.zzh && this.zzg == zzde.zza;
    }

    /* access modifiers changed from: protected */
    public zzdc zzi(zzdc zzdc) throws zzdd {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final ByteBuffer zzj(int i10) {
        if (this.zzf.capacity() < i10) {
            this.zzf = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    /* access modifiers changed from: protected */
    public void zzk() {
    }

    /* access modifiers changed from: protected */
    public void zzl() {
    }

    /* access modifiers changed from: protected */
    public void zzm() {
    }

    /* access modifiers changed from: protected */
    public final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}
