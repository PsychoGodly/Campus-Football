package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import i5.a;
import i5.c;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzavn extends a {
    public static final Parcelable.Creator<zzavn> CREATOR = new zzavo();
    private ParcelFileDescriptor zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    public zzavn() {
        this((ParcelFileDescriptor) null, false, false, 0, false);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 2, zzb(), i10, false);
        c.c(parcel, 3, zzd());
        c.c(parcel, 4, zzf());
        c.n(parcel, 5, zza());
        c.c(parcel, 6, zzg());
        c.b(parcel, a10);
    }

    public final synchronized long zza() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final synchronized ParcelFileDescriptor zzb() {
        return this.zza;
    }

    public final synchronized InputStream zzc() {
        if (this.zza == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.zza);
        this.zza = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized boolean zze() {
        return this.zza != null;
    }

    public final synchronized boolean zzf() {
        return this.zzc;
    }

    public final synchronized boolean zzg() {
        return this.zze;
    }

    public zzavn(ParcelFileDescriptor parcelFileDescriptor, boolean z10, boolean z11, long j10, boolean z12) {
        this.zza = parcelFileDescriptor;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = j10;
        this.zze = z12;
    }
}
