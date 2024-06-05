package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdb {
    private final zzfqk zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private zzdc zzd;
    private zzdc zze;
    private boolean zzf;

    public zzdb(zzfqk zzfqk) {
        this.zza = zzfqk;
        zzdc zzdc = zzdc.zza;
        this.zzd = zzdc;
        this.zze = zzdc;
        this.zzf = false;
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer) {
        boolean z10;
        ByteBuffer byteBuffer2;
        do {
            z10 = false;
            for (int i10 = 0; i10 <= zzi(); i10++) {
                if (!this.zzc[i10].hasRemaining()) {
                    zzde zzde = (zzde) this.zzb.get(i10);
                    if (!zzde.zzh()) {
                        if (i10 > 0) {
                            byteBuffer2 = this.zzc[i10 - 1];
                        } else {
                            byteBuffer2 = byteBuffer.hasRemaining() ? byteBuffer : zzde.zza;
                        }
                        zzde.zze(byteBuffer2);
                        this.zzc[i10] = zzde.zzb();
                        boolean z11 = true;
                        if (((long) byteBuffer2.remaining()) - ((long) byteBuffer2.remaining()) <= 0 && !this.zzc[i10].hasRemaining()) {
                            z11 = false;
                        }
                        z10 |= z11;
                    } else if (!this.zzc[i10].hasRemaining() && i10 < zzi()) {
                        ((zzde) this.zzb.get(i10 + 1)).zzd();
                    }
                }
            }
        } while (z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdb)) {
            return false;
        }
        zzdb zzdb = (zzdb) obj;
        if (this.zza.size() != zzdb.zza.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            if (this.zza.get(i10) != zzdb.zza.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzdc zza(zzdc zzdc) throws zzdd {
        if (!zzdc.equals(zzdc.zza)) {
            for (int i10 = 0; i10 < this.zza.size(); i10++) {
                zzde zzde = (zzde) this.zza.get(i10);
                zzdc zza2 = zzde.zza(zzdc);
                if (zzde.zzg()) {
                    zzdl.zzf(!zza2.equals(zzdc.zza));
                    zzdc = zza2;
                }
            }
            this.zze = zzdc;
            return zzdc;
        }
        throw new zzdd(zzdc);
    }

    public final ByteBuffer zzb() {
        if (!zzh()) {
            return zzde.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzi()];
        if (!byteBuffer.hasRemaining()) {
            zzj(zzde.zza);
        }
        return byteBuffer;
    }

    public final void zzc() {
        this.zzb.clear();
        this.zzd = this.zze;
        this.zzf = false;
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            zzde zzde = (zzde) this.zza.get(i10);
            zzde.zzc();
            if (zzde.zzg()) {
                this.zzb.add(zzde);
            }
        }
        this.zzc = new ByteBuffer[this.zzb.size()];
        for (int i11 = 0; i11 <= zzi(); i11++) {
            this.zzc[i11] = ((zzde) this.zzb.get(i11)).zzb();
        }
    }

    public final void zzd() {
        if (zzh() && !this.zzf) {
            this.zzf = true;
            ((zzde) this.zzb.get(0)).zzd();
        }
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (zzh() && !this.zzf) {
            zzj(byteBuffer);
        }
    }

    public final void zzf() {
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            zzde zzde = (zzde) this.zza.get(i10);
            zzde.zzc();
            zzde.zzf();
        }
        this.zzc = new ByteBuffer[0];
        zzdc zzdc = zzdc.zza;
        this.zzd = zzdc;
        this.zze = zzdc;
        this.zzf = false;
    }

    public final boolean zzg() {
        return this.zzf && ((zzde) this.zzb.get(zzi())).zzh() && !this.zzc[zzi()].hasRemaining();
    }

    public final boolean zzh() {
        return !this.zzb.isEmpty();
    }
}
