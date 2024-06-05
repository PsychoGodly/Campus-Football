package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzyd {
    private final zzxn zza = new zzxn();
    private final zzxz zzb;
    private final zzyc zzc;
    private boolean zzd;
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzyd(Context context) {
        zzxz zzxz;
        zzyc zzyc = null;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i10 = zzew.zza;
            zzxz = zzyb.zzc(applicationContext);
            if (zzxz == null) {
                zzxz = zzya.zzc(applicationContext);
            }
        } else {
            zzxz = null;
        }
        this.zzb = zzxz;
        this.zzc = zzxz != null ? zzyc.zza() : zzyc;
        this.zzk = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    public static /* synthetic */ void zzb(zzyd zzyd, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            zzyd.zzk = refreshRate;
            zzyd.zzl = (refreshRate * 80) / 100;
            return;
        }
        zzee.zze("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        zzyd.zzk = -9223372036854775807L;
        zzyd.zzl = -9223372036854775807L;
    }

    private final void zzk() {
        Surface surface;
        if (zzew.zza >= 30 && (surface = this.zze) != null && this.zzj != Integer.MIN_VALUE && this.zzh != 0.0f) {
            this.zzh = 0.0f;
            zzxy.zza(surface, 0.0f);
        }
    }

    private final void zzl() {
        this.zzm = 0;
        this.zzp = -1;
        this.zzn = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (java.lang.Math.abs(r0 - r10.zzg) >= r2) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r10.zza.zzb() >= 30) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzm() {
        /*
            r10 = this;
            int r0 = com.google.android.gms.internal.ads.zzew.zza
            r1 = 30
            if (r0 < r1) goto L_0x006d
            android.view.Surface r0 = r10.zze
            if (r0 != 0) goto L_0x000b
            goto L_0x006d
        L_0x000b:
            com.google.android.gms.internal.ads.zzxn r0 = r10.zza
            boolean r0 = r0.zzg()
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.zzxn r0 = r10.zza
            float r0 = r0.zza()
            goto L_0x001c
        L_0x001a:
            float r0 = r10.zzf
        L_0x001c:
            float r2 = r10.zzg
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x0023
            return
        L_0x0023:
            r3 = 1
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0058
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.zzxn r1 = r10.zza
            boolean r1 = r1.zzg()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzxn r1 = r10.zza
            long r6 = r1.zzd()
            r8 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L_0x004b
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L_0x004b:
            float r1 = r10.zzg
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0063
            goto L_0x0064
        L_0x0058:
            if (r6 != 0) goto L_0x0068
            com.google.android.gms.internal.ads.zzxn r2 = r10.zza
            int r2 = r2.zzb()
            if (r2 < r1) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r3 = 0
        L_0x0064:
            if (r3 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            return
        L_0x0068:
            r10.zzg = r0
            r10.zzn(r5)
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyd.zzm():void");
    }

    private final void zzn(boolean z10) {
        Surface surface;
        if (zzew.zza >= 30 && (surface = this.zze) != null && this.zzj != Integer.MIN_VALUE) {
            float f10 = 0.0f;
            if (this.zzd) {
                float f11 = this.zzg;
                if (f11 != -1.0f) {
                    f10 = this.zzi * f11;
                }
            }
            if (z10 || this.zzh != f10) {
                this.zzh = f10;
                zzxy.zza(surface, f10);
            }
        }
    }

    public final long zza(long j10) {
        long j11;
        if (this.zzp != -1 && this.zza.zzg()) {
            long zzc2 = this.zza.zzc();
            long j12 = this.zzq + ((long) (((float) (zzc2 * (this.zzm - this.zzp))) / this.zzi));
            if (Math.abs(j10 - j12) > 20000000) {
                zzl();
            } else {
                j10 = j12;
            }
        }
        this.zzn = this.zzm;
        this.zzo = j10;
        zzyc zzyc = this.zzc;
        if (zzyc == null || this.zzk == -9223372036854775807L) {
            return j10;
        }
        long j13 = zzyc.zza;
        if (j13 == -9223372036854775807L) {
            return j10;
        }
        long j14 = this.zzk;
        long j15 = j13 + (((j10 - j13) / j14) * j14);
        if (j10 <= j15) {
            j11 = j15 - j14;
        } else {
            long j16 = j15;
            j15 = j14 + j15;
            j11 = j16;
        }
        long j17 = this.zzl;
        if (j15 - j10 >= j10 - j11) {
            j15 = j11;
        }
        return j15 - j17;
    }

    public final void zzc(float f10) {
        this.zzf = f10;
        this.zza.zzf();
        zzm();
    }

    public final void zzd(long j10) {
        long j11 = this.zzn;
        if (j11 != -1) {
            this.zzp = j11;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zze(j10 * 1000);
        zzm();
    }

    public final void zze(float f10) {
        this.zzi = f10;
        zzl();
        zzn(false);
    }

    public final void zzf() {
        zzl();
    }

    public final void zzg() {
        this.zzd = true;
        zzl();
        if (this.zzb != null) {
            zzyc zzyc = this.zzc;
            Objects.requireNonNull(zzyc);
            zzyc.zzb();
            this.zzb.zzb(new zzxx(this));
        }
        zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzxz zzxz = this.zzb;
        if (zzxz != null) {
            zzxz.zza();
            zzyc zzyc = this.zzc;
            Objects.requireNonNull(zzyc);
            zzyc.zzc();
        }
        zzk();
    }

    public final void zzi(Surface surface) {
        if (true == (surface instanceof zzxv)) {
            surface = null;
        }
        if (this.zze != surface) {
            zzk();
            this.zze = surface;
            zzn(true);
        }
    }

    public final void zzj(int i10) {
        if (this.zzj != i10) {
            this.zzj = i10;
            zzn(true);
        }
    }
}
