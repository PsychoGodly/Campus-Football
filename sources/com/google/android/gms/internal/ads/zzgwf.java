package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzgwf implements zzamb {
    private static final zzgwq zza = zzgwq.zzb(zzgwf.class);
    protected final String zzb;
    boolean zzc;
    boolean zzd;
    long zze;
    long zzf = -1;
    zzgwk zzg;
    private zzamc zzh;
    private ByteBuffer zzi;
    private ByteBuffer zzj = null;

    protected zzgwf(String str) {
        this.zzb = str;
        this.zzd = true;
        this.zzc = true;
    }

    private final synchronized void zzd() {
        String str;
        if (!this.zzd) {
            try {
                zzgwq zzgwq = zza;
                String str2 = this.zzb;
                if (str2.length() != 0) {
                    str = "mem mapping ".concat(str2);
                } else {
                    str = new String("mem mapping ");
                }
                zzgwq.zza(str);
                this.zzi = this.zzg.zzd(this.zze, this.zzf);
                this.zzd = true;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final void zzb(zzgwk zzgwk, ByteBuffer byteBuffer, long j10, zzaly zzaly) throws IOException {
        this.zze = zzgwk.zzb();
        byteBuffer.remaining();
        this.zzf = j10;
        this.zzg = zzgwk;
        zzgwk.zze(zzgwk.zzb() + j10);
        this.zzd = false;
        this.zzc = false;
        zzg();
    }

    public final void zzc(zzamc zzamc) {
        this.zzh = zzamc;
    }

    /* access modifiers changed from: protected */
    public abstract void zzf(ByteBuffer byteBuffer);

    public final synchronized void zzg() {
        String str;
        zzd();
        zzgwq zzgwq = zza;
        String str2 = this.zzb;
        if (str2.length() != 0) {
            str = "parsing details of ".concat(str2);
        } else {
            str = new String("parsing details of ");
        }
        zzgwq.zza(str);
        ByteBuffer byteBuffer = this.zzi;
        if (byteBuffer != null) {
            this.zzc = true;
            byteBuffer.rewind();
            zzf(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.zzj = byteBuffer.slice();
            }
            this.zzi = null;
        }
    }
}
