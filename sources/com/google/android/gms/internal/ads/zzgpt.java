package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzgpt extends zzgot {
    private static final Logger zza = Logger.getLogger(zzgpt.class.getName());
    /* access modifiers changed from: private */
    public static final boolean zzb = zzgtq.zzA();
    public static final /* synthetic */ int zzf = 0;
    zzgpu zze;

    private zzgpt() {
    }

    /* synthetic */ zzgpt(zzgps zzgps) {
    }

    static int zzA(zzgrw zzgrw, zzgsp zzgsp) {
        int zzat = ((zzgon) zzgrw).zzat(zzgsp);
        return zzE(zzat) + zzat;
    }

    static int zzB(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int zzC(String str) {
        int i10;
        try {
            i10 = zzgtv.zze(str);
        } catch (zzgtu unused) {
            i10 = str.getBytes(zzgqw.zzb).length;
        }
        return zzE(i10) + i10;
    }

    public static int zzD(int i10) {
        return zzE(i10 << 3);
    }

    public static int zzE(int i10) {
        if ((i10 & -128) == 0) {
            return 1;
        }
        if ((i10 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i10) == 0) {
            return 3;
        }
        return (i10 & -268435456) == 0 ? 4 : 5;
    }

    public static int zzF(long j10) {
        int i10;
        if ((-128 & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if ((-34359738368L & j10) != 0) {
            i10 = 6;
            j10 >>>= 28;
        } else {
            i10 = 2;
        }
        if ((-2097152 & j10) != 0) {
            j10 >>>= 14;
            i10 += 2;
        }
        return (j10 & -16384) != 0 ? i10 + 1 : i10;
    }

    public static zzgpt zzG(byte[] bArr) {
        return new zzgpp(bArr, 0, bArr.length);
    }

    public static zzgpt zzH(OutputStream outputStream, int i10) {
        return new zzgpr(outputStream, i10);
    }

    public static int zzw(zzgpe zzgpe) {
        int zzd = zzgpe.zzd();
        return zzE(zzd) + zzd;
    }

    @Deprecated
    static int zzx(int i10, zzgrw zzgrw, zzgsp zzgsp) {
        int zzat = ((zzgon) zzgrw).zzat(zzgsp);
        int zzE = zzE(i10 << 3);
        return zzE + zzE + zzat;
    }

    public static int zzy(int i10) {
        if (i10 >= 0) {
            return zzE(i10);
        }
        return 10;
    }

    public static int zzz(zzgrc zzgrc) {
        int zza2 = zzgrc.zza();
        return zzE(zza2) + zza2;
    }

    public final void zzI() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzJ(String str, zzgtu zzgtu) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzgtu);
        byte[] bytes = str.getBytes(zzgqw.zzb);
        try {
            int length = bytes.length;
            zzs(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgpq(e10);
        }
    }

    public abstract void zzN() throws IOException;

    public abstract void zzO(byte b10) throws IOException;

    public abstract void zzP(int i10, boolean z10) throws IOException;

    public abstract void zzQ(int i10, zzgpe zzgpe) throws IOException;

    public abstract void zza(byte[] bArr, int i10, int i11) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i10, int i11) throws IOException;

    public abstract void zzi(int i10) throws IOException;

    public abstract void zzj(int i10, long j10) throws IOException;

    public abstract void zzk(long j10) throws IOException;

    public abstract void zzl(int i10, int i11) throws IOException;

    public abstract void zzm(int i10) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void zzn(int i10, zzgrw zzgrw, zzgsp zzgsp) throws IOException;

    public abstract void zzo(int i10, String str) throws IOException;

    public abstract void zzq(int i10, int i11) throws IOException;

    public abstract void zzr(int i10, int i11) throws IOException;

    public abstract void zzs(int i10) throws IOException;

    public abstract void zzt(int i10, long j10) throws IOException;

    public abstract void zzu(long j10) throws IOException;
}
