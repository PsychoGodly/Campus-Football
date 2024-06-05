package com.google.android.recaptcha.internal;

import java.io.IOException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public abstract class zzff {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzfg zzc;

    /* synthetic */ zzff(zzfe zzfe) {
    }

    public static int zzF(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long zzG(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    static zzff zzH(byte[] bArr, int i10, int i11, boolean z10) {
        zzfb zzfb = new zzfb(bArr, 0, 0, false, (zzfa) null);
        try {
            zzfb.zze(0);
            return zzfb;
        } catch (zzgy e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract void zzA(int i10);

    public abstract boolean zzC() throws IOException;

    public abstract boolean zzD() throws IOException;

    public abstract boolean zzE(int i10) throws IOException;

    public abstract double zzb() throws IOException;

    public abstract float zzc() throws IOException;

    public abstract int zzd();

    public abstract int zze(int i10) throws zzgy;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract int zzk() throws IOException;

    public abstract int zzl() throws IOException;

    public abstract int zzm() throws IOException;

    public abstract int zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzp() throws IOException;

    public abstract long zzt() throws IOException;

    public abstract long zzu() throws IOException;

    public abstract long zzv() throws IOException;

    public abstract zzez zzw() throws IOException;

    public abstract String zzx() throws IOException;

    public abstract String zzy() throws IOException;

    public abstract void zzz(int i10) throws zzgy;
}
