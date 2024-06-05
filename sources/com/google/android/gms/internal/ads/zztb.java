package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zztb {
    public final int zza;
    public final zzss zzb;
    private final CopyOnWriteArrayList zzc;

    public zztb() {
        this(new CopyOnWriteArrayList(), 0, (zzss) null, 0);
    }

    private zztb(CopyOnWriteArrayList copyOnWriteArrayList, int i10, zzss zzss, long j10) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzss;
    }

    private static final long zzn(long j10) {
        long zzz = zzew.zzz(j10);
        if (zzz == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzz;
    }

    public final zztb zza(int i10, zzss zzss, long j10) {
        return new zztb(this.zzc, 0, zzss, 0);
    }

    public final void zzb(Handler handler, zztc zztc) {
        this.zzc.add(new zzta(handler, zztc));
    }

    public final void zzc(zzso zzso) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzta zzta = (zzta) it.next();
            zzew.zzZ(zzta.zza, new zzsv(this, zzta.zzb, zzso));
        }
    }

    public final void zzd(int i10, zzaf zzaf, int i11, Object obj, long j10) {
        zzc(new zzso(1, i10, zzaf, 0, (Object) null, zzn(j10), -9223372036854775807L));
    }

    public final void zze(zzsj zzsj, zzso zzso) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzta zzta = (zzta) it.next();
            zzew.zzZ(zzta.zza, new zzsw(this, zzta.zzb, zzsj, zzso));
        }
    }

    public final void zzf(zzsj zzsj, int i10, int i11, zzaf zzaf, int i12, Object obj, long j10, long j11) {
        zzsj zzsj2 = zzsj;
        zze(zzsj, new zzso(1, -1, (zzaf) null, 0, (Object) null, zzn(j10), zzn(j11)));
    }

    public final void zzg(zzsj zzsj, zzso zzso) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzta zzta = (zzta) it.next();
            zzew.zzZ(zzta.zza, new zzsz(this, zzta.zzb, zzsj, zzso));
        }
    }

    public final void zzh(zzsj zzsj, int i10, int i11, zzaf zzaf, int i12, Object obj, long j10, long j11) {
        zzsj zzsj2 = zzsj;
        zzg(zzsj, new zzso(1, -1, (zzaf) null, 0, (Object) null, zzn(j10), zzn(j11)));
    }

    public final void zzi(zzsj zzsj, zzso zzso, IOException iOException, boolean z10) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzta zzta = (zzta) it.next();
            zzew.zzZ(zzta.zza, new zzsx(this, zzta.zzb, zzsj, zzso, iOException, z10));
        }
    }

    public final void zzj(zzsj zzsj, int i10, int i11, zzaf zzaf, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
        zzsj zzsj2 = zzsj;
        zzi(zzsj, new zzso(1, -1, (zzaf) null, 0, (Object) null, zzn(j10), zzn(j11)), iOException, z10);
    }

    public final void zzk(zzsj zzsj, zzso zzso) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzta zzta = (zzta) it.next();
            zzew.zzZ(zzta.zza, new zzsy(this, zzta.zzb, zzsj, zzso));
        }
    }

    public final void zzl(zzsj zzsj, int i10, int i11, zzaf zzaf, int i12, Object obj, long j10, long j11) {
        zzsj zzsj2 = zzsj;
        zzk(zzsj, new zzso(1, -1, (zzaf) null, 0, (Object) null, zzn(j10), zzn(j11)));
    }

    public final void zzm(zztc zztc) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzta zzta = (zzta) it.next();
            if (zzta.zzb == zztc) {
                this.zzc.remove(zzta);
            }
        }
    }
}
