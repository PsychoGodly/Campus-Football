package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.a;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaia  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public abstract class zzaia {
    private static volatile int zze = 100;
    int zza;
    int zzb;
    int zzc;
    zzaij zzd;
    private boolean zzf;

    private zzaia() {
        this.zzb = zze;
        this.zzc = a.e.API_PRIORITY_OTHER;
        this.zzf = false;
    }

    public static int zza(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long zza(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    static zzaia zza(byte[] bArr, int i10, int i11, boolean z10) {
        zzaid zzaid = new zzaid(bArr, i10, i11, z10);
        try {
            zzaid.zzb(i11);
            return zzaid;
        } catch (zzaji e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract double zza() throws IOException;

    public abstract float zzb() throws IOException;

    public abstract int zzb(int i10) throws zzaji;

    public abstract int zzc();

    public abstract void zzc(int i10) throws zzaji;

    public abstract int zzd() throws IOException;

    public abstract void zzd(int i10);

    public abstract int zze() throws IOException;

    public abstract boolean zze(int i10) throws IOException;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract int zzi() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract long zzk() throws IOException;

    public abstract long zzl() throws IOException;

    /* access modifiers changed from: package-private */
    public abstract long zzm() throws IOException;

    public abstract long zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzp() throws IOException;

    public abstract zzahp zzq() throws IOException;

    public abstract String zzr() throws IOException;

    public abstract String zzs() throws IOException;

    public abstract boolean zzt() throws IOException;

    public abstract boolean zzu() throws IOException;
}
