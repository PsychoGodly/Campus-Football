package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.n4;
import com.google.android.gms.ads.nativead.c;
import i5.a;
import n4.b0;
import q4.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbdl extends a {
    public static final Parcelable.Creator<zzbdl> CREATOR = new zzbdm();
    public final int zza;
    public final boolean zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final n4 zzf;
    public final boolean zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;

    public zzbdl(int i10, boolean z10, int i11, boolean z11, int i12, n4 n4Var, boolean z12, int i13, int i14, boolean z13) {
        this.zza = i10;
        this.zzb = z10;
        this.zzc = i11;
        this.zzd = z11;
        this.zze = i12;
        this.zzf = n4Var;
        this.zzg = z12;
        this.zzh = i13;
        this.zzj = z13;
        this.zzi = i14;
    }

    public static c zza(zzbdl zzbdl) {
        c.a aVar = new c.a();
        if (zzbdl == null) {
            return aVar.a();
        }
        int i10 = zzbdl.zza;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    aVar.e(zzbdl.zzg);
                    aVar.d(zzbdl.zzh);
                    aVar.b(zzbdl.zzi, zzbdl.zzj);
                }
                aVar.g(zzbdl.zzb);
                aVar.f(zzbdl.zzd);
                return aVar.a();
            }
            n4 n4Var = zzbdl.zzf;
            if (n4Var != null) {
                aVar.h(new b0(n4Var));
            }
        }
        aVar.c(zzbdl.zze);
        aVar.g(zzbdl.zzb);
        aVar.f(zzbdl.zzd);
        return aVar.a();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = i5.c.a(parcel);
        i5.c.k(parcel, 1, this.zza);
        i5.c.c(parcel, 2, this.zzb);
        i5.c.k(parcel, 3, this.zzc);
        i5.c.c(parcel, 4, this.zzd);
        i5.c.k(parcel, 5, this.zze);
        i5.c.p(parcel, 6, this.zzf, i10, false);
        i5.c.c(parcel, 7, this.zzg);
        i5.c.k(parcel, 8, this.zzh);
        i5.c.k(parcel, 9, this.zzi);
        i5.c.c(parcel, 10, this.zzj);
        i5.c.b(parcel, a10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @Deprecated
    public zzbdl(e eVar) {
        this(4, eVar.f(), eVar.b(), eVar.e(), eVar.a(), eVar.d() != null ? new n4(eVar.d()) : null, eVar.g(), eVar.c(), 0, false);
    }
}
