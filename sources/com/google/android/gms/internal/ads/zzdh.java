package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdh implements zzde {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzdc zze;
    private zzdc zzf;
    private zzdc zzg;
    private zzdc zzh;
    private boolean zzi;
    private zzdg zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzdh() {
        zzdc zzdc = zzdc.zza;
        this.zze = zzdc;
        this.zzf = zzdc;
        this.zzg = zzdc;
        this.zzh = zzdc;
        ByteBuffer byteBuffer = zzde.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
    }

    public final zzdc zza(zzdc zzdc) throws zzdd {
        if (zzdc.zzd == 2) {
            int i10 = this.zzb;
            if (i10 == -1) {
                i10 = zzdc.zzb;
            }
            this.zze = zzdc;
            zzdc zzdc2 = new zzdc(i10, zzdc.zzc, 2);
            this.zzf = zzdc2;
            this.zzi = true;
            return zzdc2;
        }
        throw new zzdd(zzdc);
    }

    public final ByteBuffer zzb() {
        int zza;
        zzdg zzdg = this.zzj;
        if (zzdg != null && (zza = zzdg.zza()) > 0) {
            if (this.zzk.capacity() < zza) {
                ByteBuffer order = ByteBuffer.allocateDirect(zza).order(ByteOrder.nativeOrder());
                this.zzk = order;
                this.zzl = order.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzdg.zzd(this.zzl);
            this.zzo += (long) zza;
            this.zzk.limit(zza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zzde.zza;
        return byteBuffer;
    }

    public final void zzc() {
        if (zzg()) {
            zzdc zzdc = this.zze;
            this.zzg = zzdc;
            zzdc zzdc2 = this.zzf;
            this.zzh = zzdc2;
            if (this.zzi) {
                this.zzj = new zzdg(zzdc.zzb, zzdc.zzc, this.zzc, this.zzd, zzdc2.zzb);
            } else {
                zzdg zzdg = this.zzj;
                if (zzdg != null) {
                    zzdg.zzc();
                }
            }
        }
        this.zzm = zzde.zza;
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = false;
    }

    public final void zzd() {
        zzdg zzdg = this.zzj;
        if (zzdg != null) {
            zzdg.zze();
        }
        this.zzp = true;
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzdg zzdg = this.zzj;
            Objects.requireNonNull(zzdg);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzn += (long) remaining;
            zzdg.zzf(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzdc zzdc = zzdc.zza;
        this.zze = zzdc;
        this.zzf = zzdc;
        this.zzg = zzdc;
        this.zzh = zzdc;
        ByteBuffer byteBuffer = zzde.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = false;
    }

    public final boolean zzg() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + -1.0f) >= 1.0E-4f || Math.abs(this.zzd + -1.0f) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.zzj;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzh() {
        /*
            r3 = this;
            boolean r0 = r3.zzp
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.zzdg r0 = r3.zzj
            if (r0 == 0) goto L_0x0013
            int r0 = r0.zza()
            if (r0 == 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            r1 = 0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdh.zzh():boolean");
    }

    public final long zzi(long j10) {
        long j11 = this.zzo;
        if (j11 < 1024) {
            return (long) (((double) this.zzc) * ((double) j10));
        }
        long j12 = this.zzn;
        zzdg zzdg = this.zzj;
        Objects.requireNonNull(zzdg);
        long zzb2 = j12 - ((long) zzdg.zzb());
        int i10 = this.zzh.zzb;
        int i11 = this.zzg.zzb;
        if (i10 == i11) {
            return zzew.zzw(j10, zzb2, j11);
        }
        return zzew.zzw(j10, zzb2 * ((long) i10), j11 * ((long) i11));
    }

    public final void zzj(float f10) {
        if (this.zzd != f10) {
            this.zzd = f10;
            this.zzi = true;
        }
    }

    public final void zzk(float f10) {
        if (this.zzc != f10) {
            this.zzc = f10;
            this.zzi = true;
        }
    }
}
