package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzgwj implements Iterator, Closeable, zzamc {
    private static final zzamb zza = new zzgwi("eof ");
    private static final zzgwq zzb = zzgwq.zzb(zzgwj.class);
    protected zzaly zzc;
    protected zzgwk zzd;
    zzamb zze = null;
    long zzf = 0;
    long zzg = 0;
    private final List zzh = new ArrayList();

    public void close() throws IOException {
    }

    public final boolean hasNext() {
        zzamb zzamb = this.zze;
        if (zzamb == zza) {
            return false;
        }
        if (zzamb != null) {
            return true;
        }
        try {
            this.zze = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zze = zza;
            return false;
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        for (int i10 = 0; i10 < this.zzh.size(); i10++) {
            if (i10 > 0) {
                sb2.append(";");
            }
            sb2.append(((zzamb) this.zzh.get(i10)).toString());
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: zzd */
    public final zzamb next() {
        zzamb zzb2;
        zzamb zzamb = this.zze;
        if (zzamb == null || zzamb == zza) {
            zzgwk zzgwk = this.zzd;
            if (zzgwk == null || this.zzf >= this.zzg) {
                this.zze = zza;
                throw new NoSuchElementException();
            }
            try {
                synchronized (zzgwk) {
                    this.zzd.zze(this.zzf);
                    zzb2 = this.zzc.zzb(this.zzd, this);
                    this.zzf = this.zzd.zzb();
                }
                return zzb2;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        } else {
            this.zze = null;
            return zzamb;
        }
    }

    public final List zze() {
        return (this.zzd == null || this.zze == zza) ? this.zzh : new zzgwp(this.zzh, this);
    }

    public final void zzf(zzgwk zzgwk, long j10, zzaly zzaly) throws IOException {
        this.zzd = zzgwk;
        this.zzf = zzgwk.zzb();
        zzgwk.zze(zzgwk.zzb() + j10);
        this.zzg = zzgwk.zzb();
        this.zzc = zzaly;
    }
}
