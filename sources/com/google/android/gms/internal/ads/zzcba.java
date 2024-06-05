package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzcba {
    private static final AtomicInteger zza = new AtomicInteger(0);
    private static final AtomicInteger zzb = new AtomicInteger(0);

    protected static AtomicInteger zzC() {
        return zza;
    }

    protected static AtomicInteger zzD() {
        return zzb;
    }

    public static int zzs() {
        return zza.get();
    }

    public static int zzu() {
        return zzb.get();
    }

    public abstract long zzA();

    public abstract long zzB();

    public abstract void zzE(Uri[] uriArr, String str);

    public abstract void zzF(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10);

    public abstract void zzG();

    public abstract void zzH(long j10);

    public abstract void zzI(int i10);

    public abstract void zzJ(int i10);

    public abstract void zzK(zzcaz zzcaz);

    public abstract void zzL(int i10);

    public abstract void zzM(int i10);

    public abstract void zzN(boolean z10);

    public abstract void zzO(boolean z10);

    public abstract void zzP(int i10);

    public abstract void zzQ(Surface surface, boolean z10) throws IOException;

    public abstract void zzR(float f10, boolean z10) throws IOException;

    public abstract void zzS();

    public abstract boolean zzT();

    public abstract int zzr();

    public abstract int zzt();

    public abstract long zzv();

    public abstract long zzw();

    public abstract long zzx();

    public abstract long zzy();

    public abstract long zzz();
}
