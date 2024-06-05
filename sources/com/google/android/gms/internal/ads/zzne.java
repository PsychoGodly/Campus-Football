package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzne {
    private final zzck zza;
    /* access modifiers changed from: private */
    public zzfqk zzb = zzfqk.zzo();
    private zzfqn zzc = zzfqn.zzd();
    private zzss zzd;
    private zzss zze;
    private zzss zzf;

    public zzne(zzck zzck) {
        this.zza = zzck;
    }

    private static zzss zzj(zzcg zzcg, zzfqk zzfqk, zzss zzss, zzck zzck) {
        zzcn zzq = zzcg.zzq();
        int zzh = zzcg.zzh();
        Object zzf2 = zzq.zzo() ? null : zzq.zzf(zzh);
        int zzc2 = (zzcg.zzA() || zzq.zzo()) ? -1 : zzq.zzd(zzh, zzck, false).zzc(zzew.zzv(zzcg.zzn()));
        for (int i10 = 0; i10 < zzfqk.size(); i10++) {
            zzss zzss2 = (zzss) zzfqk.get(i10);
            if (zzm(zzss2, zzf2, zzcg.zzA(), zzcg.zze(), zzcg.zzf(), zzc2)) {
                return zzss2;
            }
        }
        if (zzfqk.isEmpty() && zzss != null) {
            if (zzm(zzss, zzf2, zzcg.zzA(), zzcg.zze(), zzcg.zzf(), zzc2)) {
                return zzss;
            }
        }
        return null;
    }

    private final void zzk(zzfqm zzfqm, zzss zzss, zzcn zzcn) {
        if (zzss != null) {
            if (zzcn.zza(zzss.zza) != -1) {
                zzfqm.zza(zzss, zzcn);
                return;
            }
            zzcn zzcn2 = (zzcn) this.zzc.get(zzss);
            if (zzcn2 != null) {
                zzfqm.zza(zzss, zzcn2);
            }
        }
    }

    private final void zzl(zzcn zzcn) {
        zzfqm zzfqm = new zzfqm();
        if (this.zzb.isEmpty()) {
            zzk(zzfqm, this.zze, zzcn);
            if (!zzfnp.zza(this.zzf, this.zze)) {
                zzk(zzfqm, this.zzf, zzcn);
            }
            if (!zzfnp.zza(this.zzd, this.zze) && !zzfnp.zza(this.zzd, this.zzf)) {
                zzk(zzfqm, this.zzd, zzcn);
            }
        } else {
            for (int i10 = 0; i10 < this.zzb.size(); i10++) {
                zzk(zzfqm, (zzss) this.zzb.get(i10), zzcn);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzfqm, this.zzd, zzcn);
            }
        }
        this.zzc = zzfqm.zzc();
    }

    private static boolean zzm(zzss zzss, Object obj, boolean z10, int i10, int i11, int i12) {
        if (!zzss.zza.equals(obj)) {
            return false;
        }
        if (z10) {
            if (!(zzss.zzb == i10 && zzss.zzc == i11)) {
                return false;
            }
        } else if (!(zzss.zzb == -1 && zzss.zze == i12)) {
            return false;
        }
        return true;
    }

    public final zzcn zza(zzss zzss) {
        return (zzcn) this.zzc.get(zzss);
    }

    public final zzss zzb() {
        return this.zzd;
    }

    public final zzss zzc() {
        Object obj;
        Object next;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzfqk zzfqk = this.zzb;
        if (!(zzfqk instanceof List)) {
            Iterator it = zzfqk.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else if (!zzfqk.isEmpty()) {
            obj = zzfqk.get(zzfqk.size() - 1);
        } else {
            throw new NoSuchElementException();
        }
        return (zzss) obj;
    }

    public final zzss zzd() {
        return this.zze;
    }

    public final zzss zze() {
        return this.zzf;
    }

    public final void zzg(zzcg zzcg) {
        this.zzd = zzj(zzcg, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, zzss zzss, zzcg zzcg) {
        this.zzb = zzfqk.zzm(list);
        if (!list.isEmpty()) {
            this.zze = (zzss) list.get(0);
            Objects.requireNonNull(zzss);
            this.zzf = zzss;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzcg, this.zzb, this.zze, this.zza);
        }
        zzl(zzcg.zzq());
    }

    public final void zzi(zzcg zzcg) {
        this.zzd = zzj(zzcg, this.zzb, this.zze, this.zza);
        zzl(zzcg.zzq());
    }
}
