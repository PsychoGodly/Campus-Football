package com.google.android.gms.internal.ads;

import android.os.IBinder;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfle extends zzfly {
    private IBinder zza;
    private String zzb;
    private int zzc;
    private float zzd;
    private int zze;
    private String zzf;
    private byte zzg;

    zzfle() {
    }

    public final zzfly zza(String str) {
        this.zzf = str;
        return this;
    }

    public final zzfly zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzfly zzc(int i10) {
        this.zzg = (byte) (this.zzg | 8);
        return this;
    }

    public final zzfly zzd(int i10) {
        this.zzc = i10;
        this.zzg = (byte) (this.zzg | 2);
        return this;
    }

    public final zzfly zze(float f10) {
        this.zzd = f10;
        this.zzg = (byte) (this.zzg | 4);
        return this;
    }

    public final zzfly zzf(boolean z10) {
        this.zzg = (byte) (this.zzg | 1);
        return this;
    }

    public final zzfly zzg(IBinder iBinder) {
        Objects.requireNonNull(iBinder, "Null windowToken");
        this.zza = iBinder;
        return this;
    }

    public final zzfly zzh(int i10) {
        this.zze = i10;
        this.zzg = (byte) (this.zzg | Ascii.DLE);
        return this;
    }

    public final zzflz zzi() {
        IBinder iBinder;
        if (this.zzg == 31 && (iBinder = this.zza) != null) {
            return new zzflg(iBinder, false, this.zzb, this.zzc, this.zzd, 0, (String) null, this.zze, this.zzf, (zzflf) null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" windowToken");
        }
        if ((this.zzg & 1) == 0) {
            sb2.append(" stableSessionToken");
        }
        if ((this.zzg & 2) == 0) {
            sb2.append(" layoutGravity");
        }
        if ((this.zzg & 4) == 0) {
            sb2.append(" layoutVerticalMargin");
        }
        if ((this.zzg & 8) == 0) {
            sb2.append(" displayMode");
        }
        if ((this.zzg & Ascii.DLE) == 0) {
            sb2.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
