package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgll extends zzgqm implements zzgrx {
    /* access modifiers changed from: private */
    public static final zzgll zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgqv zze = zzgqm.zzaM();

    static {
        zzgll zzgll = new zzgll();
        zzb = zzgll;
        zzgqm.zzaT(zzgll.class, zzgll);
    }

    private zzgll() {
    }

    public static zzgli zzd() {
        return (zzgli) zzb.zzaA();
    }

    public static zzgll zzg(InputStream inputStream, zzgpy zzgpy) throws IOException {
        return (zzgll) zzgqm.zzaH(zzb, inputStream, zzgpy);
    }

    public static zzgll zzh(byte[] bArr, zzgpy zzgpy) throws zzgqy {
        return (zzgll) zzgqm.zzaI(zzb, bArr, zzgpy);
    }

    static /* synthetic */ void zzk(zzgll zzgll, zzglk zzglk) {
        zzglk.getClass();
        zzgqv zzgqv = zzgll.zze;
        if (!zzgqv.zzc()) {
            zzgll.zze = zzgqm.zzaN(zzgqv);
        }
        zzgll.zze.add(zzglk);
    }

    public final int zza() {
        return this.zze.size();
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgqm.zzaQ(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzglk.class});
        } else if (i11 == 3) {
            return new zzgll();
        } else {
            if (i11 == 4) {
                return new zzgli((zzglh) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzglk zze(int i10) {
        return (zzglk) this.zze.get(i10);
    }

    public final List zzi() {
        return this.zze;
    }
}
